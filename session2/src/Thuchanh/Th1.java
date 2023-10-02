package Thuchanh;

import java.util.Scanner;

public class Th1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so a");
        double a = scanner.nextDouble();
        System.out.println("Nhap so b");
        double b = scanner.nextDouble();
        System.out.println("Nhap so c");
        double c = scanner.nextDouble();

        if (a !=0) {
            double x =(c-b)/a;  // phuong trinh cos nghiem duy nhat x = (c-b)/a;
            System.out.println(x);

        }else { // truong hop a=0
            if (b==c) { // neu b =c --->phuong trinh vo nghiem
                System.out.println("phuong trinh vo nghiem");

            }

        }

    }
}
