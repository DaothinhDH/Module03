package Thuchanh.DanhmucSanpham;

import java.util.Scanner;

public class Category {
    int categoryId;
    String categoryName;

    public  Category(int categoryId,String categoryName){
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }

    public Category(){

    }

    @Override
    public String toString() {
        return "Category{" +
                "Mã danh mục: " + categoryId +
                ",Tên Danh mục: '" + categoryName + '\'' +
                '}';
    }

    public  void inputData (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã danh mục");
        this.categoryId = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên danh mục");
        this.categoryName = scanner.nextLine();
    }
}
