package view;

import ra.config.Config;
import ra.config.Validate;
import ra.model.RoleName;
import ra.model.Users;
import sevice.user.UserServiceIMPL;
import sevice.user.IUserService;
import view.acount.AdminManager;
import view.acount.UserManager;
import static ra.config.Color.*;


public class Home {
    IUserService userService = new UserServiceIMPL();

    Config <Users> config = new Config<>();
    public void menuHome() {
        do {
            System.out.println("DANH SÁCH NGƯỜI DÙNG");
            System.out.println();
            for (Users users : userService.findAll()) {
                System.out.println(users);
            }
            System.out.println(PURPLE +"╔══════════════════════╗");
            System.out.println("║       MENU           ║");
            System.out.println("╠══════════════════════╣");
            System.out.println("║      1. Login        ║");
            System.out.println("║      2. Register     ║");
            System.out.println("║      0. Thoat        ║");
            System.out.println("╚══════════════════════╝");
            System.out.print(YELLOW +"Lựa chọn (0/1/2): " +RESET);

            switch (Validate.validateInt()) {
                case 1:
                    login();
                    break;
                case 2:
                    register();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        } while (true);
    }

    private void login() {
        System.out.println(PURPLE +"╔══════════════════════╗");
        System.out.println("║     FORM LOGIN       ║");
        System.out.println("╠══════════════════════╣");
        System.out.print("║Nhap ten tai khoan:   ║");
        System.out.println("                      ");
        System.out.println("╠══════════════════════╣");
        System.out.print("║ Nhap mat khau:       ║");
        System.out.println("                      ");
        System.out.println("╚══════════════════════╝" +RESET);
        String username = Validate.validateString();
        String pass = Validate.validateString();
        Users users = userService.checkLogin(username,pass);
        //kiem tra
        if (users == null){
            System.out.println(RED +"Sai ten tai khoan hoac mat khau" +RESET);
        }else {
            //dung ten tk voi mk
            if (users.getRole().equals(RoleName.ADMIN)){
                config.writeFile(Config.URL_USER_LOGIN,users); // ghi đối tượng Users đang đăng nhập vào file
                // chuyen den trang quanr ly ADMIN
                System.out.println("Dang nhap thanh cong");
                new AdminManager().menuAmin();
            }else {
                if (users.isStatus()){
                    config.writeFile(Config.URL_USER_LOGIN,users); // ghi đối tượng Users đang đăng nhập vào file
                    // chuyen den trang user
                    System.out.println("Dang nhap thanh cong");
                    new UserManager().menuUser();
                }else {
                    System.out.println("Tai khoan cua ban dang bi khoa");
                }
            }
        }
    }

    private void register() {
        System.out.println("*** FORM REGISTER ***");
        Users users = new Users();
        users.setId(userService.getNewId());
        System.out.println("Id: "+users.getId());
        System.out.println("Nhap ho ten: ");
        users.setName(Validate.validateString());
        System.out.println("Nhap ten tai khoan");
        while (true){
            String username = Validate.validateString();
            if (userService.existUsername(username)){
                System.out.println("Ten dang nhap da ton tai moi nhap lai");
            }else {
                users.setUsername(username);
                break;
            }
        }
        System.out.println("Nhap mat khau");
        users.setPassword(Validate.validateString());
        System.out.println("Nhap lai mat khau");
        while (true){
            String repeatPass = Validate.validateString();
            if (users.getPassword().equals(repeatPass)){
                break;
            }else {
                System.out.println("Mat khau khong khop moi nhai lai");
            }
        }
        System.out.println("Nhap email");
        while (true){
            String email = Validate.validateEmail();
            if (userService.existEmail(email)){
                System.out.println("Email da ton tai moi nhap lai");
            }else {
                users.setEmail(email);
                break;
            }
        }
        userService.save(users);
        System.out.println("Tao tai khoan thanh cong");

    }

    public void checkRolelogin(Users user) {
        if (user.getRole() == RoleName.ADMIN) {
            new Config<Users>().writeFile(Config.URL_USER_LOGIN, user); // ghi vào file
            System.out.println("XIN CHÀO, "+user.getUsername());
            new AdminManager().menuAmin();
        } else {
            if (user.isStatus()) {
                new Config<Users>().writeFile(Config.URL_USER_LOGIN, user); // ghi vào file
                System.out.println("XIN CHÀO, "+user.getUsername());
                new UserManager().menuUser();
            } else {
                System.out.println("Tài khoản của bạn đang bị khóa.");
            }
        }
    }
}