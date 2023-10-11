package BAITAP.baitap4;

public class Main {
    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder(2,"Red",3,3,4);
        System.out.println(cylinder1.toString());

        Cylinder cylinder2 = new Cylinder(2,"Red",3,3,4);
        System.out.println(cylinder2.toString());

        cylinder2.setHeight(7.0);
        System.out.println(cylinder2.toString());
    }
}
