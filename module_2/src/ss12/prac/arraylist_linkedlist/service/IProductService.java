package ss12.prac.arraylist_linkedlist.service;

import ss12.prac.arraylist_linkedlist.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> getAll();

    Product findProductByName(String productName);

    Boolean addProduct(Product product);

    boolean removeProduct(Integer id);

    boolean editProduct(Integer id, Product product);

    boolean checkIdInput(Integer id);
}
