package BtZalo;

import java.util.Scanner;

public class Book {
    private int bookId;
    private String bookName;
    private String author;
    private String description;
    private double importPrice;
    private double exportPrice;
    private double interest;
    private int quantity;
    private boolean bookStatus;
    static int count = 0;

    public Book(){
        this.bookId = count++;
    }

    public int getBookId() {
        return bookId;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getBookName() {
        return bookName;
    }

    public Book(String bookName, String author, String description, double importPrice, double exportPrice, int quantity, boolean bookStatus) {
        this.bookId = count++;
        this.bookName = bookName;
        this.author = author;
        this.description = description;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.interest = this.exportPrice - this.importPrice;
        this.quantity = quantity;
        this.bookStatus = bookStatus;
    }
    public double getInterest() {
        return interest;
    }
       public void inputData(Scanner scanner){
           Scanner input = new Scanner(System.in);
           System.out.println("Nhập tên sách");
           while (true){
               this.bookName =scanner.nextLine();
               if (bookName.isEmpty()){
                   System.out.println("**Tên sách không được để trống**");
               }else{
                   break;
               }
           }
           System.out.println("Nhập tên tác giả");
           while (true){
               this.author = scanner.nextLine();
               if (author.isEmpty()){
                   System.out.println("Tên tác giả không được để trống");
               }else {
                   break;
               }
           }

           System.out.println("Nhập mô tả");
           while (true){
               this.description =  scanner.nextLine();
               if (description.isEmpty()){
                   System.out.println("Mô tả không được để trống");
               }else  if(description.length() <10){
                   System.out.println("Mô tả không được ít hơn 10 kí tự");
               }else {
                   break;
               }
           }
           System.out.println("Gía nhập vào");
           while (true){
               this.importPrice = Double.parseDouble(scanner.nextLine());
               if (importPrice <0){
                   System.out.println("Gía nhập vào phải lơn hơn không");
               }else {
                   break;
               }
           }
           System.out.println("Gía xuất ra");
           while (true){
               this.exportPrice = Double.parseDouble(scanner.nextLine());
               if (exportPrice<1.2*importPrice){
                   System.out.println("Gía bán không được thấp hơn 1.2 lần giá nhập");

               }else {
                   break;
               }
           }
           System.out.println("Số lượng");
           while (true){
               this.quantity = Integer.parseInt(scanner.nextLine());
               if (quantity <0){
                   System.out.println("Số lượng phải lớn hơn không");
               }else {
                   break;
               }
           }
           System.out.println("Trạng thái");
           this.bookStatus = Boolean.parseBoolean(scanner.nextLine());
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
                        "Số lượng: " + quantity + " | " +
                        "Trạng thái: " + bookStatus
        );
    }
}
