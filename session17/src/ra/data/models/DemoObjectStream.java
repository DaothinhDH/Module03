package ra.data.models;

import java.io.*;

public class DemoObjectStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("Ghi vào file student.dat");
        FileOutputStream fileOutputStream = new FileOutputStream("student.dat");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        Student student = new Student(1,"anh",22,true);
        objectOutputStream.writeObject(student);
        fileOutputStream.close();
        System.out.println("Ghi thành công");
        System.out.println("Thực hiện đọc file");
        FileInputStream fileInputStream = new FileInputStream("student.dat");
        ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
        Student student1 = (Student) inputStream.readObject();
        System.out.println(student1);
        inputStream.close();
        System.out.println("kêt thúc đọc file");
    }
}
