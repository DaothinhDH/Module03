import java.util.Scanner;

public class Th5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap diem mon toan");
        double maths = scanner.nextDouble();

        System.out.println("Nhap diem mon Ly");
        double physical = scanner.nextDouble();

        System.out.println("Nhap diem mon hoa");
        double chemistry = scanner.nextDouble();

        System.out.println("Nhap diem mon van");
        double literature = scanner.nextDouble();

        System.out.println("Nhap diem mon anh");
        double english = scanner.nextDouble();

        double medium = (maths + physical + chemistry + literature +english) / 5;
        if (medium >= 0 && medium < 5) {
            System.out.println("Xếp loại yếu");
        } else if (medium >= 5 && medium < 6.5) {
            System.out.println("Xếp loại trung bình");
        } else if (medium >= 6.5 && medium < 8) {
            System.out.println("Xếp loại khá");
        } else if (medium >= 8 && medium < 9) {
            System.out.println("Xếp loại giỏi");
        } else if (medium >= 9 && medium <= 10) {
            System.out.println("Xếp loại xuất sắc");
        } else {
            System.out.println("Điểm trung bình không hợp lệ");
        }

    }
}
