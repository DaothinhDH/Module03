package BaiTap2;

public class Main {
    public static void main(String[] args) {
        double circleArea1 = StaticMethod.calCircleArea(6);
        System.out.println("Diện tích hình tròn là: " + circleArea1);
        double circleArea = StaticMethod.calCircleArea(3.5);
        System.out.println("Diện tích hình tròn là: " + circleArea);
        System.out.println("*******************************************");
        double calRectangleArea = StaticMethod.calRectangleArea(2.5,6);
        System.out.println("Diện tích hình chữ nhật là: " + calRectangleArea);
        double calRectangleArea1 = StaticMethod.calRectangleArea(4,7);
        System.out.println("Diện tích hình chữ nhật là: " + calRectangleArea1);
        System.out.println("**********************************************");
        double calTriangleArea = StaticMethod.calTriangleArea(3,4,5);
        System.out.println("Diên tích hình tam giác là" + calTriangleArea);
        double calTriangleArea1 = StaticMethod.calTriangleArea(4.5,7,6);
        System.out.println("Diên tích hình tam giác là" + calTriangleArea1);
    }
}
