package BtapZalo;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
       while (true){
           System.out.println("Nhập vào tên");
           String name = scanner.nextLine();
           System.out.println("Nhập vào tuổi");
           int age = Integer.parseInt(scanner.nextLine());
           System.out.println("Nhập trạng thái");
           boolean status = Boolean.parseBoolean(scanner.nextLine());
           Student newStudent = new Student(name, age,status);
           students.add(newStudent);
          Collections.sort(students, new Comparator<Student>() {
              @Override
              public int compare(Student o1, Student o2) {
                  return o1.getName().compareTo(o2.getName());
              }
          });
           System.out.print(students);
       }



    } 
}
