package BaiTap;

import java.sql.SQLOutput;

public class Bt3 {
    public static void main(String[] args) {
        System.out.println("Hiển thị các số nguyên tố nhỏ hơn 100");
        for (int i = 2; i <= 100; i++) {
            boolean a = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    a = false;
                    break;
                }
            }
            if (a) {
                System.out.print(" "+i);
            }
        }
    }
}
