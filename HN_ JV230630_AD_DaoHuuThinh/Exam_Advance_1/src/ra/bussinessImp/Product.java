package ra.bussinessImp;

import ra.bussiness.IShop;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Product implements IShop {
    private int productId;
    private String productName;
    private String title;
    private String description;
    private Catalog catalog;
    private float importPrice;
    private float exportPrice;
    private boolean productStatus;

    private int countCatalog = 1;
    public Product() {
        this.productId = countCatalog++;
    }

    public Product(String productName, String title, String description, Catalog catalog, float importPrice, float exportPrice, boolean productStatus) {
        this.productId = countCatalog++;
        this.productName = productName;
        this.title = title;
        this.description = description;
        this.catalog = catalog;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.productStatus = productStatus;
    }

    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    @Override
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm: ");
        productName = scanner.nextLine();
        System.out.print("Nhập tiêu đề sản phẩm: ");
        title = scanner.nextLine();
        System.out.print("Nhập mô tả sản phẩm: ");
        this.description = scanner.nextLine();
        this.importPrice = 0; // Khởi tạo giá trị ban đầu
        while (this.importPrice <= 0) {
            System.out.print("Nhập giá nhập sản phẩm (lớn hơn 0): ");
            this.importPrice = Float.parseFloat(scanner.nextLine());
            if (importPrice < 0) {
                System.out.println("Giá nhập sản phẩm phải lớn hơn 0.");
            }
        }
        this.exportPrice = this.importPrice * RATE; // Tính giá bán sản phẩm;
    }

    DecimalFormat formatter = new DecimalFormat("###,###,###"); // format tiền


    @Override
    public void displayData() {
        System.out.println("**************SẢN PHẨM****************");
        System.out.println(">===Danh sách sản phẩm===<");
        System.out.println("Mã sản phẩm: " + productId + " | Tên sản phẩm: " + productName + " | Tiêu đề: " + title);
        System.out.println("Mô tả: " + description + " | Gía nhập vào: " + formatter.format(importPrice) + " | Gía bán ra: " + formatter.format(exportPrice));
        System.out.println("Trạng thái: " + (productStatus ? "đang bán" : "ngừng bán") + " | Danh mục: " + catalog.getCatalogName());
    }
}
