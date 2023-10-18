package BaiTap.Baitap2;

import java.util.Arrays;
// Tìm kiếm tuyến tính số nhỏ nhất
public class Bt2 {
    private static int[] getArr(){
        int arr[] = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

    private static int findMin( int [] arr){
        int min = 0;
        for (int i = 0; i < arr.length ; i++) {
            min = arr[i];
        }
        return min;

    }

    public static void main(String[] args) {
        int[] arr = getArr();
        System.out.println("Mảng số nguyên là: " + Arrays.toString(arr));
        int min = findMin(arr);
        System.out.println("Số bé nhất là: " +min);

    }
}
