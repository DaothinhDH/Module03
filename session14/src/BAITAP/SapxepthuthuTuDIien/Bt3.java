package BAITAP.SapxepthuthuTuDIien;

import java.util.Arrays;

public class Bt3 {
    static String[] arr = {"banana", "apple", "orange", "grape", "pear"};
    public static void main(String[] args) {
        System.out.println("Mảng ban đầu " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("Mảng sau khi sắp xếp nổi bọt: " + Arrays.toString(arr));
        intertionSort(arr);
        System.out.println("Mảng sau khi sắp xếp chèn: " + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("Mảng sau khi sắp xếp chọn: " + Arrays.toString(arr));


    }

    private static void bubbleSort(String [] arr) { //Thuật toán sắp xếp nổi bọt
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    private static void intertionSort(String[] arr) { //  sắp xếp chèn
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            String key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    private static void selectionSort(String[] arr) { // sap xep chon
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int indexMin = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j].compareTo(arr[indexMin]) < 0 ) {
                    indexMin = j;
                }
            }
            // hoán đối giá trị arr[i] và arr[indẽxMin]
            String temp = arr[i];
            arr[i] = arr[indexMin];
            arr[indexMin] = temp;
        }
    }


}
