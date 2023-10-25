package ss12.prac.arraylist_linkedlist.repository;

import ss12.prac.arraylist_linkedlist.model.Product;

import java.util.ArrayList;
import java.util.List;

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
}
