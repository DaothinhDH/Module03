package ra.bussinessImp;

import ra.bussiness.IShop;

import java.util.Scanner;

public class Catalog implements IShop {
    private int catalogId;
    private String catalogName;
    private int priority;
    private String description;
    private boolean catalogStatus;
    private static int count = 1;

    public Catalog(){
        this.catalogId = count++;
    }

    public Catalog(String catalogName, int priority, String description, boolean catalogStatus) {
        this.catalogId = count++;
        this.catalogName = catalogName;
        this.priority = priority;
        this.description = description;
        this.catalogStatus = catalogStatus;
    }

    public int getCatalogId() {
        return catalogId;
    }


    public String getCatalogName() {
        return catalogName;
    }


    @Override
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên danh mục sản phẩm");
        this.catalogName = scanner.nextLine();
        System.out.println("Nhập độ ưu tiên");
        this.priority = Integer.parseInt(scanner.nextLine());
        System.out.println("Mô tả danh mục");
        this.description = scanner.nextLine();
        System.out.println("Nhập trạng thái true||false");
        this.catalogStatus = Boolean.parseBoolean(scanner.nextLine());

    }

    @Override
    public void displayData() {
        System.out.println("Catalog{" +
                " Mã danh mục: " + catalogId +
                " Tên danh mục: " + catalogName + '\'' +
                '}');
    }


}
