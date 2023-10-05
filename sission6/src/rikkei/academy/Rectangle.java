package rikkei.academy;

import java.util.Scanner;

public class Rectangle {
     int width;
     int height;
     String color;

     // constructor
    public Rectangle(int width, int height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public Rectangle(){

    }

    public int tinhdientich (){
        return  this.width * this.height;
    }

    public  int tinhchuvi(){
        return (this.height + this.width) * 2;
    }

    @Override
    public String toString() {
        return "rectangle{" +
                "Chiều rộng: " + width +
                ", Chiều dài: " + height +
                ", Màu sắc: '" + color + '\'' +
                '}';
    }

    public void inputData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài");
        this.width = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập chiều rộng");
        this.height = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập màu sắc");
        this.color = scanner.nextLine();
    }

}
