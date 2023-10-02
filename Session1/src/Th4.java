import java.util.Scanner;

public class Th4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap chieu dai");
        int chieudai = scanner.nextInt();
        System.out.println("Nhap chieu rong");
        int chieurong = scanner.nextInt();

        int chuvi = (chieudai + chieurong) *2;
        int dientich = chieudai * chieurong;
        System.out.println("Chu vi hinh chu nhat la" +chuvi +"dien tich la" +dientich);


    }
}

