package Baitap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//  In ra chuỗi có độ dài lớn hơn 3 ký tự
public class Baitap4 {
    public static void main(String[] args) {
        String string = "Rekkei Academy để nông dân biết code";
        List<String> listStrings = Arrays.asList(string.split(" "));
        System.out.println(listStrings);
        for (String st : listStrings) {
            if (st.length() > 3){
                System.out.println(st);
            }
        }
    }
}
