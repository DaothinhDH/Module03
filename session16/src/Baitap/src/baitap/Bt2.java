package baitap;

import javax.jws.soap.SOAPBinding;
import java.io.*;

public class Bt2 {
    public static void main(String[] args) throws IOException {
        File filePath = new File("src/Baitap/src/Bt2.txt");
        filePath.createNewFile();
        FileWriter filewriter = new FileWriter(filePath);
        filewriter.write("hello world!");
        filewriter.write("hello java!");
        filewriter.close();
        int lineCount = countLines(String.valueOf(filePath));
        System.out.println("Số dòng trong file: " + lineCount);


    }

    public static int countLines(String filePath){
        int count = 0;
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            while (br.readLine() != null){
                count ++;
            }
        }catch (IOException e){
            System.out.println("Đã xảy ra lỗi khi đọc file: " + e.getMessage());
        }
        return count;
    }
}
