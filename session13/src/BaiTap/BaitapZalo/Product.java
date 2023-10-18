package BaiTap.BaitapZalo;

import java.util.Scanner;

public class Product implements IShop {
    private  int productId;
    private String productName;
    private String title;
    private String description;
    private Catalog catalog;
    private float importPriceex;
    private  float exportPriceex;
    private boolean productStatus;
    private int count = 1;



    public Product(){
        this.productId = count++;
    }
    public Product( String productName, String title, String description, Catalog catalog, float importPriceex, float exportPriceex, boolean productStatus) {
        this.productId = count++;
        this.productName = productName;
        this.title = title;
        this.description = description;
        this.catalog = catalog;
        this.importPriceex = importPriceex;
        this.exportPriceex = exportPriceex;
        this.productStatus = productStatus;
    }

    public Catalog getCatalog() {
        return catalog;
    }

    public float getExportPriceex() {
        return exportPriceex;
    }

    public void setExportPriceex(float exportPriceex) {
        this.exportPriceex = exportPriceex;
    }

    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
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
        this.importPriceex = 0; // Khởi tạo giá trị ban đầu
        while (this.importPriceex <= 0) {
            System.out.print("Nhập giá nhập sản phẩm (lớn hơn 0): ");
            this.importPriceex = Float.parseFloat(scanner.nextLine());
            if (importPriceex < 0) {
                System.out.println("Giá nhập sản phẩm phải lớn hơn 0.");
            }
        }
        this.exportPriceex = this.importPriceex * RATE; // Tính giá bán sản phẩm;
    }

    @Override
    public void displayData() {
        System.out.println("**************SẢN PHẨM****************");
        System.out.println(">===Danh sách sản phẩm===<");
        System.out.println("Mã sản phẩm: " + productId + " | Tên sản phẩm: " + productName + " | Tiêu đề: " + title);
        System.out.println("Mô tả: " + description + " | Gía nhập vào: " + importPriceex + " | Gía bán ra: " + exportPriceex);
        System.out.println("Trạng thái: " + (productStatus ? "đang bán" : "ngừng bán") + " | Danh mục: " + catalog.getCatalogName());
    }


}
