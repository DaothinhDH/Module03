package Baitap.baitap3;

public class Main {
    public static void main(String[] args) {
        int [] arr = new int[100000];
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = i+1;
        }

        StopWath stopWath = new StopWath();
        int value;
        for (int i = 0; i < arr.length -1; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[i] < arr[j] ){
                    value = arr[i];
                    arr[i] = arr[j];
                    arr[j] = value;
                }
            }

        }
        stopWath.stop();
        System.out.println("Thời gian thực thi là " +stopWath.getElapsedTime() +" ms");



    }
}
