package BaiTap;

import java.util.Scanner;

public class Bt4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng số bạn muốn in");
        int number = scanner.nextInt();
        int count =0;
        for (int i = 2; count < number; i++) {
            boolean check = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }

            }
            if (check) {
                count++;
                System.out.println(number +" số nguyên tố đầu tiên là " +i);
            }


        }

    }
}
