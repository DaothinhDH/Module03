package demo;

import javafx.scene.effect.Light;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Classroom> classroomList = new ArrayList<>();
        WriteReadFile writeFile = new WriteReadFile();
//        classroomList = writeFile.readFile(writeFile.PATH_CLASS);
        classroomList.add(new Classroom(1,"Ten0",true));
        classroomList.add(new Classroom(2,"Ten1",true));
        classroomList.add(new Classroom(3,"Ten2",true));
        writeFile.writeFile(writeFile.PATH_CLASS,classroomList);

        for (Classroom classroom : classroomList) {
            System.out.println(classroom);
        }
        classroomList.remove(1);
        System.out.println("chuong trinh chay tiep");

    }
}
