package Baitap;

import java.util.Arrays;
import java.util.Scanner;
// xoá phần tử
public class Baitap1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập kích thước mảng
        System.out.println("Nhập số lượng phần tử vào mảng:");
        int size = Integer.parseInt(scanner.nextLine());

        // Khởi tạo mảng với kích thước đã nhập
        int[] arr = new int[size];

        // Hiển thị mảng rỗng ban đầu
        System.out.println(Arrays.toString(arr));

        // Nhập giá trị cho từng phần tử trong mảng
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập phần tử thứ " + (i+1) + ":");
            arr[i] = Integer.parseInt(scanner.nextLine());
        }

        // Hiển thị các phần tử trong mảng
        System.out.println("Các phần tử trong mảng:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Nhập giá trị cần xoá
        System.out.println("\nNhập vào số cần xóa:");
        int x = scanner.nextInt();

        // Tìm vị trí của giá trị cần xoá trong mảng
        int index_del = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                index_del = i;
                break;
            }
        }

        // Nếu không tìm thấy giá trị cần xoá, hiển thị mảng ban đầu
        if (index_del == -1) {
            System.out.println(Arrays.toString(arr));
        } else { // Nếu tìm thấy giá trị cần xoá, tạo một mảng mới không chứa phần tử đó
            int[] newarray = new int[size];
            for (int i = 0; i < newarray.length; i++) {
                if (i != index_del) {
                    newarray[i] = arr[i];
                }
            }
            System.out.println(Arrays.toString(newarray));
        }
    }
}