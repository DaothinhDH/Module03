package Baitap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sapxepgiamdan {
    public static void main(String[] args) {
        List<Integer> listNumbers = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            listNumbers.add(i);
        }
        System.out.println("Mảng trước khi sắp xếp: " +listNumbers);

        Collections.sort(listNumbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println("Mảng sau khi sắp xếp giảm dần: " +listNumbers);

        Collections.sort(listNumbers , Collections.reverseOrder());
        System.out.println("Mảng sau khi sắp xếp giảm dần: " +listNumbers);
    }
}
