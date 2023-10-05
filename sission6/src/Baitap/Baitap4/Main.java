package Baitap.Baitap4;

public class Main {
    public static void main(String[] args) {
       Fan fan1 = new Fan(false,Fan.SLOW,5,"blue");
       Fan fan2 = new Fan(true,Fan.MEDIUM,6,"green");
        System.out.println(fan1);
        System.out.println(fan2);
        Fan fan3 = new Fan();
        fan3.inputData();
        System.out.println(fan3);
    }
}
