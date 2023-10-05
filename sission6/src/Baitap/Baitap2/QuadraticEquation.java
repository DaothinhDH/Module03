package Baitap.Baitap2;

public class QuadraticEquation {
    private  double a;
    private double b;
    protected double c;

    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public  QuadraticEquation(){

    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant(){
        return  Math.pow(b, 2) - 4 * a * c;
    }

    public double getRoot1() {
        double delta = getDiscriminant();
        if(delta <0){
            return 0;
        }else{
            return (-b + Math.sqrt(delta)) / (2 * a);
        }
    }

    public double getRoot2() {
        double delta = getDiscriminant();
        if (delta <0){
            return 0;
        }else{
            return (-b - Math.sqrt(delta)) / (2 * a);
        }
    }

}
