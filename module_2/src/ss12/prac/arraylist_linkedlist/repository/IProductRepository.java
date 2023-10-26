package ss12.prac.arraylist_linkedlist.repository;

import ss12.prac.arraylist_linkedlist.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> getAll();

    Product findByName(String productName);

    Boolean addEntry(Product product);

    boolean removeByID(Integer id);

    boolean editEntry(Integer id, Product product);

    Product findById(Integer id);
}
