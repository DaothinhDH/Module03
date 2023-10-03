package Baitap;

import java.util.Arrays;
import java.util.Scanner;
// thêm 1 phần tử mới vào mảng
public class Bt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập kích thước của mảng");
        int size =  scanner.nextInt();
        scanner.nextLine();

        // khởi tạo mảng
        int [] arr = new int[size];
        // hiển thị
        System.out.println(Arrays.toString(arr));

        // Nhập giá trị cho từng phần tử trong mảng
        for (int i = 0; i < arr.length; i++){
            System.out.println("Nhập phần tử thứ " + (i+1) + ":");
            arr[i] = scanner.nextInt();
        }

       // hiển thị các phần tử trong mảng
        System.out.println("Các phần tử trong mảng: ");
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }

        // nhập giá trị muốn thêm vào mảng
        System.out.println("Nhập giá trị muốn thêm vào");
        int newValue = scanner.nextInt();
         // tăng lên 1
        int [] newArray = new int [size +1];

        for (int i = 0; i < arr.length; i++){
            newArray[i] = arr[i];
        }
        // gán giá trị
        newArray [newArray.length -1] = newValue;
        System.out.println("Mảng mới" + Arrays.toString(newArray));
    }
}
