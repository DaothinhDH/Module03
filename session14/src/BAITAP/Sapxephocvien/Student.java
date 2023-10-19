package BAITAP.Sapxephocvien;

import java.util.Scanner;

public class Student {
    private int StudentId;
    private String StudentName;
    private double Score;
    private int count;

    public Student(){}
    public Student(int studentId, String studentName, double score) {
        StudentId = count++;
        StudentName = studentName;
        Score = score;
    }

    public double getScore() {
        return Score;
    }

    public void setScore(double score) {
        Score = score;
    }

    public void inputData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tên");
        this.StudentName = scanner.nextLine();
        System.out.println("Nhập vaò điểm");
        this.Score = Double.parseDouble(scanner.nextLine());
    }

    @Override
    public String toString() {
        return "\n" +
                "Mã số: " + StudentId +" Tên học sinh: " + StudentName  + " Điểm: " + Score +  "\n";
    }


}
