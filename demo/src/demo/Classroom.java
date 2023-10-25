package demo;

import java.io.Serializable;

public class Classroom implements Serializable {
    private int classroomId;
    private String classroomName;
    private boolean status;

    public Classroom(int classroomId, String classroomName, boolean status) {
        this.classroomId = classroomId;
        this.classroomName = classroomName;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Classroom{" +
                " Mã sản phẩm: -" + classroomId +
                ", Tên sản phẩm: -'" + classroomName + '\'' +
                ", Trạng thái: -" + status +
                '}';
    }
}
