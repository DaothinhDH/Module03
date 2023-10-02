import java.util.Scanner;

public class Th7_2Tiengviet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập số: ");
        int so = sc.nextInt();
        int donvi = so % 10;
        int chuc = (so / 10) % 10;
        int tram = so / 100;

        String chuoiTram = layChuoi(tram)+ "trăm";
        String chuoiChuc = "";
        if (chuc == 0){
            chuoiChuc = " linh";
        }else {
            chuoiChuc = layChuoi(chuc)+ "mươi";
        }
        String chuoiDonVi = layChuoi(donvi);
        System.out.println(chuoiTram + chuoiChuc + chuoiDonVi);

    }
    public static String layChuoi (int so){
        String chuoi = "";
        switch (so) {
            case 1:
                chuoi = "Một ";
                break;
            case 2:
                chuoi = " Hai ";
                break;
            case 3:
                chuoi = " Ba ";
                break;
            case 4:
                chuoi = " Bốn ";
                break;
            case 5:
                chuoi = " Năm ";
                break;
            case 6:
                chuoi = " Sáu ";
                break;
            case 7:
                chuoi = " Bẩy ";
                break;
            case 8:
                chuoi = " Tám ";
                break;
            case 9:
                chuoi = " Chín ";
        }
        return chuoi;
    }
}