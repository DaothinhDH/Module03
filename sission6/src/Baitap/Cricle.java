package Baitap;

import java.util.Scanner;

public class Cricle {
    private class  Circle {

    }

    private  double radius;

    private  String color;

    public void Circle(double radius, String color){
        this.radius = radius;
        this.color = color;

    }

    //3.Method
    //3.1 Getters and setters

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }


    public double tinhchuvi(){
        return 2 * Math.PI * this.radius;
    }

    public  double tinhdientich() {
        return  Math.PI * this.radius * this.radius;
    }

    public void displayData() {
        System.out.println("Hình tròn có các thuộc tính là : Bán kính = " + this.radius + ", màu sắc là : " + this.color);
    }
    public void inputData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập bán kình");
        this.radius = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập màu sắc");
        this.color = scanner.nextLine();
    }
}
