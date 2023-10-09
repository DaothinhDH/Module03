package Baitap1;

public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        System.out.println("Giá trị ban đầu của myString: " +obj.getMyString());
        obj.setMyString("abcdegh");
        System.out.println("Gía trị mới: " +obj.getMyString());
    }
}
