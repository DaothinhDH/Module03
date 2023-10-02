package BaiTap;

import java.util.Scanner;

public class Bt1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("hãy nhập giá trị đâu của chuỗi");
        int a = scanner.nextInt();
        System.out.println("hãy nhập giá trị cuối của chuỗi");
        int b = scanner.nextInt();
        int sum = 0;


           for (int i = a; i <= b; i++) {
               if (i %2 ==0){
                   sum += i;
               }
           }

        System.out.println("Tổng của chuỗi là" + sum);

    }
}
