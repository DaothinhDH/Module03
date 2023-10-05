package Thuchanh.xaydunglopCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculator calculator = new Calculator();
        System.out.println("Nhập số a");
        double a = input.nextDouble();
        System.out.println("Nhập số b");
        double b = input.nextDouble();

        // đặt giá trị cho 2 thuộc tính đối tượng calculator
        calculator.setA(a);
        calculator.setB(b);
        // hiển thị
        System.out.println("Tổng 2 số là: " +calculator.add());
        System.out.println("Hiệu 2 số là: " +calculator.sub());
        System.out.println("Tích 2 số là: " +calculator.multi());
        System.out.println("Thương của 2 số là: " +calculator.div());

    }
}
