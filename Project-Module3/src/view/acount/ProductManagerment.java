package view.acount;

import ra.config.Validate;
import ra.model.Catalogs;
import ra.model.Products;
import sevice.product.CatalogServiceIMPL;
import sevice.product.ICatalogService;
import sevice.product.IProductService;
import sevice.product.ProductServiceIMPL;

import static ra.config.Color.*;

public class ProductManagerment {
    IProductService productService = new ProductServiceIMPL();
    ICatalogService catalogService = new CatalogServiceIMPL();
    public void menuProduct() {
        int choice;
        do {
//            System.out.println("\nXin chao: "+ Home.userLogin.getName());
            System.out.println(PURPLE + "╔═════════════════════════════════════════════════════════════════════════════════════╗");
            System.out.println("║                               MENU Product                                          ║");
            System.out.println("╠════╦════════════════════════════════════════════════════════════════════════════════╣");
            System.out.println("║  1.║                       Hiển thị danh sách sản phẩm                              ║");
            System.out.println("╠════╬════════════════════════════════════════════════════════════════════════════════╣");
            System.out.println("║  2.║                       Thêm mới 1 hoặc nhiều sản phẩm                           ║");
            System.out.println("╠════╬════════════════════════════════════════════════════════════════════════════════╣");
            System.out.println("║  3.║                       Chỉnh sửa thông tin sản phẩm                             ║");
            System.out.println("╠════╬════════════════════════════════════════════════════════════════════════════════╣");
            System.out.println("║  4.║                       Ẩn sản phẩm theo mã sản phẩm                             ║");
            System.out.println("╠════╬════════════════════════════════════════════════════════════════════════════════╣");
            System.out.println("║  5.║                       Tìm kiếm sản phẩm theo tên                               ║");
            System.out.println("╠════╬════════════════════════════════════════════════════════════════════════════════╣");
            System.out.println("║  6.║                       Quay lại                                                 ║");
            System.out.println("╚════╩════════════════════════════════════════════════════════════════════════════════╝" +RESET);

            System.out.print(YELLOW + "Lựa chọn (0/1/2): " + RESET);
            choice = Integer.parseInt(Validate.validateString());
            switch (choice) {
                case 1:
                    showProducts();
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    updateProduct();
                    break;
                case 4:
                    hidenproduct();
                    break;
                case 5:
                    searchProduct();
                    break;
                case 6:
                    return;
                default:
                    System.out.println(RED + "lựa chọn không hợp lệ vui lòng nhập lại" + RESET);
                    break;
            }

        } while (true);
    }

    private void searchProduct() {
        System.out.println("Nhập tên sản phẩm muốn tìm: ");
        String search = Validate.validateString().toLowerCase();
        int count = 0;
        System.out.println("Danh sách sản phẩm cần tìm: ");
        for (Products product : productService.findAll()) {
            if (product.getProductName().toLowerCase().contains(search)) {
                System.out.println(product);
                count++;
            }
        }
        System.out.printf("Tìm thấy %d sản phẩm theo từ khoá vừa nhập ", count);
        System.out.println();
    }

    private void hidenproduct() {
        System.out.println("Nhập ID sản phẩm cần ẩn/mở lại: ");
        int productId = Validate.validateInt();
        Products products = productService.findById(productId);

        if (products != null) {
            System.out.println("1. Ẩn sản phẩm");
            System.out.println("2. Mở lại sản phẩm");
            int choice = Validate.validateInt();

            switch (choice) {
                case 1:
                    if (products.isStatus()) {
                        products.setStatus(false);
                        productService.update(products);
                        System.out.println(YELLOW + "Sản phẩm đã được ẩn thành công" + RESET);
                    } else {
                        System.out.println(YELLOW + "Sản phẩm đã được ẩn trước đó" + RESET);
                    }
                    break;
                case 2:
                    if (!products.isStatus()) {
                        products.setStatus(true);
                        productService.update(products);
                        System.out.println(YELLOW + "Sản phẩm đã được mở lại thành công" + RESET);
                    } else {
                        System.out.println(YELLOW + "Sản phẩm đã được mở lại trước đó" + RESET);
                    }
                    break;


                default:
                    System.out.println(RED + "Lựa chọn không hợp lệ" + RESET);
                    break;
            }
        } else {
            System.out.println(RED + "Không tìm thấy sản phẩm có mã: " + productId + RESET);
        }
    }

