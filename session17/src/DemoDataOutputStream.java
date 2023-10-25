import ra.data.models.Student;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoDataOutputStream {
    public static void main(String[] args) throws IOException {
        File studentFile = new File("dataOutput.dat");
        studentFile.createNewFile();
        Student student = new Student(1,"Nam",20,true);
        boolean status = true;
        double Pi = 3.14;
        String language = "Java";
        FileOutputStream fos = new FileOutputStream(studentFile);

        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeUTF(language); // ghi language vào trong file studentfile
        dos.writeDouble(Pi);
        dos.writeBoolean(status);

        dos.close();


    }
}
