package Hackathon04;

import java.util.Scanner;

public class Book {
    private int bookId;
    private String bookName;
    private String author;
    private String description;
    private double importPrice;
    private double exportPrice;
    private double interest;
    private boolean bookStatus = true;
    static int count = 1;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public Book() {
        this.bookId = count++;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Book(int bookId, String bookName, String author, String description, double importPrice, double exportPrice, double interest, boolean bookStatus) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.description = description;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.interest = this.exportPrice - this.importPrice;
        this.bookStatus = bookStatus;
    }


    public void inputData(Scanner scanner) {
        System.out.println("Nhập tên sách");
        scanner.nextLine();
        while (true) {
            this.bookName = scanner.nextLine();
            if (bookName.isEmpty()) {
                System.out.println("*Tên sách không được để trống");
            } else {
                break;
            }
        }
        System.out.println("Nhập tên tác gỉa");
        while (true) {
            this.author = scanner.nextLine();
            if (author.isEmpty()) {
                System.out.println("*Tên tác giả không được để trống");
            } else {
                break;
            }
        }
        System.out.println("Nhập mô tả");
        while (true) {
            this.description = scanner.nextLine();
            if (description.isEmpty()) {
                System.out.println("*Mô tả không được để trống");
            } else if (description.length() < 10) {
                System.out.println("*Mô tả không được ít hơn 10 ký tự");
            } else {
                break;
            }
        }
        System.out.println("Nhập Gía nhập vào");
        while (true) {
            this.importPrice = Double.parseDouble(scanner.nextLine());
            if (importPrice < 0) {
                System.out.println("*Gía nhập phải lớn hơn không");
            } else {
                break;
            }
        }
        System.out.println("Nhập giá xuất ra");
        while (true) {
            this.exportPrice = Double.parseDouble(scanner.nextLine());
            if (exportPrice < 1.2 * importPrice) {
                System.out.println("*Gía xuất vào phải lớn hơn 1.2 lần giá nhập");
            } else {
                break;
            }
        }
        this.interest = this.exportPrice - this.importPrice;

    }

    public void displayData() {
        System.out.println(
                "Mã sản phẩm: " + bookId + " | " +
                        "Tên sản phẩm: '" + bookName + "' | " +
                        "Tên tác giả: '" + author + "' | " +
                        "Mô tả: '" + description + "' | " +
                        "Gía nhập: " + importPrice + " | " +
                        "Gía xuất: " + exportPrice + " | " +
                        "Lợi nhuận: " + interest + " | " +
                        "Trạng thái: " + bookStatus
        );
    }

}
