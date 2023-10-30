package ss17.prac.product_manager_binary_io.repository.impl;

import ss17.prac.product_manager_binary_io.model.Product;
import ss17.prac.product_manager_binary_io.repository.IProductRepository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static final List<Product> products = new ArrayList<>();

//    static {
//        File data = new File("src/ss17/prac/product_manager_binary_io/data/ProductList.dat");
//        if (data.exists() && data.length() > 0) {
//            try (FileInputStream fileInputStream = new FileInputStream(data);
//                 ObjectInputStream input = new ObjectInputStream(fileInputStream)) {
//                Product product;
//                while ((product = (Product) input.readObject()) != null){
//                    products.add(product);
//                }
//            } catch (IOException | ClassNotFoundException e) {
//                e.printStackTrace();
//            }
//        }
//    }

    @Override
    public List<Product> getAll() {
        return products;
    }

    @Override
    public Product findByName(String productName) {
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
        if (findById(product.getId()) == null) {
            products.add(product);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean removeByID(Integer id) {
        Product productToRemove = findById(id);
        if (productToRemove != null) {
            products.remove(productToRemove);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean editEntry(Integer id, Product product) {
        try {
            Product productToEdit = findById(id);
            productToEdit.setName(product.getName());
            productToEdit.setPrice(product.getPrice());
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public Product findById(Integer id) {
        for (Product product : products) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }
}
