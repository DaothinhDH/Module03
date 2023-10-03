package Thuchanh;

import java.util.Scanner;
// thực hành Đảo ngược phần tử của mảng

public class Th1 {
    public static void main(String[] args) {
        int size; // biến lưu kích thước mảng
        int[] array; // khai báo mảng
        Scanner scanner = new Scanner(System.in);

        // nhập kích thước mảng từ bàn phím
        do {
            System.out.println("Nhập kích thước");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Kích thước không vượt quá 20");
        } while (size > 20);

        // khởi tạo mảng với kích thước đã nhập
        array = new int[size];

        // nhập giá trị cho từng phần tử trong mảng
        int i = 0;
        while(i < array.length) {
            System.out.println("Nhập phần tử " + (i + 1) + ":");
            array[i] = scanner.nextInt();
            i++;
        }

        // in ra mảng trước khi đảo ngược
        System.out.println("Mảng trước khi đảo ngược:");
        for (int j = 0; j < array.length;j++){
            System.out.print(array[j] + "\t");
        }

        // đảo ngược thứ tự các phần tử trong mảng
        for (int j = 0; j < array.length/2;j++){
            int temp = array[j];
            array[j] = array[size-1-j];
            array[size-1-j] = temp;
        }

        // in ra mảng sau khi đảo ngược
        System.out.println("\nMảng sau khi đảo ngược:");
        for(int j=0; j < array.length;j++){
            System.out.print(array[j] + "\t");
        }
    }
}
