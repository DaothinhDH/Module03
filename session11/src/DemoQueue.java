import sun.misc.Queue;

import java.util.PriorityQueue;

public class DemoQueue {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.offer("1");
        queue.offer("2");
        queue.offer("3");
        queue.offer("4");

        System.out.println("Poll phần tử " +queue.poll() + " trong queue");
        System.out.println("Poll phần tử " +queue.poll() + " trong queue");
        System.out.println("Poll phần tử " +queue.poll() + " trong queue");
        System.out.println("Peek phần tử " +queue.peek() + " trong queue");

    }

}
