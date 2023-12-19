package ss16.exer.read_file;

import java.io.*;

public class ReadFileForSum {
    public static void main(String[] args) throws FileNotFoundException {
        readFileText("src/ss16/exer/read_file/numbers.txt");
    }

    public static void readFileText(String filePath) {
        try {
            File file = new File(filePath);
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            int sum = 0;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            System.out.println(sum);

            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
