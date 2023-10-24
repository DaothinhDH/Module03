package ra.view;

import ra.config.Config;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.menu();
    }
    public void menu() {
                Scanner scanner = new Scanner(System.in);
                int choice;
                do {
                    System.out.println("**********************MENU************************");
                    System.out.println("1. Quản lý lớp học");
                    System.out.println("2. Quản lý sinh viên");
                    System.out.println("3. Quản lý môn học");
                    System.out.println("4. Quản lý điểm");
                    System.out.println("0. Thoát");
                    System.out.println("Mời lựa chọn: ");
                    choice =Config.validate();
                    switch (choice) {
                        case 1:
                            new ClassroomView().menu();
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                            break;
                    }
                } while (true);
            }
}