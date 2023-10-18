package BaiTap.Baitap1;

import java.util.Arrays;
// Tìm kiếm tuyến tính số lơn nhất
public class Bt1 {
    private static int[] getArr(){
        int arr[] = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

    private static int findMax(int [] arr){
        int max = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;

    }

    public static void main(String[] args) {
        int []arr = getArr();
        System.out.println("Mảng số nguyên là: " + Arrays.toString(arr));
        int max = findMax(arr);
        System.out.println("Số lớn nhất là: " +max);


    }
}
