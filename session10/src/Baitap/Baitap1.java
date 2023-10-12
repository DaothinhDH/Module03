package Baitap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baitap1 {
    public static void main(String[] args) {
        List<Integer> listNumbers = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            listNumbers.add ( (int) (Math.random() *99 )+1);
        }
        for (int element : listNumbers) {
            System.out.println(element);
        }
        System.out.println("Phần tử lớn nhất là: " +Collections.max(listNumbers));
    }
}
