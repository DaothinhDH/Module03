package Baitap;

import java.util.Arrays;
import java.util.Scanner;
// tìm phần tử lớn nhất trong mảng 2 chiều
public class Bt4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // kichs thuoc
        System.out.println("Nhập kích thước của mảng 1");
        int size1 = scanner.nextInt();

        System.out.println("Nhập kích thước mảng 2");
        int size2 = scanner.nextInt();

          // khai tạo mảng 2 chiều
        int[][] arr = new int[size1][size2];
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                System.out.println("Nhập phần tử thứ " + i + "*" + j);
                arr[i][j] = scanner.nextInt();

            }
        }
          // dùng for để in ra
        for (int i = 0; i <size1 ; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
         // dùng for để tìm vị trí max
        int  max = arr[0][0];
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j <size2; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Gía trị lớn nhất là: "+max);

    }
}
