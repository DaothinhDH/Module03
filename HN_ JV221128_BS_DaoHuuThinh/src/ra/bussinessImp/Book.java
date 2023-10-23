package ra.bussinessImp;

import ra.bussiness.IBook;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Book implements IBook, Comparable<Book> {
    private int bookId;
    private String bookName;
    private String title;
    private int numberOfPages;
    private float importPrice;
    private float exportPrice;
    private float interest;
    private boolean bookStatus;

    private static int count =1;

    public Book() {
        this.bookId = count++;
    }

    public Book(String bookName, String title, int numberOfPages, float importPrice, float exportPrice, float interest, boolean bookStatus) {
        this.bookId = count++;
        this.bookName = bookName;
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.interest = interest;
        this.bookStatus = bookStatus;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    public boolean isBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(boolean bookStatus) {
        this.bookStatus = bookStatus;
    }



    @Override
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên sách");
        this.bookName = scanner.nextLine();
        System.out.println("Nhập tiêu đề sách");
        this.title = scanner.nextLine();
        System.out.println("Nhập số trang sách");
        this.numberOfPages = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào giá nhập vào");
        this.importPrice = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập vào giá bán");
        this.exportPrice = Float.parseFloat(scanner.nextLine());
        this.interest = this.exportPrice - this.importPrice; // công thức tính lợi nhuận
        System.out.println("Nhập vào trạng thái true||false");
        this.bookStatus = Boolean.parseBoolean(scanner.nextLine());


    }

    DecimalFormat formatter = new DecimalFormat("###,###,###"); // hàm format tiền cái này em tham khảo trên google

    @Override
    public void displayData() {
        System.out.println("***Danh sách***" +
                " Mã sách : " + bookId + "\n" +
                " Tên sách : '" + bookName + '\'' +
                " Tiêu đê sách : " + title + '\'' +
                " Số trang : " + numberOfPages +
                " Gía nhập : " + formatter.format(importPrice) +
                " Gía bán : " + formatter.format(exportPrice) +
                " Lợi nhuận : " + formatter.format(interest) +
                " Trạng thái : " + (bookStatus ? "Có sẵn" : "Hết hàng")
        );
    }



    @Override
    public int compareTo(Book o) {
        return (int) - (this.interest - o.interest);
    }
}

