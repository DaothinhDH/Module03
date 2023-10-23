package ra.bussinessImp;

import java.util.*;

public class ProductManagement {
    static Scanner scanner = new Scanner(System.in);
    static List<Catalog> listCatalog = new ArrayList<>();
    static List<Product> listProduct = new ArrayList<>();
    public static void main(String[] args) {
        listCatalog.add(new Catalog("Danh mục 1",1,"Mota1",true));
        listCatalog.add(new Catalog("Danh mục 2",2,"Mota2",false));
        listCatalog.add(new Catalog("Danh mục 3",3,"Mota3",true));

        String menu = "****************JAVA-HACKATHON-05-ADVANCE-2-MENU***************\n" +
                "1. Nhập số danh mục sản phẩm và nhập thông tin các danh mục\n" +
                "2. Nhập số sản phẩm và nhập thông tin các sản phẩm\n" +
                "3. Sắp xếp sản phẩm theo giá sản phẩm tăng dần\n" +
                "4. Tìm kiếm sản phẩm theo tên danh mục sản phẩm\n" +
                "5. Thoát \n";
        int choice;

        do {
            System.out.println(menu);
            choice= scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    inputCatalog();
                    break;
                case 2:
                    inputProduct();
                    break;
                case 3:
                    sortProductsByPrice();
                    break;
                case 4:
                    searchProductsByCatalogName();
                    break;
                case 5:
                    System.out.println("Kết thúc chương trình");
                default:
                    System.out.println("Lựa chọn không hợp lệ vui lòng nhập lại");
                    break;
            }
        }
        while (choice != 5);

    }

    private static void searchProductsByCatalogName() { //Tìm kiếm sản phẩm theo tên danh mục sản phẩm
        System.out.println("*Nhập từ khóa tìm kiếm*");
        String seach = scanner.nextLine();
        for (Catalog catalog : listCatalog) {
            if (catalog.getCatalogName().contains(seach)){
                catalog.displayData();
            }
        }
        displayProduct();
    }

    private static void sortProductsByPrice() { // 3.Sắp xếp sản phẩm theo giá sản phẩm tăng dần
        Collections.sort(listProduct, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) (o1.getExportPrice() - o2.getExportPrice());
            }
        });
        System.out.println("Danh sách sắp xếp theo giá tăng dần");
        displayProduct();
    }

    private static void inputProduct() { // 2.Nhập số sản phẩm và nhập thông tin các sản phẩm
        System.out.println("Nhập số lượng sản phẩm muốn thêm");
        int numberProduct = scanner.nextInt();
        for (int i = 0; i <numberProduct ; i++) {
            Product newProduct = new Product();
            System.out.println("Nhập thông tin thứ " + (i+1));
            newProduct.inputData();
            System.out.println("*Chọn danh mục cho sản phẩm*");
            displayCatalog();
            System.out.println("*Chọn mã danh mục muốn thêm sản phẩm vào*");
            int catalogId = scanner.nextInt();
            Catalog checkCatalog = findCatalog(catalogId);
            if (checkCatalog != null){
                newProduct.setCatalog(checkCatalog);
                listProduct.add(newProduct);
                System.out.println("Đã thêm sản phẩm vào danh sách");
            }else {
                System.out.println("Không tìm thấy");
            }
        }
    }

    private static void inputCatalog() { // 1.Nhập số danh mục sản phẩm và nhập thông tin các danh mục
        System.out.println("Nhập số danh mục sản phẩm");
        int numberCatalog = scanner.nextInt();
        for (int i = 0; i < numberCatalog ; i++) {
            Catalog newCatalog = new Catalog();
            System.out.println("Nhập thông tin cho danh mục thứ " + (i+1));
            newCatalog.inputData();
            listCatalog.add(newCatalog);
        }
    }

    private static void displayCatalog() {
        for (Catalog catalog : listCatalog) {
            catalog.displayData();
        }
    }

    private static Catalog findCatalog(int id) { // tìm kiếm id của catalog
        for (Catalog catalog : listCatalog) {
            if (catalog.getCatalogId() == id) {
                return catalog;
            }
        }
        return null;
    }

    private static void displayProduct() {
        for (Product product : listProduct) {
            product.displayData();
        }
    }

}
