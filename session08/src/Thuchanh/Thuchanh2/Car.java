package Thuchanh.Thuchanh2;

public class Car extends  Vehicle {
    public Car() {
    }

    public Car(String brand, String color) {
        super(brand, color);
    }


    @Override
    public String toString() {
        return "Car{" +
                "Brand: " +this.getBrand() + '\'' +
                "Color: '" + this.getColor() +'\'' +
                "} ";

    }
}
