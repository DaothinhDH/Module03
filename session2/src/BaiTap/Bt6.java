package BaiTap;

import java.util.Scanner;

public class Bt6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice !=0){
            System.out.println(" ============Menu==========");
            System.out.println("1.Kiểm tra chẵn lẻ");
            System.out.println("2.Kiểm tra số nguyên tố");
            System.out.println("3.Kiểm tra số chia hết cho 3");
            System.out.println("Mời bạn chọn chức năng");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("========kiểm tra chẵn lẻ=======");
                    System.out.println("Mời bạn nhập số muốn kiểm tra");
                    int number = scanner.nextInt();
                    if(number %2 ==0){
                        System.out.println(number+" Là số chắn");
                    }else {
                        System.out.println( number+" Là số lẻ");
                    }
                    break;

                case 2:
                    System.out.println("========kiểm tra số nguyên tố====");
                    System.out.println("Mời bạn nhập số");
                    int a = scanner.nextInt();
                    boolean check = true;
                    for (int i = 2; i < a; i++) {
                        if (a % i ==0){
                            check = false;
                            break;
                        }
                    }
                    if (check){
                        System.out.println(a + " Là số nguyên tố");
                    }else {
                        System.out.println(a + " Không phải là số nguyên tố");
                    }
                    break;

                case 3:
                    System.out.println("=========kiểm tra số chia hết cho 3========");
                    System.out.println("Mời bạn nhập số");
                    int b = scanner.nextInt();
                    if(b%3 == 0){
                        System.out.println(b+"Chia hết cho 3");
                    }else {
                        System.out.println(b+"Không chia hết cho 3");
                    }
            }

        }
    }
}
