package BaiTap;

import java.util.Scanner;

public class Bt5 {
    public static void main(String[] args) {
        int n =1;
        while (true){
            if (n%5 ==0 && n%7 ==0 && n%11 ==0){
                System.out.println("Gía trị cần tìm là "+n);
                break;
            }
            n++;
        }

    }
}
