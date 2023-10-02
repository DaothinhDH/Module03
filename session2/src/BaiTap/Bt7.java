package BaiTap;

import java.util.Scanner;

public class Bt7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice !=0){
            System.out.println("====Menu====");
            System.out.println("1.Chu vi v diện tích hình chữ nhật");
            System.out.println("2.Chu vi và diện tich hình tam giác");
            System.out.println("3.Chu vi và diện tích hình tròn");
            System.out.println("Mời bạn chọn chức năng ");
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.println("====Chu vi và diện tích hình chữ nhật");
                    System.out.println("Mời bạn nhập chiều dài");
                    int chieudai = scanner.nextInt();
                    System.out.println("Mời bạn nhập chiều rộng");
                    int chieurong = scanner.nextInt();

                    int chuvi = (chieudai + chieurong)*2;
                    int dientich = chieudai * chieurong;
                    System.out.println("Chu vi là " +chuvi +"===" +"Diện tích là "+dientich);
                  break;
                case 2:
                    System.out.println("======Chu vi và diện tích hình tam giác");
                    System.out.println("Mời bạn nhập độ dài cạnh a");
                    double a = scanner.nextDouble();
                    System.out.println("Mời bạn nhập độ dài cạnh b");
                    double b = scanner.nextDouble();
                    System.out.println("Mời bạn nhập độ dài cạnh c");
                    double c =  scanner.nextDouble();

                    double chuvitamgiac = a + b + c;
                    double p = chuvitamgiac/2;
                    double dientichtamgiac = Math.sqrt(p*(p-a)*(p-b)*(p-c));
                    System.out.println(" Diện tích tam giác " +dientichtamgiac + "==" + "Chu vi tam giác"+chuvitamgiac);
                    break;
                case 3:
                    System.out.println("Chu vi và diện tích hình tròn");
                    System.out.println("Mời bạn nhập bán kính");
                    double r = scanner.nextDouble();
                    double pi = 3.14;
                    double chuviht = Math.round(2 * pi * r);
                    double dientichht = Math.round(pi * r * r);
                    System.out.println("Chu vi hình tròn là " + chuviht + "===" + "Diện tích hình tròn là " + dientichht);
                    break;

            }
        }
    }
}
