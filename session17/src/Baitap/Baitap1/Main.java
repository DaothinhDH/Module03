package Baitap.Baitap1;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.nio.file.Files.newInputStream;

public class Main {
    private static File fileProduct = new File("product.dat");
    private static List<Product> productList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        if (!fileProduct.exists()) {
            fileProduct.createNewFile();
        }
        loadProduct();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("----- Quản lý sản phẩm -----");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Hiển thị danh sách sản phẩm");
            System.out.println("3. Tìm kiếm sản phẩm");
            System.out.println("4. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    addProduct(scanner);
                    break;
                case 2:
                    showProduct(scanner);
                    break;
                case 3:
                    searchProduct(scanner);
                    break;
                case 4:
                    saveToFile(scanner);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng nhập lại!");
            }

        } while (choice != 4);

    }

    private static void saveToFile(Scanner scanner) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(fileProduct);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(productList);
            System.out.println("Đã lưu danh sách sản phẩm vào file " + fileProduct);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static void searchProduct(Scanner scanner) {
        if (productList.isEmpty()){
            System.out.println("Danh sách rỗng");
        }else {
            System.out.println("Nhập tên sản phẩm muốn tìm kiếm");
            String nameSearch = scanner.nextLine();

            boolean check = false;
            for (Product product : productList) {
                if (product.getProductName().equals(nameSearch)){
                    System.out.println("Sản phẩm có tên " +nameSearch + ":");
                    System.out.println(product);
                    check = true;
                    break;
                }
            }
            if (!check){
                System.out.println("Không tìm thấy sản phẩm có tên " +nameSearch);
            }
        }
    }

    private static void showProduct(Scanner scanner) {
        if (productList.isEmpty()){
            System.out.println("Danh sách rỗng");
        }else {
            for (Product product : productList){
                System.out.println(product);
            }
        }
    }

    private static void addProduct(Scanner scanner) {
        System.out.println("Nhập thông tin sản phẩm:");
        System.out.print("Tên sản phẩm: ");
        String productName = scanner.nextLine();
        System.out.print("Hãng sản xuất: ");
        String manufacturer = scanner.nextLine();
        System.out.print("Giá sản phẩm: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.print("Mô tả: ");
        String description = scanner.nextLine();
        Product product = new Product(productName, manufacturer, price, description);
        productList.add(product);
        System.out.println("Sản phẩm đã được thêm thành công");
    }


    private static void loadProduct() {
        try (InputStream inputStream = new FileInputStream(fileProduct);
             ObjectInputStream objectInputStream = new ObjectInputStream(inputStream)) {
            productList = (List<Product>) objectInputStream.readObject();
            System.out.println("Đã tải danh sách sản phẩm từ file " + fileProduct);
        } catch (IOException | ClassNotFoundException e) {

        }
    }

}
