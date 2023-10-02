package Thuchanh;

import java.util.Scanner;

public class Th4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập vào cân nặng");
         double weight = Double.parseDouble(scanner.nextLine());
        System.out.println("Hãy nhập vào chiều cao");
        double height = Double.parseDouble(scanner.nextLine());

        double bmi = weight/Math.pow(height,2);
        if (bmi<18)
            System.out.println("Thiếu cân"+bmi);
        else if (bmi <25.0)
            System.out.println("Bình thường"+bmi);
        else if (bmi <30.0)
            System.out.println("Thừa cân"+bmi);
        else
            System.out.println("Béo phì"+bmi);

    }
}
