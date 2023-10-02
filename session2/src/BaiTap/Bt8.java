package BaiTap;

import java.util.Scanner;

public class Bt8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true){
            System.out.println("Hãy nhập cạnh a");
            int a = scanner.nextInt();
            System.out.println("Hãy nhập cạnh b");
            int b = scanner.nextInt();
            System.out.println("Hãy nhập cạnh c");
            int c = scanner.nextInt();

            if (a>0 && b>0 && c>0){
                if(a+b >c && a+c >b && b+c>a){
                    double chuvitamgiac = a + b + c;
                    double p = chuvitamgiac/2;
                    double dientichtamgiac = Math.sqrt(p*(p-a)*(p-b)*(p-c));
                    System.out.println(" Diện tích tam giác " +dientichtamgiac + "==" + "Chu vi tam giác"+chuvitamgiac);
                }else {
                    System.out.println("Đây không phải hình tam giác");
                }
            }else {
                System.out.println("Không phải hình tam giác");
            }
        }
    }
}
