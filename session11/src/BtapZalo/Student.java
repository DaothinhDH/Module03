package BtapZalo;

public class Student {
    private int id;
    private String name;
    private int age;
    private boolean status;
    private static int count = 1;


    public Student() {
    }

    public Student(String name, int age, boolean status) {
        this.id = count++;
        this.name = name;
        this.age = age;
        this.status = status;
    }


    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student" + id + "{" + '\'' +
                "id: " + id + '\'' +
                "name: '" + name + '\'' +
                "age: " + age + '\'' +
                "status: " + status + '\'' + '\n';
    }
}
