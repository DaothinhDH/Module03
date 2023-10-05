package Baitap.Baitap5;

import java.util.Scanner;

public class StudentManagement {

    static  Student []students = new Student[100];
    static int currentIndex=0;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("**********Student Management**********");
            System.out.println("Menu");
            System.out.println("1.Hiển thị tất cả học sinh");
            System.out.println("2.Thêm mới học sinh");
            System.out.println("3.Sửa thông tin học sinh");
            System.out.println("4.Xóa học sinh");
            System.out.println("5.Thoát");
            System.out.println("------------------------------------------");
            System.out.println("Hãy nhập lựa chọn của bạn(1-5)");
            int choice = scanner.nextInt();
            handleselect(choice);
        }
    }

    private static void handleselect(int choice) {
        switch (choice) {
            case 1:
                displayAllStudent();
                break;
            case 2:
                addStudent();
                break;
            case 3:
                editStudent();
                break;
            case 4:
                deleteStudent();
                break;
            default:
                System.exit(1);
        }

    }

    private static void addStudent() {
        Student student = new Student();
        student.inputData(scanner);
        students[currentIndex++] = student;
    }

    private static void deleteStudent() {
        System.out.println("Nhập id của học sinh cần xóa");
        int deleteId = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <currentIndex ; i++) {
            if (students[i].getStudentId() == deleteId) {
                for (int j = 0; j < currentIndex; j++) {
                    students[j]=students[j+1];
                }
                currentIndex--;
                return;
            }
        }
        System.out.println("không tìm thấy học sinh với id vừa nhập");

    }

    private static void displayAllStudent() {
        System.out.println("**Danh sách tất cả học sinh**");
        for (int i = 0; i <currentIndex ; i++) {
            students[i].display();
        }
    }

    private static void editStudent() {
        System.out.println("Nhập id của học sinh muốn sửa");
        int editId = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < currentIndex ; i++) {
            if(students[i].getStudentId() == editId) {
                System.out.println("Thông tin của học sinh mà bạn muốn sửa");
                students[i].display();
                students[i].inputData(scanner);
                System.out.println("Đã cập nhật thông tin thành công");
                return;
            }
        }
        System.out.println("không tìm thấy học sinh với id vừa nhập");
    }
}
