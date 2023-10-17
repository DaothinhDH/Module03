package BAITAP.baitap3;

import java.util.TreeMap;

public class Timphantubenhat {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(1,"Một");
        treeMap.put(4,"Bốn");
        treeMap.put(3,"Ba");

        String valueSmall = treeMap.firstEntry().getValue(); // firstEntry dùng để lấy giá trị đầu tiên
        System.out.println("Gía trị bé nhất trong mảng là: " +valueSmall);

    }
}
