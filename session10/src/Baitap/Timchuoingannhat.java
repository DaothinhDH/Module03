package Baitap;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Timchuoingannhat {
    public static void main(String[] args) {
        String string = "Th class String includes methods or examining individual characters of the sequence, or comparing strings";
        List<String> list = Arrays.asList(string.split(" "));
        System.out.println(list);
        List<String> list2 = new ArrayList<>();
        int min = string.length();
        for (String s : list) {
            if (s.length() < min){
                min = s.length();
            }
        }
        for (String s2 : list){
            if (s2.length() == min){
                System.out.println(s2);
                list2.add(s2);
            }
        }
        System.out.println(list2);


    }
}
