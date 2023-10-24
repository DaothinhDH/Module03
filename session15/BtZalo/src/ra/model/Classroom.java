package ra.model;

public class Classroom {
    private static int newId = 1;

    private int classroomId;
    private String classroomName;
    private boolean status;

    public Classroom(){
        this.classroomId = newId++;
    }

    public Classroom(int classroomId, String classroomName, boolean status) {
        this.classroomId = newId++;
        this.classroomName = classroomName;
        this.status = status;
    }

    public int getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(int classroomId) {
        this.classroomId = classroomId;
    }

    public String getClassroomName() {
        return classroomName;
    }

    public void setClassroomName(String classroomName) {
        this.classroomName = classroomName;
    }

    public static int getNewId() {
        return newId;
    }

    public static void setNewId(int newId) {
        Classroom.newId = newId;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Classrom{" +
                "classroomId=" + classroomId +
                ", classroomName='" + classroomName + '\'' +
                ", status=" + status +
                '}';
    }
}
