package Thuchanh;

import java.util.Scanner;

public class Th3 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập vào năm");
        int year = scanner.nextInt();

        if (year %4 ==0){
            if (year %100 ==0){
                if (year %400==0){
                    System.out.println("Đây là năm nhận"+year);
                }else {
                    System.out.println("ĐÂY không phải năm nhuận"+year);
                }
            }else {
                System.out.println("Đây là năm nhuận"+year);
            }
        }else {
            System.out.println("Đây không phải năm nhuận " +year);
        }
    }
}
