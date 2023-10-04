package Thuchanh;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Th2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regexAccount = "^[_a-z0-9]{6,}$";
        System.out.println("Nhập tài khoản");

        do {
            String account = scanner.nextLine();
            boolean ValidateAccount = Pattern.matches(regexAccount, account);
            if (ValidateAccount){
                System.out.println("Tài khoản của bạn là: " + account);
            }else {
                System.out.println("Không đúng định dạng");
            }
        }while (true);
    }
}
