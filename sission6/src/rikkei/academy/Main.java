package rikkei.academy;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.inputData();
        System.out.println(rectangle);
        System.out.println("Diện tích: "+rectangle.tinhdientich() +" Chu Vi: " + rectangle.tinhchuvi());

    }
}
