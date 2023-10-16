import java.util.Stack;

public class DemoStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println("Pop giá trị: " + stack.pop() +" ra khỏi satck ");
        System.out.println("Gía trị ở đỉnh stack đang là " + stack.peek());
        System.out.println("Pop giá trị: " + stack.pop() +" ra khỏi satck ");
        System.out.println("Pop giá trị: " + stack.pop() +" ra khỏi satck ");

        System.out.println(stack.isEmpty() ? "Stack rỗng" : " Stack có phần tử");


    }
}
