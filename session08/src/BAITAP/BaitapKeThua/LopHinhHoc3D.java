package BAITAP.BaitapKeThua;

public class LopHinhHoc3D extends LopHinhHoc2D {
    private double z;

    public LopHinhHoc3D() {

    }

    public LopHinhHoc3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "lopHinhHoc3D{" +
                "z = " + z +
                "x =  " + getX() +
                "y = " + getY() +
                '}';
    }
}
