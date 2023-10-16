package Baitap;

import java.util.Scanner;
import java.util.Stack;

//Viết chương trình sử dụng stack để kiểm tra xem một chuỗi đầu vào có cặp dấu ngoặc đúng hay không.
public class Kiemtramotchuoi {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
           System.out.println("Nhập chuỗi đầu vào");
           String str = scanner.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    System.out.println("Không có cặp ngoặc");
                    return;
                }
                char openB = stack.pop();
                if (!isMatchingBracket(openB,ch)) {
                    System.out.println("Không đủ cặp ngoặc");
                    return;
                }
            }

        }
        boolean check = stack.isEmpty();
        if (check) {
            System.out.println("Đủ cặp ngoặc");
        } else {
            System.out.println("Không đủ cặp ngoặc");
        }

    }

    public static boolean isMatchingBracket(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }
}
