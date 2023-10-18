package BaiTap.BaitapZalo;

import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static List<Catalog> listCatalog = new ArrayList<>();
    static List<Product> listProduct = new ArrayList<>();

    public static void main(String[] args) {
        listCatalog.add(new Catalog("Danh mục 1",1,"Mota1",true));
        listCatalog.add(new Catalog("Danh mục 2",1,"Mota1",true));
        listCatalog.add(new Catalog("Danh mục 3",1,"Mota1",true));
        String menu = "****************MENU***************\n" +
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

    private static void searchProductsByCatalogName() {
        System.out.println("Nhập từ khóa tìm kiếm");
        String seachCatalog = scanner.nextLine();
        for (Catalog catalog : listCatalog) {
            if (catalog.getCatalogName().contains(seachCatalog)) {
                catalog.displayData();
            }

        }
        displayProduct();
    }

    private static void sortProductsByPrice() {
        Collections.sort(listProduct, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) (o1.getExportPriceex() - o2.getExportPriceex());
            }
        });
        System.out.println("Danh sách sắp xếp theo giá tăng dần");
        displayProduct();
    }

    private static void inputProduct() {
        System.out.println("Nhập số sản phẩm");
        int number = scanner.nextInt();
        for (int i = 0; i < number; i++) {
            Product product = new Product();
            System.out.println("Nhập thông tin thứ " + (i + 1));
            product.inputData();
            System.out.println("Chọn danh mục cho sản phẩm");
            displayCatalog();
            System.out.println("Chọn mã danh mục");
            int catalogId = scanner.nextInt();
            Catalog checkCatalog = findCatalog(catalogId);
            if (checkCatalog != null) {
                product.setCatalog(checkCatalog);
                listProduct.add(product);
                System.out.println("Sản phẩm đã được thêm vào danh sách");
            } else {
                System.out.println("Không tìm thấy");
            }

        }
        displayProduct();

    }

    private static void inputCatalog() {
        System.out.println("Nhập số danh mục sản phẩm");
        int number = scanner.nextInt();
        for (int i = 0; i < number; i++) {
            Catalog newcatalog = new Catalog();
            System.out.println("Nhập thông tin cho danh mục thứ " + (i + 1));
            newcatalog.inputData();
            listCatalog.add(newcatalog);
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
