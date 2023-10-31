package ss17.prac.product_manager_binary_io.controller;

import ss17.prac.product_manager_binary_io.model.Product;
import ss17.prac.product_manager_binary_io.service.IProductService;
import ss17.prac.product_manager_binary_io.service.ProductService;
import ss17.prac.product_manager_binary_io.util.BinaryObjectWriter;

import java.util.List;

public class ProductController {
    private final IProductService productService = new ProductService();

    public List<Product> getAll() {
        return productService.getAll();
    }

    public Product findProductByName(String productName) {
        return productService.findProductByName(productName);
    }

    public Boolean addProduct(Product product) {
        boolean result;
        result = productService.addProduct(product);
        BinaryObjectWriter.writeToFile(getAll());
        return result;
    }

    public boolean editProduct(Integer id, Product product) {
        return productService.editProduct(id, product);
    }

    public boolean removeProduct(Integer id) {
        return productService.removeProduct(id);
    }

    public boolean checkIdInput(Integer id) {
        return productService.checkIdInput(id);
    }
}
