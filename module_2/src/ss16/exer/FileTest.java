package ss16.exer;

import java.io.*;
import java.util.Arrays;
import java.util.Objects;

public class FileTest {
    public static void main(String[] args) throws IOException {
        try {
            File file = new File("lul.txt");
            file.delete();
            File dir = new File("Books");
            dir.mkdir();
            System.out.println(dir.getAbsolutePath());
            if (dir.isDirectory()) {
                String[] dirContents = dir.list();
                for (int i = 0; i < Objects.requireNonNull(dirContents).length; i++) {
                    System.out.println(dirContents[i]);
                }
            }
            dir.delete();
//        try {
//            file.createNewFile();
//        }catch (IOException e){
//            System.out.println(Arrays.toString(e.getStackTrace()));
//        }
//        FileWriter writer=new FileWriter("lul.txt");
//        try{
//            writer.write("AYO HUH!? Vedal explains!");
//        }catch (IOException e){
//            System.out.println("Wat nigga!?");
//        }
//            FileReader fileReader = new FileReader(file);
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//            String line = null;
//            while ((line = bufferedReader.readLine()) != null) {
//                System.out.println(line);
//            }
//            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
