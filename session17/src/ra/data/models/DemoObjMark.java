package ra.data.models;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class DemoObjMark {
    public static void main(String[] args) throws IOException {
        List<Mark> marks = new ArrayList<>();
        marks.add(new Mark("java",10));
        marks.add(new Mark("js",10));
        Student student = new Student(1,"Huy",22,true,marks);
        FileOutputStream fileOutputStream = new FileOutputStream("student.dat");
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);

        System.out.println("Thực hiện ghi obj");
        outputStream.writeObject(student);
        outputStream.close();
        System.out.println("Kết thúc ghi obj");

    }
}
