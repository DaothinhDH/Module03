package Baitap.Baitap1;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes [0] = new Circle(5.2);
        shapes [1] = new Rectangle(7,8);
        shapes [2] = new Square(9);
        for (Shape shape : shapes) {
            double percent = Math.round(Math.random() * 99) +1;
            shape.resize(percent);
            System.out.println(shape);
        }
//        //Hình tròn
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập bán kính");
//        double radius = scanner.nextDouble();
//        Circle circle = new Circle(radius);
//        System.out.println("Diện tích là: " + circle.getArea());
//        System.out.println("Chu vi là: " + circle.getPerimeter());
//        double percent = Math.random() * 98 + 1;
//        circle.resize(percent);
//        System.out.println("Sau khi thay đổi kích thước diện tích là: " + circle.getArea());
//        System.out.println("sau khi thay đổi kích thước chu vi là: " + circle.getPerimeter());
//        System.out.println("********************************************************************");
//        System.out.println("********************************************************************");
//        // Hình chữ nhật
//        System.out.println("Nhập chiều dài");
//        int length = scanner.nextInt();
//        System.out.println("Nhập chiều rộng");
//        int width = scanner.nextInt();
//        Rectangle rectangle = new Rectangle(length, width);
//        System.out.println("Diện tích hình chư nhật là: " + rectangle.getArea());
//        System.out.println("Chu vi hình chữ nhật là: " + rectangle.getPerimeter());
//        double percent1 = Math.random() * 98 + 1;
//        rectangle.resize(percent);
//        System.out.println("Sau khi tăng kích thước diện tích HCN: " + rectangle.getArea());
//        System.out.println("Sau khi tăng chu vi: " + rectangle.getPerimeter());
//        System.out.println("**************************************************************");
//        System.out.println("***************************************************************");
//        // hình vuông
//        System.out.println("Nhập độ dài cạnh hình vuông");
//        int a = scanner.nextInt();
//        Square square = new Square(a);
//        System.out.println("Chu vi hình vuông là: " + square.getArea());
//        System.out.println("Diện tích hình vuông: " + square.getArea());
//        square.resize(percent);
//        double percent2 = Math.random() * 98 + 1;
//        System.out.println("Chu vi sau khi tăng kích thước: " + square.getArea());
//        System.out.println("Diện tích sau khi tăng kích thước: " + square.getPerimeter());
//
//        System.out.println("==============================================================");
//        System.out.println("==========================BÀI TẬP 2============================");
//        System.out.println("Diện tích hình vuông: " + square.getArea());
//        if (square.isFilled()) {
//            square.howToColor();
//        }


    }
}
