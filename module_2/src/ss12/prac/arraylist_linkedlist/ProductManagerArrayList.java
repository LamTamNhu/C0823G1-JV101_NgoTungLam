package ss12.prac.arraylist_linkedlist;

import java.util.*;

public class ProductManagerArrayList {
    private static final ArrayList<Product> products = new ArrayList<>();

    public static void main(String[] args) {
        products.add(new Product(2, "Sekiro: Shadows Die Twice", 100));
        addProduct(3, "Elden Ring", 200);
        addProduct(1, "Armored Core", 59.99);
        displayProduct();
        findProduct("shadow");
        editProduct(2);
        removeProduct(3);
        sortProduct();
        displayProduct();
    }

    public static void addProduct(int id, String name, double price) {
        products.add(new Product(id, name, price));
    }

    public static void editProduct(int id) {
        Scanner scanner = new Scanner(System.in);
        for (Product p : products) {
            if (p.getId() == id) {
                System.out.println("Found product with id " + id);
                System.out.println(p);
                System.out.println("Enter product's new id");
                id = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter product's new name");
                String name = scanner.nextLine();
                System.out.println("Enter product's new price");
                double price = Double.parseDouble(scanner.nextLine());

                p.setId(id);
                p.setName(name);
                p.setPrice(price);
                return;
            }
        }

        System.out.println("No entry with id " + id + " found.");
    }

    public static void removeProduct(int id) {
        Scanner scanner = new Scanner(System.in);
        int length = products.size();
        for (int i = 0; i < length; i++) {
            if (products.get(i).getId() == id) {
                System.out.println("Product with id " + id + " found, confirm delete? Enter Y to continue.");
                String confirm = scanner.nextLine();
                if (Objects.equals(confirm, "Y")) {
                    products.remove(i);
                }
                return;
            }
        }
        System.out.println("No entry with id " + id + " found.");
    }

    public static void displayProduct() {
        for (Product e : products) {
            System.out.println(e);
        }
        System.out.println("-----------------");
    }

    public static void sortProduct() {
        products.sort(null);
    }

    public static void findProduct(String name) {
        name=name.toLowerCase();
        String nameChecker;
        boolean isExist = false;
        for (Product p : products) {
            nameChecker=p.getName().toLowerCase();
            if (nameChecker.contains(name)) {
                System.out.println(p);
                isExist = true;
            }
        }
        if (isExist) {
            return;
        }
        System.out.println("No entry with id " + name + " found.");
    }
}
