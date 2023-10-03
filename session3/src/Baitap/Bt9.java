package Baitap;

import java.util.Scanner;

public class Bt9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] number = {1,2,3,4,5,6,7,8,9,10,11,12};
        int max1 = 0;
        int max2 = 0;
        for (int i = 0; i <number.length ; i++) {
            if(number[i] >max1){
                max2 =max1;
                max1 = number[i];
            }
        }
        System.out.println( "Gía trị phần tử lớn thứ 2 trong mảng là: " +max2);
    }
}
