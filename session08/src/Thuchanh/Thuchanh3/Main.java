package Thuchanh.Thuchanh3;

public class Main {
    public static void main(String[] args) {
//        kiểm thử class Shape
        System.out.println("----------SHAPE----------");
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red",false);
        System.out.println(shape);
        // kiểm thứ class Circle
        System.out.println("------------CIRCLE------------");
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(3.5);
        System.out.println(circle);
        circle = new Circle(3.5,"inđigo",false);
        System.out.println(circle);
    }
}
