package Baitap;

import java.util.Scanner;

public class TinhTongSoNguyen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        try {
            System.out.println("Nhập số a");
            int a = scanner.nextInt();
            System.out.println("Nhập số b");
            int b = scanner.nextInt();
            sum = a + b;
            System.out.println("Tổng của 2 số là: "+sum);
        }catch (Exception e) {
            System.out.println("Lỗi: Bạn phải nhập vào 1 số  nguyên ! Hãy nhập lại");
            scanner.nextLine();
            main(args);

        }
    }
}
