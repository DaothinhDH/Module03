package BaiTap.Baitap4;

import java.util.Scanner;
// Tìm kiếm tuyến tính trong mảng số nguyên
public class Bt4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị cần tìm");
        int number = Integer.parseInt(scanner.nextLine());
        boolean check = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > number) {
                System.out.println("Gía trị " + number + "được tìm tại vị trí " + arr[i]);
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy giá trị trong mảng");
        }
    }
}

