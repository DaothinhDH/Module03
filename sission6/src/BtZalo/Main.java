    package BtZalo;

    import com.sun.xml.internal.bind.v2.schemagen.Util;

    import java.util.Scanner;

    public class Main {
        static Scanner scanner = new Scanner(System.in);
        static Book[] arrBook = new Book[100];
        static int currenIndex = 0;
        private static Scanner input = new Scanner(System.in);
        public static void main(String[] args) {
            Book bk1 = new Book("Sách 1", "Tác giả 1", "Mô tả 1", 50, 70, 0, true);
            arrBook[currenIndex] = bk1;
            currenIndex++;
            Book bk2 = new Book("Sách 2", "Tác giả 2", "Mô tả 2", 50, 60, 0, true);
            arrBook[currenIndex] = bk2;
            currenIndex++;
            Book bk3 = new Book("Sách 3", "Tác giả 3", "Mô tả 3", 60, 120, 0, true);
            arrBook[currenIndex] = bk3;
            currenIndex++;
            Book bk4 = new Book("Sách 4", "Tác giả 4", "Mô tả 4", 70, 100, 0, true);
            arrBook[currenIndex] = bk4;
            currenIndex++;
            Book bk5 = new Book("Sách 5", "Tác giả 5", "Mô tả 5", 80, 150, 0, true);
            arrBook[currenIndex] = bk5;
            currenIndex++;
            String menu = "=========Menu chính==========\n" +
                    "1.Thêm mới sách\n" +
                    "2.Hiển thị danh sách\n" +
                    "3.Sửa thông tin sách\n" +
                    "4.Xóa sách\n" +
                    "5.Sắp xếp theo lợi nhuận tăng dần\n" +
                    "6.Tìm kiếm tương đối sách theo tên sách\n" +
                    "7.Nhập sách\n" +
                    "8.Bán sách\n" +
                    "0.Thoát khỏi chương trình\n";
            int choice;
            do {
                System.out.println(menu);
                System.out.println("Nhập lựa chọn: ");
                choice = input.nextInt();
                switch (choice) {
                    case 1:
                        addBook();
                        break;
                    case 2:
                        displayAllBooks();
                        break;
                    case 3:
                        editBook();
                        break;
                    case 4:
                        deleteBook();
                        break;
                    case 5:
                        sortByInterest();
                        break;
                    case 6:
                        searchBooks();
                        break;
                    case 7:
                        importBooks();
                        break;
                    case 8:
                        sellingbooks();
                        break;
                    case 9:
                        break;
                }
            } while (choice != 0);
        }

        private static void sellingbooks() {
            System.out.println("Nhập tên sách cần bán");
            String bookName = scanner.nextLine();
            System.out.println("Nhập số lượng cần bán");
            int sellQuantity = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i <currenIndex ; i++) {
                if(arrBook[i].getBookName().equalsIgnoreCase(bookName)) {
                   int currenquantity = arrBook[i].getQuantity();
                   if (currenquantity>= sellQuantity){
                       arrBook[i].setQuantity(currenquantity - sellQuantity);
                       System.out.println("Đã bán thành công");
                       return;
                   }else {
                       System.out.println("Số lượng sách không đủ để bán");
                       return;
                   }
                }
            }
            System.out.println("Không tìm thấy sách có tên: "+bookName);
        }

        private static void importBooks() {
            System.out.println("Nhập id sách mà bạn muốn thêm số lượng");
            int quantityId = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập số lượng muốn nhập vào");
            int quantityAdd = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i <currenIndex ; i++) {
                if (arrBook[i].getBookId() == quantityId){
                    int currentQuantity = arrBook[i].getQuantity();
                    arrBook[i].setQuantity(currentQuantity+quantityAdd);
                    System.out.println("Thêm số lượng thành công");
                    return;
                }

            }
            System.out.println("Không tìm thấy sách có mã: " +quantityId);
        }


        private static void searchBooks() {
            System.out.println("Nhập tên muốn tìm kiếm");
            String keyWork = scanner.nextLine();
            for (int i = 0; i <currenIndex ; i++) {
               Book book = arrBook[i];
               if (book.getBookName().contains(keyWork)){
                   book.displayData();
               }

            }
        }

        private static void sortByInterest() {
            for (int i = 0; i <currenIndex -1 ; i++) {
                for (int j = 0; j <currenIndex-i-1 ; j++) {
                   if (arrBook[j].getInterest() > arrBook[j+1].getInterest()){
                       Book temp = arrBook[j];
                       arrBook[j] = arrBook[j+1];
                       arrBook[j+1] = temp;
                   }
                }
            }
            System.out.println("Đã sắp xếp theo lợi nhuận tăng dần");
        }

        private static void deleteBook() {
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

        private static void editBook() {
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

        private static void displayAllBooks() {
            System.out.println("**Danh sách tất cả sản phẩm**");
            for (int i = 0; i <currenIndex ; i++) {
                arrBook[i].displayData();
            }
        }

        private static void addBook() {
            Book book = new Book();
            book.inputData(scanner);
            arrBook[currenIndex++]= book;
        }
    }
