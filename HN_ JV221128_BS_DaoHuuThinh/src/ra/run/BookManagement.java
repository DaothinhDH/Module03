package ra.run;

import ra.bussinessImp.Book;

import java.util.*;

public class BookManagement {
    static List<Book> books = new ArrayList<>();

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter", "Harry Potter and the Philosopher's Stone", 40, 50000, 80000, 90000, true);
        books.add(book1);
        Book book2 = new Book("To Kill a Mockingbird", "To Kill a Mockingbird", 30, 60000, 90000, 120000, true);
        books.add(book2);
        Book book3 = new Book("The Great Gatsby", "The Great Gatsby", 80, 40000, 70000, 100000, false);
        books.add(book3);


        String menu = "****************JAVA-HACKATHON-05-BASIC-MENU***************\n" +
                "1. Nhập số sách và nhập thông tin sách\n" +
                "2. Hiển thị thông tin các sách\n" +
                "3. Sắp xếp sách theo lợi nhuận giảm dần\n" +
                "4. Xóa sách theo mã sách\n" +
                "5. Tìm kiếm sách theo tên sách\n" +
                "6. Thay đổi trạng thái của sách theo mã sách\n" +
                "7. Thoát \n";
        int choice;
        do {
            System.out.println(menu);
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    inputAddBook();
                    break;
                case 2:
                    displayBook();
                    break;
                case 3:
                    sortBook();
                    break;
                case 4:
                    deleteBook();
                    break;
                case 5:
                    searchBook();
                    break;
                case 6:
                    editStatusBook();
                    break;
                case 7:
                    System.out.println("Kết thúc chương trình");
                default:
                    System.out.println("Lựa chọn không hợp lệ vui lòng nhập lại");
                    break;

            }
        }while (choice != 7);
    }

    private static void editStatusBook() { //
        System.out.println("Nhập mã danh sách cần thay đổi trạng thái");
        int idEdit = scanner.nextInt();
        boolean isEdit = false;
        for (Book book : books) {
            if (book.getBookId() == idEdit){
                book.setBookStatus(!book.isBookStatus());
                isEdit = true;
                break;
            }
        }
        if (isEdit){
            System.out.println("Đã thay đổi trạng thái của sách có mã là  " + idEdit);
        }else {
            System.out.println("Không tìm thấy sách có mã là " +idEdit);
        }
        displayBook();
    }

    private static void searchBook() { // ttìm kiếm sách theo tên sách
        System.out.println("Nhập tên cần tìm kiếm");
        String nameBook = scanner.nextLine();
        boolean isFound = false;
        for (Book book : books){
            if (book.getBookName().equals(nameBook)){
                book.displayData();
                isFound = true;
                break;
            }
        }
        if (!isFound){
            System.out.println("Không tìm thấy sách có tên " +nameBook);
        }
    }

    private static void deleteBook() {
        System.out.println("Nhập mã sách cần xóa");
        int idDelete = scanner.nextInt();
        boolean isDelete = false;
        for (int i = 0; i < books.size() ; i++) {
            if (books.get(i).getBookId() == idDelete){
                books.remove(i);
                isDelete = true;
                break;
            }
        }
        if (isDelete){
            System.out.println("Đã xóa sách có mã sách là " +idDelete);
        }else {
            System.out.println("Không tìm thấy sách có mã là " +idDelete);
        }
    }

    private static void sortBook() { //Sắp xếp sách theo lợi nhuận giảm dầnd
       Collections.sort(books);
       displayBook();
    }

    private static void displayBook() { // Hiển tthị thông tin các sách
        for (Book b : books) {
            b.displayData();
        }
    }

    private static void inputAddBook() { // 1.Nhập số sách và nhập thông tin sách
        System.out.println("Nhập số sách cần thêm và thông tin sách");
        int numberBook = scanner.nextInt();
        for (int i = 0; i <numberBook ; i++) {
            Book newbook = new Book();
            System.out.println("Nhập thông tin cho sách thứ " + (i +1));
            newbook.inputData();
            books.add(newbook);
        }

    }
}
