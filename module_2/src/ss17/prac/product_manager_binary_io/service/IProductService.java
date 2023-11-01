package ss17.prac.product_manager_binary_io.service;

import ss17.prac.product_manager_binary_io.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> getAll();

    Product findProductByName(String productName);

    Boolean addProduct(Product product);

//    boolean removeProduct(Integer id);
//
//    boolean editProduct(Integer id, Product product);

    boolean checkIdInput(Integer id);
}
