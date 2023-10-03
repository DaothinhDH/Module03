package Baitap;

import java.util.Arrays;
import java.util.Scanner;

public class Bt7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập kích thước của mảng 1");
        int size1 = scanner.nextInt();
        System.out.println("Nhập kích thước của mảng 2");
        int size2 = scanner.nextInt();
        // nhập phần tử
        double [][]arr = new double[size1][size2];
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j <size2 ; j++) {
                System.out.println("Nhập phần tử thứ " +i + "*" +j);
                arr[i][j] = scanner.nextDouble();
            }
        }
        // in ra mảng 2 chiều
        for (int i = 0; i < size1; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        // tính tổng đường chéo chính
        double sum = 0;
        for (int i = 0; i < size1; i++) {
            sum += arr[i][i];
        }
        System.out.println( "Tổng đường chéo chính là: " +sum);


        // tính tổng đường chéo phụ
        int j = size2 -1;
        double tongduongcheophu = 0;
        for (int i = 0; i < size1; i++) {
            tongduongcheophu += arr[i][j];
            j--;
        }
        System.out.println( "Tổng đường chéo phụ là: " +tongduongcheophu);
    }
}
