package BAITAP.baitap1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Demsolanxuathien {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 4, 5, 4, 3};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int number : arr) {
            if (map.containsKey(number)) {
                int count = map.get(number);
                map.put(number,count+1);
            }else {
                map.put(number,1);
            }
        }
        System.out.println(map);

        for (int key: map.keySet()) {
            int count = map.get(key);
            System.out.println("Phần tử thứ " +key + " xuất hiện: " +count + " Lần");

        }
    // cách sử dụng 2 vòng for
//        int[] arr = {1, 2, 3, 2, 1, 4, 5, 4, 3,2,2};
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < arr.length; i++) {
//            int count = 0;
//            for (int j = 0; j < arr.length; j++) {
//                if (arr[i] == arr[j]) {
//                    count++;
//                }
//            }
//            map.put(arr[i], count);
//        }
//        System.out.println(map);


    }
}





