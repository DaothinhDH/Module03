package fileio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) throws IOException {
        File outputFile = new File ("src/fileio/output.txt");
        outputFile.createNewFile();
        FileWriter fileWriter = new FileWriter(outputFile);
        BufferedWriter writer = new BufferedWriter(fileWriter);
        fileWriter.write("hello java");
        writer.newLine();
        fileWriter.write("hello python");
        writer.close();
    }
}
