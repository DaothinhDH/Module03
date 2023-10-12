package Baitap.Baitap4;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle("white", 7.0, 9.0);
        Shape circle = new Circle("black", 5.0);

        System.out.println("Diện tích hình chữ nhật: " + rectangle.getArea());
        rectangle.display();
        System.out.println("Diện tích hình tròn: " + circle.getArea());
        circle.display();
    }
}
