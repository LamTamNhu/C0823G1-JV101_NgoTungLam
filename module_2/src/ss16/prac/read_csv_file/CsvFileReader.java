package ss16.prac.read_csv_file;

import java.io.*;
import java.util.Scanner;

public class CsvFileReader {
    public static void ReadDisplayCsvFile(String filePath) {
        File file = new File(filePath);
        try {
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            String[] parsedLine;
            while ((line = reader.readLine()) != null) {
                parsedLine = line.split(",");
                System.out.println("id: " + parsedLine[0] + " | code: " + parsedLine[1] + " | name: " + parsedLine[2]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
