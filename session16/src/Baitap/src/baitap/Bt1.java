package baitap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Bt1 {
    public static void main(String[] args) throws IOException {
        String file = "src/baitap/data.txt";
        String fileContent = readFile(file);
        String[] words = fileContent.split(" ");
        int wordCount = words.length;
        System.out.println("Số lượng từ trong file: " + wordCount);
    }

    public static String readFile(String filePath) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = reader.readLine()) != null) {
            sb.append(line);
            sb.append(System.lineSeparator());
        }
        reader.close();
        return sb.toString();
    }
}
