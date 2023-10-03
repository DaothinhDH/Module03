package Baitap;

import java.util.Arrays;
import java.util.Scanner;
// tính tổng 1 cột xác định
public class Bt6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập kích thước của mảng 1");
        int size1 = scanner.nextInt();
        System.out.println("Nhập kích thước của mảng 2");
        int size2 = scanner.nextInt();
          // nhập phần tử
        int [][]arr = new int[size1][size2];
        for (int i = 0; i <size1 ; i++) {
            for (int j = 0; j < size2; j++) {
                System.out.println("Nhập phần tử thứ " +i + "*" + j);
                arr[i][j] = scanner.nextInt();
            }
        }
          // in ra mảng 2 chiều
        for (int i = 0; i < size1; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        System.out.println("Bạn muốn tính tổng cột bao nhiêu ");
        int colums = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i <size1 ; i++) {
            sum += arr[i][colums];
        }
        System.out.println("TỔNG của cột " + colums + "là " +sum);
    }
}
