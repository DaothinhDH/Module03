package BAITAP.Sapxeptangdan;


import java.util.Arrays;

import static com.sun.org.apache.bcel.internal.classfile.Utility.printArray;

public class Sapxeptangdan {
    public static void main(String[] args) {
        int[] arr = getArr();
        System.out.println("Mảng trước khi in" + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("Sắp xếp nổi bọt" + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("Sắp xếp chọn" + Arrays.toString(arr));
        intertionSort(arr);
        System.out.println("sắp xếp chèn" + Arrays.toString(arr));

    }

    private static int[] getArr() {
        int arr[] = new int[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

    private static void bubbleSort(int[] arr) { //Thuật toán sắp xếp nổi bọt
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    private static void intertionSort(int[] arr) { //  sắp xếp chèn
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    private static void selectionSort(int[] arr) { // sap xep chon
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int indexMin = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[indexMin]) {
                    indexMin = j;
                }
            }
            // hoán đối giá trị arr[i] và arr[indẽxMin]
            int temp = arr[i];
            arr[i] = arr[indexMin];
            arr[indexMin] = temp;
        }
    }


}
