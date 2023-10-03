package Thuchanh;

import java.sql.SQLOutput;
import java.util.Scanner;
// thực hành chuyển đổi nhệt độ
public class Th4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;
        do {
            System.out.println("===Menu===");
            System.out.println("1. Chuyển đổi từ độ F sang độ C");
            System.out.println("2. Chuyển đổi từ độ C sang độ F");
            System.out.println("0. Thoát");
            System.out.println("Lựa chọn: ");
            choice = input.nextInt();
            switch(choice){
                case 1:{
                    System.out.println("Nhập độ F: ");
                    fahrenheit = input.nextDouble();
                    System.out.println("Độ F sang độ C: " + fahrenheitToCelsius(fahrenheit));
                    break;
                }
                case 2:{
                    System.out.println("Nhập độ C: ");
                    celsius = input.nextDouble();
                    System.out.println("Độ C sang độ F: " + celciusToFahrenheit(celsius));
                    break;
                }
                case 0:
                    System.exit(0);
            }
        }while (choice !=0);
    }


    public static double celciusToFahrenheit(double celcius) {
        double fahrenheit = (9.0/5)*celcius + 32;
        return fahrenheit;
    }


    public static double fahrenheitToCelsius(double fahrenheit) {
        double celcius = (5.0/9)*(fahrenheit - 32);
        return celcius;
    }
}


