package Baitap.Baitap1;

import java.util.Scanner;

public class Product {
    private  int productId;
    private String productName;
    private String manufacturer;
    private double price;
    private String description;
    private static int count = 1;

    public Product() {
        this.productId = count++;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Product(String productName, String manufacturer, double price, String description) {
        this.productId = count++;
        this.productName = productName;
        this.manufacturer = manufacturer;
        this.price = price;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Danh sách sản phẩm: " +
                " Mã sản phẩm: " + productId +
                " Tên sản phẩm: '" + productName + '\'' +
                " Gía tiền: " + price +
                " Mô tả: '" + description + '\'' +
                '}';
    }
}
