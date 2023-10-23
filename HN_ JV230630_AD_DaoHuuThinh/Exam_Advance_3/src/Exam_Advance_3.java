import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exam_Advance_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> queue = new LinkedList<>();
        String menu = "****************JAVA-HACKATHON-05-ADVANCE-1-MENU***************\n" +
                "1. Nhập tên phụ huynh nộp hồ sơ\n" +
                "2. Phụ huynh tiếp theo\n" +
                "3. Thoát\n";
        int choice;
        do {
            System.out.println(menu);
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    System.out.print("Nhập tên phụ huynhh: ");
                    String name = scanner.nextLine();
                    queue.add(name);
                    System.out.println("***Đã thêm tên phụ huynhd vào danh sách***");
                    break;
                case 2:
                    if (!queue.isEmpty()) {
                        String nextParent = queue.peek();
                        queue.poll();
                        System.out.println("Phụ huynh đầu tisên trong danh sách: " + nextParent);
                    } else {
                        System.out.println("Danh sách trống.");
                    }
                    break;
                case 3:
                    System.out.println("Kết thúc chương trình");
                    return;
                default:
                    System.out.println("Chức năng không hợp lệ! Vui lòng nhập lạii");
                    break;
            }

        } while (true);
    }
}
