package BAITAP.baitap2;

import java.util.TreeMap;

public class Timphantulonthu2 {
    public static void main(String[] args) {
        int [] arr = {9,8,1,2,3,4,5,6,7,8};
        TreeMap<Integer,Integer> treeMap = new TreeMap<>();
        for (int number : arr) {
            treeMap.put(number,0);
        }
        treeMap.remove(treeMap.lastKey()); // xóa phần tử lớn nhất
        int seconds = treeMap.lastKey(); // lastKey lấy giá trị cuối cùng 8
        System.out.println("Phần tử lớn thứ 2 trong mảng là: " +seconds);

    }
}
