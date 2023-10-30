package ss17.prac.product_manager_binary_io.service;

import ss17.prac.product_manager_binary_io.model.Product;
import ss17.prac.product_manager_binary_io.repository.IProductRepository;
import ss17.prac.product_manager_binary_io.repository.impl.ProductRepository;

import java.util.List;

public class ProductService implements IProductService {
    IProductRepository productRepository = new ProductRepository();

    @Override
    public List<Product> getAll() {
        return productRepository.getAll();
    }

    @Override
    public Product findProductByName(String productName) {
        return productRepository.findByName(productName);
    }

    @Override
    public Boolean addProduct(Product product) {
        return productRepository.addEntry(product);
    }

    @Override
    public boolean removeProduct(Integer id) {
        return productRepository.removeByID(id);
    }

    @Override
    public boolean editProduct(Integer id, Product product) {
        return productRepository.editEntry(id,product);
    }

    @Override
    public boolean checkIdInput(Integer id) {
        return productRepository.findById(id) != null;
    }
}
