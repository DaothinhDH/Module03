package view.acount;
import static ra.config.Color.*;
import ra.config.Validate;
import view.Home;

public class UserManager {
    public void menuUser() {
        do {
//            System.out.println("\nXin chao: "+ Home.userLogin.getName());
            System.out.println(PURPLE+"╔══════════════════════════════════╗");
            System.out.println("║             MENU USER            ║");
            System.out.println("╠════╦═════════════════════════════╣");
            System.out.println("║ 1. ║ Hiển thị danh sách sản phẩm ║");
            System.out.println("╠════╬═════════════════════════════╣");
            System.out.println("║ 2. ║ Tìm kiếm sản phẩm theo tên  ║");
            System.out.println("╠════╬═════════════════════════════╣");
            System.out.println("║ 3. ║ Thay đổi mật khẩu           ║");
            System.out.println("╠════╬═════════════════════════════╣");
            System.out.println("║ 0. ║ Log out                     ║");
            System.out.println("╚════╩═════════════════════════════╝" );
            System.out.print(YELLOW +"Lựa chọn (0/1/2): " +RESET);


            switch (Validate.validateInt()) {

                case 0:
//                    Home.userLogin = null;
                    new Home().menuHome();
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        } while (true);
    }
}