package Baitap;

import java.util.ArrayList;
import java.util.List;

public class Daonguocsonguyen {
    public static void main(String[] args) {
        List<Integer> listNumbers = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            listNumbers.add(i);
        }
        System.out.println("danh sách ban đầu: " + listNumbers);
//        Collections.reverse(listNumbers);
//        System.out.println("Danh sách đảo ngược: " +listNumbers);

        List<Integer> reversedList = new ArrayList<>();
        for (int i = listNumbers.size() -1; i >=0 ; i--) {
            reversedList.add(listNumbers.get(i));
        }
        System.out.println("danh sách đảo ngược: " + reversedList);


    }
}
