package Thuchanh.DanhmucSanpham;

public class Main {
    public static void main(String[] args) {
        Category danhmuc1 = new Category(1,"Quần");
        Category danhmuc2 = new Category(2,"ÁO");
        // Các sản phẩm thuộc danh mục 1
        Product product1 = new Product(1,"quần âu",120000,danhmuc1);
        Product product2 = new Product(2,"quần jean",130000,danhmuc1);
        // Các sản phẩm thuộc danh mục 2
        Product product3 = new Product(3,"áo ngắn",150000,danhmuc2);
        Product product4 = new Product(4,"áo dài",160000,danhmuc2);
        // hiển thị
        System.out.println("Tất cả các sản phẩm");
        product1.display();
        product2.display();
        product3.display();
        product4.display();
    }
}
