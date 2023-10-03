package Thuchanh;

import java.util.Scanner;
// thực hành 2 tìm giá trị trong mảng
public class Th2 {
    public static void main(String[] args) {
        String [] students = {"one", "two", "three","four", "five", "six","seven", "eight", "nine", "ten",}; // khai báo mảng chứa các số từ one đến ten
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số viết bằng tiếng anh từ one - ten");
        String input_name = scanner.nextLine(); // nhập số cần tìm kiếm từ bàn phím
        boolean isExist = false;
        for (int i = 0; i < students.length; i++){
            if(students[i].equals(input_name)){
                System.out.println("Vị trí của số trong danh sách " +input_name+ ":" +i); // nếu tìm thấy số trong mảng, in ra vị trí của số đó
                isExist = true;
                break;
            }
        }
        if(!isExist) {
            System.out.println("Không tìm thấy "+input_name+" trong danh sách"); // nếu không tìm thấy số trong mảng, in ra thông báo không tìm thấy
        }
    }
}
