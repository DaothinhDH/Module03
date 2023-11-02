package ra.model;

import java.io.Serializable;

public class Products implements Serializable {
    private static final long serialVersionUID = 1L;
    private int productId;
    private String productName;
    private String description;
    private double unitPrice;
    private int stock;
    private boolean status = true;
    private  Catalogs catalogs;

    public Products() {
    }

    public Products(int productId, String productName,String description, double unitPrice, int stock, boolean status, Catalogs catalogs) {
        this.productId = productId;
        this.productName = productName;
        this.description = description;
        this.unitPrice = unitPrice;
        this.stock = stock;
        this.status = status;
        this.catalogs = catalogs;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Catalogs getCatalogs() {
        return catalogs;
    }

    public void setCatalogs(Catalogs catalogs) {
        this.catalogs = catalogs;
    }



    @Override
    public String toString() {
        return "Products{" +
                "Mã sản phẩm: " + productId +
                ", Tên sản phẩm: '" + productName + '\'' +
                ", Mô tả: '" + description + '\'' +
                ", Gía: " + unitPrice +
                ", Số lượng: " + stock +
                ", Trang thái: " + (status ? "Mở bán" : "hết hàng") +
                ", Tên danh mục: " + catalogs.getCatalogName() +
                '}';
    }
}














