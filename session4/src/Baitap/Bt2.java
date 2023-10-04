package Baitap;

import java.util.Scanner;

public class Bt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String chuoi = "Daothinh";
        System.out.println("Nhập chuoi muon kiem tra");
        String chuoi2 = scanner.nextLine();
        System.out.println("Chuỗi 2 có giống chuỗi 1 " + equalsString(chuoi, chuoi2));
    }

    public static boolean equalsString(String str, String str2) {
        return str.equals(str2);
    }
}
