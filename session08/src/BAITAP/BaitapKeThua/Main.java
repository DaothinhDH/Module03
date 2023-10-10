package BAITAP.BaitapKeThua;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LopHinhHoc2D lopHinhHoc2D = new LopHinhHoc2D(1,2);
        LopHinhHoc3D lopHinhHoc3D   = new LopHinhHoc3D(1,2,3);
        System.out.println(lopHinhHoc2D);
        System.out.println(lopHinhHoc3D);
    }
}
