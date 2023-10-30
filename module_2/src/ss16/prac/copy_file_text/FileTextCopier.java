package ss16.prac.copy_file_text;

import java.io.*;
import java.util.Scanner;

public class FileTextCopier {
    public static void copyFileText(String sourcePath, String targetPath) {
        Scanner scanner = new Scanner(System.in);
        File sourceFile = new File(sourcePath);
        File targetFile = new File(targetPath);
        try {
            if (!sourceFile.exists()) {
                throw new FileNotFoundException();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return;
        }

        boolean isConfirm = true;
        String input;
        if (targetFile.exists()) {
            System.out.print("Target file already exist, overwrite it? Y/N: ");
            do {
                input = scanner.nextLine();
                if (input.equalsIgnoreCase("y")) {
                    break;
                } else if (input.equalsIgnoreCase("n")) {
                    System.out.println("Terminate from user input.");
                    isConfirm = false;
                    break;
                } else {
                    System.out.println("Invalid input, try again!");
                }
            } while (true);
        }
        if (!isConfirm) {
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(targetFile))) {
            String line;
            int charCount = 0;
            while ((line = reader.readLine()) != null) {
                charCount += line.length();
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Write to file succeed!");
            System.out.println("File have " + charCount + " characters");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
