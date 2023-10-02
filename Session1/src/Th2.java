import java.sql.SQLOutput;
import java.util.Scanner;

public class Th2 {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        int vnd = 23000;
        int usd = 0;
        System.out.println("Moi ban nhap so tien usd:");
        usd = abc.nextInt();
        int quydoi = usd * vnd;
        System.out.println("Tien ban vua doi la:" +quydoi);
    }
}
