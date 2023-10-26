package ss12.prac.arraylist_linkedlist.view;

import ss12.prac.arraylist_linkedlist.controller.ProductController;
import ss12.prac.arraylist_linkedlist.model.Product;

import java.util.*;

public class ProductMenu {
    private static final Scanner scanner = new Scanner(System.in);

    private static int input;

    public static void main(String[] args) {
        ProductController productController = new ProductController();
        List<Product> products;
        Integer id;
        do {
            System.out.println("------Product Menu------");
            System.out.print("1. Display product list.\n" +
                    "2. Find product by name.\n" +
                    "3. Add product.\n" +
                    "4. Edit product by id.\n" +
                    "5. Remove product by id.\n" +
                    "0. Exit\n" +
                    "Select a number: ");
            try {
                input = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid input, try again!");
                enterToContinue();
                continue;
            }

            Product product;
            switch (input) {
                case 1:
                    System.out.println("-----Product List-----");
                    products = productController.getAll();
                    for (Product productElement : products) {
                        System.out.println(productElement);
                    }
                    enterToContinue();
                    break;
                case 2:
                    System.out.print("Enter product's name: ");
                    String productName = scanner.nextLine().toLowerCase();
                    product = productController.findProductByName(productName);
                    if (product != null) {
                        System.out.println(product);
                    } else {
                        System.out.println("Can't find any product with name: " + productName);
                    }
                    enterToContinue();
                    break;
                case 3:
                    id = inputId();
                    if (productController.checkIdInput(id)) {
                        System.out.println("This id already existed in list!");
                        enterToContinue();
                        break;
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
                    break;
                case 4:
                    id = inputId();
                    if (!productController.checkIdInput(id)) {
                        System.out.println("Can't find any product with this id!");
                        enterToContinue();
                        break;
                    }
                    product = inputInfo();
                    product.setId(id);
                    if (productController.editProduct(id, product)) {
                        System.out.println("Edit succeed!");
                    } else {
                        System.out.println("Unknown error!");
                    }
                    enterToContinue();
                    break;
                case 5:
                    id = inputId();
                    if (productController.removeProduct(id)) {
                        System.out.println("Product removed!");
                    } else {
                        System.out.println("Can't find this id!");
                    }
                    enterToContinue();
                    break;
                case 0:
                    System.exit(0);
            }
        } while (true);
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
                System.out.println("Invalid price input, try again!");
                continue;
            }
            break;
        } while (true);
        return new Product(name, price);
    }

    private static Integer inputId() {
        System.out.print("Enter product's id: ");
        try {
            return Integer.valueOf(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input, try again!");
            enterToContinue();
            return inputId();
        }
    }

    private static void enterToContinue() {
        System.out.print("Hit enter to continue");
        scanner.nextLine();
    }
}
