package ss17.prac.product_manager_binary_io.repository.impl;

import ss17.prac.product_manager_binary_io.model.Product;
import ss17.prac.product_manager_binary_io.repository.IProductRepository;
import ss17.prac.product_manager_binary_io.util.BinaryObjectReader;
import ss17.prac.product_manager_binary_io.util.BinaryObjectWriter;

import java.util.List;

public class ProductRepository implements IProductRepository {
    private static List<Product> products;

    static {
        updateFromFile();
    }

    private static void updateFromFile() {
        products = BinaryObjectReader.readFile();
    }

    private static void writeToFile() {
        BinaryObjectWriter.writeToFile(products);
    }

    @Override
    public List<Product> getAll() {
        updateFromFile();
        return products;
    }

    @Override
    public Product findByName(String productName) {
        updateFromFile();
        String nameLowercase;
        for (Product product : products) {
            nameLowercase = product.getName().toLowerCase();
            if (nameLowercase.contains(productName)) {
                return product;
            }
        }
        return null;
    }

    @Override
    public Boolean addEntry(Product product) {
        updateFromFile();
        products.add(product);
        writeToFile();
        return true;
    }

//    @Override
//    public boolean removeByID(Integer id) {
//        Product productToRemove = findById(id);
//        if (productToRemove != null) {
//            products.remove(productToRemove);
//            return true;
//        } else {
//            return false;
//        }
//    }

//    @Override
//    public boolean editEntry(Integer id, Product product) {
//        try {
//            Product productToEdit = findById(id);
//            productToEdit.setName(product.getName());
//            productToEdit.setPrice(product.getPrice());
//            return true;
//        } catch (Exception e) {
//            return false;
//        }
//    }

    @Override
    public Product findById(Integer id) {
        updateFromFile();
        for (Product product : products) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }
}
