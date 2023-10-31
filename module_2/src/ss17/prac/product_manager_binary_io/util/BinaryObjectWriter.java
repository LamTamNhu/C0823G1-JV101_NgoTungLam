package ss17.prac.product_manager_binary_io.util;

import ss17.prac.product_manager_binary_io.model.Product;

import java.io.*;
import java.util.List;

public class BinaryObjectWriter {
    private static final String PATH = "src/ss17/prac/product_manager_binary_io/data/ProductList.txt";

    public static void writeToFile(List<Product> objectToWrite) {
        ObjectOutputStream objectOutput = null;
        try {
            FileOutputStream outputStream = new FileOutputStream(PATH);
            objectOutput = new ObjectOutputStream(outputStream);
            objectOutput.writeObject(objectToWrite);
            System.out.println("Write succeed.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                objectOutput.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
