package Baitap;

import java.util.Scanner;

public class Bt8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String chuoi = "Xin chao Viet Nam";
        System.out.println("Nhập ký tự muốn tìm kiếm");
        char kytu = scanner.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i <chuoi.length() ; i++) {
            if (chuoi.charAt(i) == kytu){
                count++;
            }
        }
        System.out.println("Ký tự " +kytu + "xuất hiện " +count + " lần");
    }
}
