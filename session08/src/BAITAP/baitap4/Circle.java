package BAITAP.baitap4;

public class Circle {
   private double radius;
   private String color;
   private double ara;
   public Circle(){
       this.radius = 1.0;
       this.color = "red";
       this.ara = Math.PI * radius * radius;
   }

    public Circle(double radius, String color, double ara) {
        this.radius = radius;
        this.color = color;
        this.ara = Math.PI * radius * radius;
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

    public double getAra() {
        return ara;
    }

    public void setAra(double ara) {
        this.ara = ara;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius: " + radius +
                ", color: '" + color + '\'' +
                ", ara: " + ara +
                '}';
    }
}
