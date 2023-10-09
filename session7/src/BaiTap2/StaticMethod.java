package BaiTap2;

public class StaticMethod {
    public static final double PI =3.14;
    // diện tích hình tròn
    public  static final double calCircleArea(double R){
        return  PI * R *R;
    }

    // diện tích hình chữ nhật
    public static final double calRectangleArea(double width,double height){
        return width * height;
    }

    // diện tích tam giác
    public static final double calTriangleArea (double a, double b, double c){
        double p = (a + b + c)/2; // nửa chu vi tam giác
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
