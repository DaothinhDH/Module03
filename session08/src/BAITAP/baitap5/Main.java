package BAITAP.baitap5;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập đọ dài canh 1");
        double side1 = scanner.nextDouble();
        System.out.println("Nhập đọ dài canh 2");
        double side2 = scanner.nextDouble();
        System.out.println("Nhập đọ dài canh 3");
        double side3 = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Nhập màu sắc tam giác");
        String color = scanner.nextLine();
        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        System.out.println("Tam giác có màu là: " + triangle.getColor());
        System.out.println("Diện tích tam giác là: " + triangle.getArea());
        System.out.println("Chu tích tam giác là: " + triangle.getPerimeter());
    }
}
