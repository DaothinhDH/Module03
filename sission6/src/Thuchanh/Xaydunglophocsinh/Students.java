package Thuchanh.Xaydunglophocsinh;

import java.util.Scanner;

public class Students {
    int studentId;
    String studentName;
    boolean gender;
    String className;
    int age;
    String  address;

    public Students(int studentId, String studentName, boolean gender, String className, int age, String address) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.gender = gender;
        this.className = className;
        this.age = age;
        this.address = address;
    }

    public Students(){

    }

    @Override
    public String toString() {
        return "Students{" +
                "Mã học sinh: " + studentId +
                ", Tên học sinh: ='" + studentName + '\'' +
                ", Giới tính: " + gender +
                ", Tên Lớp: '" + className + '\'' +
                ", Tuổi: " + age +
                ", Địa chỉ: '" + address + '\'' +
                '}';
    }

    public void inputData (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã học sinh: ");
        this.studentId = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập tên học sinh: ");
        this.studentName = scanner.nextLine();

        System.out.println("Nhập giới tính: ");
        this.gender = Boolean.parseBoolean(scanner.nextLine());

        System.out.println("Nhập tên lớp");
        this.className = scanner.nextLine();

        System.out.println("Nhập số tuổi");
        this.className = scanner.nextLine();

        System.out.println("Nhập địa chỉ");
        this.address = scanner.nextLine();

    }
}
