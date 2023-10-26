package ss12.prac.arraylist_linkedlist.service;

import ss12.prac.arraylist_linkedlist.model.Product;
import ss12.prac.arraylist_linkedlist.repository.IProductRepository;
import ss12.prac.arraylist_linkedlist.repository.impl.ProductRepository;

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
