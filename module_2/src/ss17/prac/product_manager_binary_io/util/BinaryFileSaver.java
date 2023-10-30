package ss17.prac.product_manager_binary_io.util;

import ss17.prac.product_manager_binary_io.model.Product;
import ss17.prac.product_manager_binary_io.repository.impl.ProductRepository;

import java.io.*;
import java.util.List;


public class BinaryFileSaver {
    private static final File data = new File("src/ss17/prac/product_manager_binary_io/data/ProductList.dat");

    public static void outputToBinaryFile() {
        ProductRepository repository = new ProductRepository();
        List<Product> products = repository.getAll();
        try {
            FileOutputStream outputStream = new FileOutputStream(data);
            ObjectOutputStream objectOutput = new ObjectOutputStream(outputStream);
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

}
