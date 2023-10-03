package Thuchanh;

import java.util.Scanner;
// thực hàn tìm giá trị lơớn nhất trong mảng
public class Th3 {
    public static void main(String[] args) {
        int size; // biến lưu kích thước mảng
        int [] array; // khai báo mảng
        Scanner scanner = new Scanner(System.in);

        // nhập kích thước mảng từ bàn phím
        do {
            System.out.println("Nhập kích thước");
            size = scanner.nextInt();
            if (size>20)
                System.out.println("Kích thước không vượt quá 20");
        }while (size>20);

        // khởi tạo mảng với kích thước đã nhập và nhập giá trị cho từng phần tử trong mảng
        array = new int[size];
        int i = 0;
        while (i<array.length){
            System.out.print("Nhập phần tử "+(i+1)+":");
            array[i] = scanner.nextInt();
            i++;
        }

        // in ra mảng vừa nhập
        for (int j=0; j<array.length; j++){
            System.out.print(array[j]+"\t");
        }

        // tìm giá trị lớn nhất trong mảng và in ra vị trí của giá trị đó trong mảng
        int max = array[0];
        int index =1;
        for (int j=0; j<array.length; j++){
            if (array[j]>max){
                max =array[j];
                index = j+1;
            }
        }
        System.out.println("Giá trị lớn nhất trong danh sách là: " +max + " ở vị trí " +index);

    }
}
