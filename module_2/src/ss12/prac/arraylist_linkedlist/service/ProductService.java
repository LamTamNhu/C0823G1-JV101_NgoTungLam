package ss12.prac.arraylist_linkedlist.service;

import ss12.prac.arraylist_linkedlist.model.Product;
import ss12.prac.arraylist_linkedlist.repository.IProductRepository;
import ss12.prac.arraylist_linkedlist.repository.ProductRepository;

import java.util.List;

public class ProductService implements IProductService {
    IProductRepository productRepository = new ProductRepository();

    @Override
    public List<Product> getAll() {
        return productRepository.getAll();
    }
}
