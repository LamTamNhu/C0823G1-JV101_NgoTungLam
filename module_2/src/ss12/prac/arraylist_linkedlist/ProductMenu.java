package ss12.prac.arraylist_linkedlist;

import com.sun.java.swing.plaf.windows.WindowsDesktopPaneUI;
import ss12.prac.arraylist_linkedlist.controller.ProductController;
import ss12.prac.arraylist_linkedlist.model.Product;

import java.util.*;

public class ProductMenu {
    private static final Scanner scanner = new Scanner(System.in);
    private static int input;

    public static void main(String[] args) {
        ProductController productController = new ProductController();
        do {
            System.out.println("------Product Menu------");
            System.out.print("1. Display product list.\n" +
                    "2. Find product by name.\n" +
                    "3. Add product.\n" +
                    "4. Edit product by id.\n" +
                    "5. Remove product by id.\n" +
                    "0. Exit\n" +
                    "Select a number: ");
            input = Integer.parseInt(scanner.nextLine());
            switch (input) {
                case 1:
                    System.out.println("-----Product List-----");
                    List<Product> products = new ArrayList<>();
                    products = productController.getAll();
                    for (Product product : products) {
                        System.out.println(product);
                    }
                    break;
//                case 2:
//                    productController.findProduct();
//                    break;
//                case 3:
//                    productController.addProduct();
//                    break;
//                case 4:
//                    productController.editProduct();
//                    break;
//                case 5:
//                    productController.removeProduct();
//                    break;
                case 0:
                    System.exit(0);
            }
        } while (true);
    }
}
