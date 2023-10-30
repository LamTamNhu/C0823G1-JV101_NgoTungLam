package ss17.prac.product_manager_binary_io.view;

import ss17.prac.product_manager_binary_io.controller.ProductController;
import ss17.prac.product_manager_binary_io.model.Product;

import java.util.List;
import java.util.Scanner;

public class ProductMenu {
    private static final ProductController productController = new ProductController();
    private static final String invalidInput = "Invalid input, try again!";
    private static final Scanner scanner = new Scanner(System.in);
    private static Integer id;
    private static Product product;
    private static final String menu =
            "------Product Menu------\n" +
                    "1. Display product list.\n" +
                    "2. Find product by name.\n" +
                    "3. Add product.\n" +
                    "0. Exit\n" +
                    "Select a number: ";


    public static void main(String[] args) {
        do {
            System.out.print(menu);
            int input;
            try {
                input = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(invalidInput);
                enterToContinue();
                continue;
            }

            switch (input) {
                case 1:
                    displayProducts();
                    break;
                case 2:
                    findProductByName();
                    break;
                case 3:
                    addProduct();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println(invalidInput);
            }
        } while (true);
    }

//    private static void removeProduct() {
//        id = inputId();
//        if (productController.removeProduct(id)) {
//            System.out.println("Product removed!");
//        } else {
//            System.out.println("Can't find this id!");
//        }
//        enterToContinue();
//    }
//
//    private static void editProduct() {
//        id = inputId();
//        if (!productController.checkIdInput(id)) {
//            System.out.println("Can't find any product with this id!");
//            enterToContinue();
//            return;
//        }
//        product = inputInfo();
//        product.setId(id);
//        if (productController.editProduct(id, product)) {
//            System.out.println("Edit succeed!");
//        } else {
//            System.out.println("Unknown error!");
//        }
//        enterToContinue();
//    }

    private static void addProduct() {
        id = inputId();
        if (productController.checkIdInput(id)) {
            System.out.println("This id already existed in list!");
            enterToContinue();
            return;
        }
        product = inputInfo();
        product.setId(id);
        Boolean isSuccess = productController.addProduct(product);
        if (isSuccess) {
            System.out.println("Product added!");
        } else {
            System.out.println("Unknown error");
        }
        enterToContinue();
    }

    private static void findProductByName() {
        System.out.print("Enter product's name: ");
        String productName = scanner.nextLine().toLowerCase();
        product = productController.findProductByName(productName);
        if (product != null) {
            System.out.println(product);
        } else {
            System.out.println("Can't find any product with name: " + productName);
        }
        enterToContinue();
    }

    private static void displayProducts() {
        List<Product> products;
        System.out.println("-----Product List-----");
        products = productController.getAll();
        for (Product productElement : products) {
            System.out.println(productElement);
        }
        enterToContinue();
    }

    private static Product inputInfo() {
        System.out.print("Enter product's name: ");
        String name = scanner.nextLine();
        double price;
        do {
            System.out.print("Enter product's price: ");
            try {
                price = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(invalidInput);
                continue;
            }
            break;
        } while (true);
        System.out.print("Enter brand: ");
        String brand = scanner.nextLine();
        System.out.println("Enter description:");
        String description = scanner.nextLine();
        return new Product(name, price, brand, description);
    }

    private static Integer inputId() {
        System.out.print("Enter product's id: ");
        try {
            return Integer.valueOf(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println(invalidInput);
            enterToContinue();
            return inputId();
        }
    }

    private static void enterToContinue() {
        System.out.print("Hit enter to continue");
        scanner.nextLine();
    }
}
