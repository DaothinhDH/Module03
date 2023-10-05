package Thuchanh.DanhmucSanpham;

import Thuchanh.DanhmucSanpham.Category;

public class Product {
    int productId;
    String productName;
    float productPrice;
    Category category;

    public Product(int productId, String productName, float productPrice, Category
            category){
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.category = category;
    }

    public Product(){

    }


    public void display() {
        System.out.println("Product" +
                "Mã sản phẩm: " + productId + "\n"+
                "Tên sản phẩm: '" + productName + '\n' +
                "Gía tiền: " + productPrice + "\n"+
                "Danh mục: " + category.categoryName
                );
    }

//    public  void  inputData(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập mã sản phẩm");
//        this.productId = Integer.parseInt(scanner.nextLine());
//        System.out.println("Nhập tên sản phẩm");
//        this.productName = scanner.nextLine();
//        System.out.println("Nhập giá tiền");
//        this.productPrice = Integer.parseInt(scanner.nextLine());
//        System.out.println("Nhập danh mục");
//        this.category = scanner.nextLine();
//    }
}