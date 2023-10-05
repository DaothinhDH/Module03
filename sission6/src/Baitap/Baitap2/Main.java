package Baitap.Baitap2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số a");
        double a = scanner.nextDouble();

        System.out.println("Nhập số b");
        double b = scanner.nextDouble();

        System.out.println("Nhập số c");
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double delta = quadraticEquation.getDiscriminant();

        if (delta>0){
            System.out.println("Phương trình có 2 nghiệm");
            System.out.println("Nghiệm 1: " +quadraticEquation.getRoot1());
            System.out.println("Nghiệm 2: " +quadraticEquation.getRoot2() );

        }else if(delta == 0) {
            System.out.println("Phương trình có 1 nghiệm duy nhất: "+quadraticEquation.getRoot1());
        }else {
            System.out.println("Phương trình vô nghiệm");
        }

    }

}
