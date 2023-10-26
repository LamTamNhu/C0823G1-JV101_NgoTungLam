package ss12.prac.arraylist_linkedlist.repository.impl;

import ss12.prac.arraylist_linkedlist.model.Product;
import ss12.prac.arraylist_linkedlist.repository.IProductRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class ProductRepository implements IProductRepository {
    private static final List<Product> products = new ArrayList<>();

    static {
        products.add(new Product(1, "Sekiro: Shadows Die Twice", 100.0));
        products.add(new Product(2, "Armored Core 6", 59.99));
    }

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
