package Thuchanh.Thuchanh2;

public class Main {
    public static void main(String[] args) {
        // khởi tạo các đối tượng từ các lớp con
        Car car1 = new Car("Thương hiệu 1","Black");
        Motorcycle motorcycle = new Motorcycle("Thương hiệu 2","yellow");
        System.out.println(motorcycle);
        // truy cập các phương thức của lớp cha như set/get
        System.out.println("Xe 1 thương hiệu là: " + car1.getBrand());
        car1.setColor("White"); // thiết lập giá trị cho thuộc tính color
        // hiển thị thông tin của xe oto
        System.out.println(car1.toString());
        System.out.println(motorcycle.toString());
        

    }
}
