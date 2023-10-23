package Baitap;

import javax.jws.soap.SOAPBinding;

public class TimSoLonNhat {
    public static void main(String[] args) {
        int []arr = {6,4,9,8,7};
        try {
           int max = findMax(arr);
            System.out.println("Max: " + max);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static int findMax(int[] arr) throws Exception {
        if (arr.length == 0) {
            throw new Exception("Mảng rỗng");
        }
        int max = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
