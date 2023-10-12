package Baitap.Baitap2;

public class Main {
    public static void main(String[] args) {
       Shape [] arrShape = new Shape[2];
        arrShape [0] = new Rectangle(5,7);
        arrShape [1] = new Square(9);

        for (Shape shape : arrShape ){
            if (shape instanceof Rectangle){
                System.out.println(((Rectangle) shape).getArea());
            }

            if ( shape instanceof Square){
                System.out.println(((Square) shape).getArea());
            }

            if (shape instanceof Colorable){
                ((Colorable)shape).howToColor();
            }

        }


    }
}
