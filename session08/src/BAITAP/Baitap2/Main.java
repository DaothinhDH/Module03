package BAITAP.Baitap2;

public class Main {
    public static void main(String[] args) {
        double circleArea1 = StaticMethod.calCircleArea(3.5);
        double circleArea2 = StaticMethod.calCircleArea(6);
        System.out.println("Diện tích hình tròn bán kính 3.5 là: " + circleArea1);
        System.out.println("Diện tích hình tròn bán kính 6 là: " + circleArea2);

        double triangleArea1 = StaticMethod.calTriangleArea(3, 4, 5);
        double triangleArea2 = StaticMethod.calTriangleArea(4.5, 7, 6);
        System.out.println("Diện tích tam giác (3, 4, 5) là: " + triangleArea1);
        System.out.println("Diện tích tam giác (4.5, 7, 6) là: " + triangleArea2);

        double rectangleArea = StaticMethod.calRectangleArea(2.5, 6);
        System.out.println("Diện tích hình chữ nhật kích thước (2.5, 6) và (4, 7) là: " + rectangleArea);
    }
}
