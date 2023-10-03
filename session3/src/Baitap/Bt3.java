package Baitap;

import java.util.Arrays;
import java.util.Scanner;
// gộp 2 mảng lại thành 1 mảng mới
public class Bt3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
          // nhập kích thước
        System.out.println("Nhập kích thước của mảng 1");
        int size1 = scanner.nextInt();
        scanner.nextLine();
        // khởi tạo mảng
        int [] arr1 = new int[size1];

        for (int i = 0; i <arr1.length ; i++) {
            System.out.println("Nhập phần tử của mảng 1 là " + (i + 1) + ": ");
            arr1[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr1));

        System.out.println("Nhập kích thước mảng 2");
        int size2 = scanner.nextInt();
        scanner.nextLine();
        int []arr2 = new int[size2];

        for (int i = 0; i < arr2.length; i++){
            System.out.println("Nhập phần tử của mảng 2 là " +(i+1)+ ": ");
            arr2[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr2));


        int [] arr3 = new int[arr1.length + arr2.length];
        int j =0;

        for (int i = 0; i <arr1.length ; i++) {
            arr3[j]= arr1[i];
            j++;
        }
        for (int i = 0; i < (arr2.length); i++) {
            arr3[j]= arr2[i];
            j++;
        }

        System.out.println(Arrays.toString(arr3));
    }
}
