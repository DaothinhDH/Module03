package ra.model;

public class Student {
    private int StudentId;
    private String studentName;
    private Classroom classrom;
    private String birthday;
    private String address;
    private boolean gender;
    private String phone;

    public Student(){}
    public Student(int studentId, String studentName, Classroom classrom, String birthday, String address, boolean gender, String phone) {
        StudentId = studentId;
        this.studentName = studentName;
        this.classrom = classrom;
        this.birthday = birthday;
        this.address = address;
        this.gender = gender;
        this.phone = phone;
    }

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Classroom getClassrom() {
        return classrom;
    }

    public void setClassrom(Classroom classrom) {
        this.classrom = classrom;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentId=" + StudentId +
                ", studentName='" + studentName + '\'' +
                ", classrom=" + classrom +
                ", birthday='" + birthday + '\'' +
                ", address='" + address + '\'' +
                ", gender=" + gender +
                ", phone='" + phone + '\'' +
                '}';
    }
}
