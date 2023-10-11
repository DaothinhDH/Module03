package BAITAP.baitap3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       User student = new Student("SV001","Username","123456","Mon toan");
        Scanner scanner = new Scanner(System.in);
        boolean isLogin = false;
        while (!isLogin){
            System.out.println("Nhap vao tai khoan");
            String username = scanner.nextLine();
            System.out.println("Nhap vao mat khau");
            String password = scanner.nextLine();
            if(student.login(username, password)){
                student.displayData();
                isLogin = true;
            }
        }
    }
}

