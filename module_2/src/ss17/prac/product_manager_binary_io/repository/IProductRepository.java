package ss17.prac.product_manager_binary_io.repository;

import ss17.prac.product_manager_binary_io.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> getAll();

    Product findByName(String productName);

    Boolean addEntry(Product product);

//    boolean removeByID(Integer id);
//
//    boolean editEntry(Integer id, Product product);

    Product findById(Integer id);
}
