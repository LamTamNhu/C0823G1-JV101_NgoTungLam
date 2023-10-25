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
}
