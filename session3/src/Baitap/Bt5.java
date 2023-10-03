package Baitap;

import java.util.Arrays;
import java.util.Scanner;
// tìm giá trị nhỏ nhâất trong mảng
public class Bt5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // kích thước
        System.out.println("Nhập kích thước của mảng");
        int size = scanner.nextInt();
        // khởi tạo manảng
        int [] array = new int[size];

        for (int i = 0; i <array.length ; i++) {
            System.out.println("Nhập phân tử của mảng " +(i + 1) + ":");
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));
        int min = array[0];
        for (int i = 0; i <size ; i++) {
            if (min > array[i]){
                min = array[i];
            }
        }
        System.out.println("Gía trị nhỏ nhất là "+min);
    }
}
