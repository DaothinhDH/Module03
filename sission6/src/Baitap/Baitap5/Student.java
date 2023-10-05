package Baitap.Baitap5;

import java.util.Scanner;

public class Student {
    private int studentId;
    private String studentName;
    private  int age;
    private boolean gender;
    private  String address;
    private String numberPhone;
    private static int count =1;

    public Student(){
        this.studentId = Student.count++;
    }

    public int getStudentId() {
        return studentId;
    }
    public Student(int studentId, String studentName, int age, boolean gender, String address, String numberPhone) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.numberPhone = numberPhone;
    }


    public void inputData( Scanner scanner){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào tên học sinh");
        this.studentName = scanner.nextLine();
        System.out.println("Nhập vào độ tuổi");
        this.age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào giới tính");
        this.gender = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Nhập vào địa chỉ");
        this.address = scanner.nextLine();
        System.out.println("Nhập vào số điên thoại");
        this.numberPhone = scanner.nextLine();
    }


    public void display() {
        String output = String.format("Mã học sinh: %d | Tên học sinh: %s | Tuổi: %d | Giới tính: %s | Địa chỉ: %s | Số điện thoại: %s",
                studentId, studentName, age, (gender?"Nam":"Nữ"), address, numberPhone);
        System.out.println(output);
    }

}
