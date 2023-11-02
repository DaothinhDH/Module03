package view.acount;

import ra.config.Validate;
import ra.model.RoleName;
import ra.model.Users;
import sevice.user.IUserService;
import sevice.user.UserServiceIMPL;

import static ra.config.Color.*;
import static ra.config.Color.RESET;

public class UserManagerment {
    IUserService userService = new UserServiceIMPL();

    public void menuUser() {
        int choice;
        do {
//            System.out.println("\nXin chao: "+ Home.userLogin.getName());
            System.out.println(PURPLE + "╔═════════════════════════════════════════════════════════════════════════════════════╗");
            System.out.println("║                               MENU User                                             ║");
            System.out.println("╠════╦════════════════════════════════════════════════════════════════════════════════╣");
            System.out.println("║  1.║                       Hiển thị danh sách người dùng                            ║");
            System.out.println("╠════╬════════════════════════════════════════════════════════════════════════════════╣");
            System.out.println("║  2.║                       Tìm kiếm người dùng theo tên                             ║");
            System.out.println("╠════╬════════════════════════════════════════════════════════════════════════════════╣");
            System.out.println("║  3.║                       Block/Unblock tài khoản người dùng                       ║");
            System.out.println("╠════╬════════════════════════════════════════════════════════════════════════════════╣");
            System.out.println("║  4.║                       Thay đổi quyền truy cập tài khoản                        ║");
            System.out.println("╠════╬════════════════════════════════════════════════════════════════════════════════╣");
            System.out.println("║  0.║                       Quay lại                                                 ║");
            System.out.println("╚════╩════════════════════════════════════════════════════════════════════════════════╝" + RESET);

            System.out.print(YELLOW + "Lựa chọn (0/1/2): " + RESET);
            choice = Integer.parseInt(Validate.validateString());
            switch (choice) {
                case 1:
                    showUser();
                    break;
                case 2:
                    seachUser();
                    break;
                case 3:
                    hideUser();
                    break;
                case 4:
                    roleUser();
                case 0:
                    return;
                default:
                    System.out.println(RED + "lựa chọn không hợp lệ vui lòng nhập lại" + RESET);
                    break;
            }

        } while (true);
    }

    private void roleUser() {
        System.out.println("Nhập ID tài để thay đổi quyền truy cập");
        int idRole = Validate.validateInt();
        Users users = userService.findById(idRole);
        if (users != null) {
            System.out.println("1. admin");
            System.out.println("2. User");
            int choice = Validate.validateInt();
            switch (choice) {
                case 1:
                    users.setRole(RoleName.ADMIN);
                    break;
                case 2:
                    users.setRole(RoleName.USER);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
            userService.save(users);

        }
    }

    private void showUser() {
        System.out.println("Tất cá người dùng");
        for (Users users : userService.findAll()) {
            System.out.println(users);
        }
    }

    private void hideUser() {
        System.out.println("Nhập ID người dùng muốn khóa/mở");
        int idUser = Validate.validateInt();
        Users users = userService.findById(idUser);
        if (users != null) {
            System.out.println("1.Khóa tài khoản");
            System.out.println("2.Mở Tài khoản");
            int choice = Validate.validateInt();
            switch (choice) {
                case 1:
                    if (users.isStatus()) {
                        users.setStatus(false);
                        userService.update(users);
                        System.out.println("Tài khoản đã được khóa thành công");
                    } else {
                        System.out.println("Tài khoản này đã được khóa");
                    }
                    break;
                case 2:
                    if (users.isStatus()) {
                        users.setStatus(true);
                        userService.update(users);
                        System.out.println("Tài khoản đã được mở khóa thành công");
                    } else {
                        System.out.println("Tài khoản này đã được mở khóa trước đó");
                    }
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ");
                    break;
            }
        }
    }

    private void seachUser() {
        System.out.println("Nhập từ khóa tìm kiếm");
        String seachUser = Validate.validateString();
        int count = 0;
        for (Users users : userService.findAll()) {
            if (users.getUsername().toLowerCase().contains(seachUser)) {
                System.out.println(users);
                count++;
            }
        }
        System.out.printf("Tìm thấy %d người dùng theo từ khóa vừa nhập", count);
    }

}

































