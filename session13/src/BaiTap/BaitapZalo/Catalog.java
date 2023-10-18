package BaiTap.BaitapZalo;

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
    public Catalog( String catalogName, int priority, String description, boolean catalogStatus) {
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
        System.out.println("Nhập trạng thái");
        this.catalogStatus = Boolean.parseBoolean(scanner.nextLine());
    }

    @Override
    public void displayData() {
        System.out.println("******************DANH MỤC**********************");
        System.out.println("<===Danh mục===>" +
                "Mã danh mục: " + catalogId + "\n"+
                "Tên danh mục: " +catalogName + "\n"
        );

    }
}
