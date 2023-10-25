package Baitap.btzalo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
//    tạo 1 class Employee có các trường sau:
//    int id
//    String name
//    boolean status
//    List<Skill> skill;
//    class Skill nó có các trường:
//    String name
//    int yoe
//    Thực hiện ghi 1 danh sách các employee vào file employee.dat
//    Sau khi thực hiện ghi thành công thì thực hiện đọc danh sách này ra và in ra màn hình
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<Skill> skills = new ArrayList<>();
        skills.add(new Skill("aaa",1));
        skills.add(new Skill("bbb",2));
        Employee employee = new Employee(1,"name",true,skills);

        File employeeFile = new File("employee.dat");
        employeeFile.createNewFile();

        /*Ghi vào file empoyle*/
        FileOutputStream fileOutputStream = new FileOutputStream(employeeFile);
        /*Bọc ghi file cho đối tượng obj*/
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(employee); // ghi vào
        objectOutputStream.close();

        /*Lấy ra dữ liệu từ trong file để in ra ngoài màn hinhf*/
        FileInputStream fileInputStream = new FileInputStream(employeeFile);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Employee employee1 = (Employee) objectInputStream.readObject(); // đọc

        System.out.println(employee1);
    }
}
