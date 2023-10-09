package Baitap.Baitap6;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Employee {
    private int employeeId;
    private String employeeName;
    private int age;
    private boolean gender;
    private double rate;
    private double salary;

    private static int count =1;

    public Employee(){
        this.employeeId = Employee.count++;
    };
    public Employee(int employeeId, String employeeName, int age, boolean gender, double rate, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.age = age;
        this.gender = gender;
        this.rate = rate;
        this.salary = salary;
    }

    public double calSalary(){
       return salary = rate *1300000;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void  inputData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tên nhân viên");
        this.employeeName = scanner.nextLine();
        System.out.println("Nhập vào tuổi nhân viên");
        this.age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào giới tính nhân viên");
        this.gender = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Nhập vào hệ số lương");
        this.rate = Double.parseDouble(scanner.nextLine());
    }
    DecimalFormat formatter = new DecimalFormat("###,###,### VNĐ");
        public void displayData() {
            String output = String.format("Mã nhân viên: %d | Tên nhân viên: %-20s | Tuổi: %d | Giới tính: %-10s | Hệ số lương: %.2f | Lương: %s",
                    employeeId, employeeName, age,( gender ? "Nam":"Nữ"), rate, formatter.format(salary));
            System.out.println(output);
        }

}
