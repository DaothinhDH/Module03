package Baitap.Baitap4;

import java.util.Scanner;

public class Fan {
    static final int SLOW =1;
    static final int MEDIUM =2;
    static final int FAST =3;

   private boolean on =false;
    private int speed = SLOW;
    private double radius =5;
    private String color = "blue";

    public Fan() {
    }
    public  Fan(boolean on,int  speed,double radius,String color){
        this.on=on;
        this.speed = speed;
        this.radius=radius;
        this.color=color;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

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

    @Override
    public String toString() {
        return "Fan: " +'\n' +
                "Tình trang: " + (on?"Bật":"Tắt") +'\n' +
                "Tốc độ: " + speed +'\n' +
                "Bán kính: " + radius +'\n' +
                "Màu sắc: '" + color + '\n';

    }

    public  void inputData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập trạng thái true hoặc false");
        this.on = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Nhập tốc độ 1,2,3");
        this.speed = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập bán kính");
        this.radius = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập màu sắc");
        this.color = scanner.nextLine();
    }


}
