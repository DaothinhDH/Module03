package Hackathon04;

import java.util.Scanner;

public class BookManagement {
    static Book[] arrBook = new Book[100];
    static int currenIndex = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String menu = "****************JAVA-HACKATHON-05-BASIC-MENU***************\n" +
                "1. Nhập số lượng sách thêm mới và nhập thông tin cho từng cuốn sách\n" +
                "2. Hiển thị thông tin tất cả sách trong thư viện\n" +
                "3. Sắp xếp sách theo lợi nhuận tăng dần\n" +
                "4. Xóa sách theo mã sách\n" +
                "5. Tìm kiếm tương đối sách theo tên sách hoặc mô tả\n" +
                "6. Thay đổi thông tin sách theo mã sách\n" +
                "7. Thoát khỏi chương trình\n";
        int choice;

        do {
            System.out.println(menu);
            System.out.println("Nhập lựa chọn");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Bạn đã chọn chức năng 1");
                    addBook(arrBook, currenIndex);
                    currenIndex++;
                    break;
                case 2:
                    System.out.println("Bạn đã chọn chức năng 2");
                    displayAllBooks();
                    break;
                case 3:
                    System.out.println("Bạn đã chọn chức năng 3");
                    sortBooks();
                    break;
                case 4:
                    System.out.println("Bạn đã chọn chức năng 4");
                    deleteBook();
                    break;
                case 5:
                    System.out.println("Bạn đã chọn chức năng 5");
                    searchBooks();
                    break;
                case 6:
                    System.out.println("Bạn đã chọn chức năng 6");
                    editBook();
                    break;
                case 7:
                    System.out.println("Bạn đã chọn chức năng 7");
                    break;
                default:
                    System.out.println("Lựa chọn của bạn không hợp lệ. Vui lòng nhập lại.");
                    break;
            }
        } while (choice != 7);
    }

    private static void searchBooks() {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Nhập tên muốn tìm kiếm");
        String keyWork = scanner.nextLine();
        for (int i = 0; i <currenIndex ; i++) {
            Book book = arrBook[i];
            if (book.getBookName().contains(keyWork)){
                book.displayData();
            }

        }
    }

    private static void editBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id của sách muốn sửa");
        int editId = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <currenIndex ; i++) {
            if(arrBook[i].getBookId()==editId){
                System.out.println("Thông tin của sách mà bạn muốn sửa");
                arrBook[i].displayData();
                arrBook[i].inputData(scanner);
                System.out.println("Đã cập nhật thành công");
                return;
            }
        }
        System.out.println("Không tìm thấy id vừa nhập");
    }
    private static void sortBooks() {
        for (int i = 0; i <currenIndex -1 ; i++) {
            for (int j = 0; j < currenIndex -i -1 ; j++) {
                if(arrBook[j].getInterest() > arrBook[j+1].getInterest()){
                    Book temp = arrBook[j];
                    arrBook[j] = arrBook[j+1];
                    arrBook[j+1] = temp;
                }
            }
            System.out.println("Đã sắp xếp theo lợi nhuận tăng dần");

        }
    }
    private static void deleteBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào id sách bạn muốn xóa");
        int deleteId = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < currenIndex; i++) {
            if(arrBook[i].getBookId()==deleteId){
                for (int j = 0; j <currenIndex ; j++) {
                    arrBook[j]=arrBook[j+1];
                }
                currenIndex --;
                return;
            }
        }
        System.out.println("Không tìm thấy id vừa nhập");
    }

    private static void addBook(Book[] arrBook, int currentIndex) {
        Scanner scanner = new Scanner(System.in);
        Book book = new Book();
        book.inputData(scanner);
        arrBook[currentIndex] = book;
    }

    private static void displayAllBooks() {
        System.out.println("**Danh sách tất cả sản phẩm**");
        for (int i = 0; i < currenIndex; i++) {
            arrBook[i].displayData();
        }
    }


}
