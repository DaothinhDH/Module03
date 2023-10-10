package Thuchanh.Thuchanh2;

public class Motorcycle extends Vehicle {

    public Motorcycle() {
    }

    public Motorcycle(String brand, String color) {
        super(brand, color);
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "Brand: " + this.getBrand() + '\'' +
                "Color: '" + this.getColor() +'\'' +
                "} ";
    }
}
