package ss12.prac.arraylist_linkedlist.controller;

import ss12.prac.arraylist_linkedlist.model.Product;
import ss12.prac.arraylist_linkedlist.service.IProductService;
import ss12.prac.arraylist_linkedlist.service.ProductService;

import java.util.List;

public class ProductController {
    private IProductService productService = new ProductService();

    public List<Product> getAll() {
        return productService.getAll();
    }

    public Product findProductByName(String productName) {
        return productService.findProductByName(productName);
    }

    public Boolean addProduct(Product product) {
        return productService.addProduct(product);
    }

    public boolean editProduct(Integer id, Product product) {
        return productService.editProduct(id,product);
    }

    public boolean removeProduct(Integer id) {
        return productService.removeProduct(id);
    }

    public boolean checkIdInput(Integer id) {
        return productService.checkIdInput(id);
    }
}
