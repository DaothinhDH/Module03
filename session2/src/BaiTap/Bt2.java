package BaiTap;

import java.util.Scanner;
public class Bt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("====Menu====");
            System.out.println("1. Hình chữ nhật");
            System.out.println("2. Hình tam giác vuông, có cạnh góc vuông ở bottom-left");
            System.out.println("3. Hình tam giác vuông, có cạnh góc vuông ở top-left");
            System.out.println("4. Hình tam giác cân");
            System.out.println("0. Thoát chương trình");
            System.out.println("Mời bạn chọn chức năng: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Hình chữ nhật");
                    for (int i = 0; i <= 2; i++) {
                        for (int j = 0; j <= 6; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    System.out.println("Hình tam giác vuông, có cạnh góc vuông ở bottom-left");
                    for (int i = 1; i <= 6; i++) {
                        for (int j = 1; j < i; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    System.out.println("Hình tam giác vuông, có cạnh góc vuông ở top-left");
                    for (int i = 5; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println("");
                    }
                    break;
                case 4:
                    System.out.println("Hình tam giác cân");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 5 - i; j++) {
                            System.out.print("   ");
                        }
                        for (int k = 1; k <= 2 * i - 1; k++) {
                            System.out.print(" * ");
                        }
                        System.out.println("");
                    }
                    break;
                case 0:
                    System.out.println("Thoát chương trình!");
                    break;
                default:
                    System.out.println("Sai chức năng, vui lòng chọn lại!");
                    break;
            }
        }
    }
}
