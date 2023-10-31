package ss17.prac.product_manager_binary_io.util;

import ss17.prac.product_manager_binary_io.model.Product;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class BinaryObjectReader {
    private static final String PATH = "src/ss17/prac/product_manager_binary_io/data/ProductList.txt";

    public static List<Product> readFile() {
        ObjectInputStream objectInput = null;
        List<Product> result = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(PATH);
            objectInput = new ObjectInputStream(fileInputStream);
            result = (List<Product>) objectInput.readObject();
        } catch (EOFException e) {
            System.out.println("Read from file done.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (objectInput != null) {
                try {
                    objectInput.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        if (result == null) {
            return new ArrayList<Product>();
        } else {
            return result;
        }
    }
}