    private void updateProduct() {
        System.out.println("Nhập ID sản phẩm cần thay đổi: ");
        int idEdit = Validate.validateInt();
        Products productedit = productService.findById(idEdit);

        if (productedit != null) {
            System.out.println("1_ Sửa tên sản phẩm");
            System.out.println("2_ Sửa danh mục sản phẩm");
            System.out.println("3_ Sửa mô tả sản phẩm");
            System.out.println("4_ Sửa đơn giá");
            System.out.println("5_ Sửa số lượng trong kho");
            int choice = Validate.validateInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhập tên mới: ");
                    productedit.setProductName(Validate.validateString());
                    System.out.println("Sửa tên thành công!");
                    break;
                case 2:
                    System.out.println("Danh sách danh mục sản phẩm cần chọn: ");
                    for (int j = 0; j < catalogService.findAll().size(); j++) {
                        System.out.println((j + 1) + ", " + catalogService.findAll().get(j).getCatalogName());
                    }
                    System.out.println("Mời chọn danh mục mới: ");
                    while (true) {
                        int choiceEdit = Validate.validateInt();
                        if (choiceEdit >= 1 && choiceEdit <= catalogService.findAll().size()) {
                            productedit.setCatalogs(catalogService.findAll().get(choiceEdit - 1));
                            break;
                        } else {
                            System.out.println(RED + "Không có danh mục theo lựa chọn, mời nhập lại" + RESET);
                        }
                    }
                    System.out.println("Sửa danh mục thành công!");
                    break;
                case 3:
                    System.out.println("Nhập mô tả sản phẩm mới: ");
                    productedit.setDescription(Validate.validateString());
                    System.out.println("Sửa mô tả thành công!");
                    break;
                case 4:
                    System.out.println("Nhập đơn giá mới: ");
                    productedit.setUnitPrice(Double.parseDouble(Validate.validateString()));
                    System.out.println("Sửa đơn giá thành công!");
                    break;
                case 5:
                    System.out.println("Nhập mới số lượng hàng tồn kho: ");
                    productedit.setStock(Integer.parseInt(Validate.validateString()));
                    System.out.println("Sửa số lượng thành công!");
                    break;
                default:
                    System.err.println(RED + "Nhập không hợp lệ, mời nhập lại" + RESET);
                    break;
            }
        } else {
            System.out.println(RED + "Không tìm thấy sản phẩm có ID: " + idEdit + " ___" + RESET);
        }
    }

    private void addProduct() {
        System.out.println("Nhập số lượng sản phẩm cần thêm");
        int n = Validate.validateInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Sản phẩm thứ " + (i + 1) + " ");
            Products products = new Products();
            products.setProductId(productService.getNewId());
            System.out.println("Nhập tên sản phẩm");
            products.setProductName(Validate.validateString());

            System.out.println("Danh mục sản phẩm");
            for (int j = 0; j < catalogService.findAll().size() ; j++) {
                Catalogs catalogs = catalogService.findAll().get(j);
                if (catalogs.isStatus()){
                    System.out.println((j+1) + " ," +catalogs.getCatalogName());
                }
            }
            System.out.println("Mời lựa chọn danh mục sản phẩm");
            while (true) {
                int choice = Validate.validateInt();
                if (choice >= 1 && choice <= catalogService.findAll().size()) {
                    Catalogs selectedCatalog = catalogService.findAll().get(choice - 1);
                    if (selectedCatalog.isStatus()) {
                        products.setCatalogs(selectedCatalog);
                        break;
                    } else {
                        System.out.println(RED + "Danh mục đã bị ẩn, mời chọn lại" + RESET);
                    }
                } else {
                    System.out.println(RED + "Lựa chọn không hợp lệ, mời nhập lại" + RESET);
                }
            }

            System.out.println("Nhập mô tả sản phẩm: ");
            products.setDescription(Validate.validateString());

            System.out.println("Nhập đơn giá: ");
            products.setUnitPrice(Double.parseDouble(Validate.validateString()));

            System.out.println("Nhập số lượng trong kho: ");
            products.setStock(Integer.parseInt(Validate.validateString()));

            System.out.println(YELLOW + "Thêm sản phẩm thành công" + RESET);
            productService.save(products);

        }


    }

    private void showProducts() {
        System.out.println("1.Tất cả sản phẩm");
        System.out.println("2.Sản phẩm mở bán");
        System.out.println("3.Sản phẩm không mở bán");
        System.out.println("0.Quay lại");

        int n = Validate.validateInt();

        if (n ==1 ){
            System.out.println("Tất cả sản phẩm");
            for (Products products : productService.findAll()) {
                System.out.println(products);
            }
        } else if (n == 2) {
            System.out.println("Sản phẩm đang mở bán");
            for (Products products : productService.findAll()) {
                if (products.isStatus()){
                    System.out.println(products);
                }
            }
        }else if (n == 3) {
            System.out.println("Sản phẩm không mở bán");
            for (Products products : productService.findAll()) {
                if (!products.isStatus()){
                    System.out.println(products);
                }
            }
        }else {
            System.out.println("Lựa chọn không hợp lệ");
        }


    }
}
