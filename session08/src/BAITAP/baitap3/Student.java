package BAITAP.baitap3;

public class Student extends User {
    private String subject;
    public Student() {
    }

    public Student(String id, String name, String password, String subject) {
        super(id, name, password);
        this.subject = subject;
    }

    @Override
    public void displayData() {
        super.displayData();
        System.out.println("subject: " + subject);
    }

    public  void  displayData(String message){
        System.out.println(message);
        displayData();
    }
}
