package Thuchanh;

import java.util.Scanner;
// ứng dụng đếm số lượng sinh viên thi đỗ
public class Th6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.println("Nhập kích thước: ");
            size = scanner.nextInt();
            if (size > 30) {
                System.out.println("Kích thước không vượt quá 30");
            }
        } while (size > 30);

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Nhập điểm sinh viên " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }

        int count = 0;
        System.out.println("Danh sách điểm: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
            if (array[j] >= 5 && array[j] <= 10) {
                count++;
            }
        }
        System.out.println("\nSố lượng học sinh đậu: " + count);
    }
}
