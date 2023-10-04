package Baitap;

import java.util.Scanner;

public class Bt1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi muốn kiểm tra");
        String chuoi = scanner.nextLine();
        System.out.println("Chuỗi rỗng " +isEmptyString(chuoi) );

    }
    public static boolean isEmptyString(String str){
        return str.isEmpty();
    }
}
