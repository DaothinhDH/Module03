package BaiTap.baitap01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arr = {1,2,4,5};
        System.out.println("Nhập vào số muốn tìm");
        int number = scanner.nextInt();
        int low = 0;
        int high = arr.length - 1;
        boolean check = true;
        while (low <= high) {
            int mid = (low + high) /2;
            if (arr[mid] == number){
                System.out.println(number + " ở trong mảng vị trí " + mid + " trong mảng");
                check = false;
                return;
            }
            if (arr[mid] < number){
                low = mid +1;
            }else {
                high = mid - 1;
            }
        }
        if (check){
            System.out.println("Không tồn tại");
        }
    }
}
