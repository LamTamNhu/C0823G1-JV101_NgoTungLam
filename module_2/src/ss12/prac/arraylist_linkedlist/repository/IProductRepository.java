package ss12.prac.arraylist_linkedlist.repository;

import ss12.prac.arraylist_linkedlist.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> getAll();
}
