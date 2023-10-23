import java.util.Scanner;
import java.util.Stack;

public class Exam_Advance_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        String menu = "****************JAVA-HACKATHON-05-ADVANCE-1-MENU***************\n" +
                "1. 1. Nhập câu\n" +
                "2. Đảo ngược câu\n" +
                "3. Thoát\n";
        int choice;
        String string = "";
        do {
            System.out.println(menu);
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Nhập câu: ");
                    string = scanner.nextLine();
                    break;
                case 2:
                    String[] words = string.split(" ");
                    System.out.println("Câu sau khi đảo ngược: ");
                    for (int i = words.length - 1; i >= 0; i--) {
                        System.out.print(words[i] + " ");
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Kết thúc chương trính");
                    break;
                default:
                    System.out.println("Chức năng không hợp lệ ! Vui Lòng nhập lại");
                    break;
            }
        } while (choice != 3);
    }



}
