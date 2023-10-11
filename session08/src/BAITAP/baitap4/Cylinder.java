package BAITAP.baitap4;

public class Cylinder extends Circle {
    private double height;
    private double volume;

    public Cylinder(double radius, String color, double ara, double height, double volume) {
        super(radius, color, ara);
        this.height = height;
        this.volume = volume;
    }

    public Cylinder(){
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius: " + getRadius() + " |" +
                " color: " + getColor() + " |" +
                " area: " + getRadius() + " |" +
                " height: " + height + " |" +
                " volume: " + volume + " |" +
                "} " + super.toString();
    }
}
