package ss1.excer;

import java.util.Scanner;

public class RectArea {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in);//Khai báo đối tượng Scanner

        System.out.println("Enter width: ");
        width = Integer.parseInt(scanner.nextLine());//Nhập chiều rộng

        System.out.println("Enter height: ");
        height = scanner.nextFloat();//Nhập chiều cao

        System.out.println(width);
        System.out.println(height);
    }
}