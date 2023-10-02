import java.util.Scanner;

public class Th7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mời bạn nhập 1 số");
        int number = scanner.nextInt();
        String chuoi = "";
        switch (number) {
            case 1:
                chuoi = "Số một";
                break;
            case 2:
                chuoi = "Số hai";
                break;
            case 3:
                chuoi = "số ba";
                break;
            case 4:
                chuoi = "số bốn";
                break;
            case 5:
                chuoi = "số năm";
                break;
            case 6:
                chuoi = "số sáu";
                break;
            case 7:
                chuoi = "số bảy";
                break;
            case 8:
                chuoi = "số tám";
                break;
            case 9:
                chuoi = "số chín";
                break;
            default:
                break;
        }
        System.out.println("Số bạn đọc ra là " +chuoi);
    }
}
