package BaiTap.Baitap3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// Tìm kiếm số bất kỳ trong mảng 2 chiều
public class Bt3 {
    private static int[][] getArr(){
        int arr[][] = new int[20][20];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }

        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào sôs bất kì");
        int number = Integer.parseInt(scanner.nextLine());
        boolean check = false;
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        int[][] arr = getArr();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if (number == arr[i][j]){
                    check = true;
                    list1.add(i);
                    list2.add(j);
                }
            }

        }
        
        if (check){
            System.out.println("Các vị trí  xuất hiện của số " +number + "  là");
            for (int i = 0; i <list1.size() ; i++) {
                System.out.println(list1.get(i) + "," + list2.get(i));
            }
        }else {
            System.out.println("Không có số " +number + "trong mảng.");
        }
    }
}
