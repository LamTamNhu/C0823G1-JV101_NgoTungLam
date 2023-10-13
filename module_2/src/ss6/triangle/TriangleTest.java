package ss6.triangle;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Triangle triangle = new Triangle();
        System.out.println("Enter triangle's color: ");
        triangle.setColor(sc.nextLine());
        double side1;
        double side2;
        double side3;
        do {
            System.out.println("Enter first side: ");
            side1 = Double.parseDouble(sc.nextLine());
            System.out.println("Enter second side: ");
            side2 = Double.parseDouble(sc.nextLine());
            System.out.println("Enter third side: ");
            side3 = Double.parseDouble(sc.nextLine());
            if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
                System.out.println("Invalid triangle sides! please try again.");
            } else {
                triangle.setSide1(side1);
                triangle.setSide2(side2);
                triangle.setSide3(side3);
                break;
            }
        } while (true);
        System.out.println(triangle+"\nPerimeter: "+triangle.getPerimeter()+"\nArea: "+triangle.getArea());
    }
}
