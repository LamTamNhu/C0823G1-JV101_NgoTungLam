package ss15.prac.triangle_exception;

import java.util.Scanner;

public class TriangleExceptionTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first side");
        double side1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter second side");
        double side2 = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter third side");
        double side3 = Double.parseDouble(scanner.nextLine());

        boolean isSidesLessThanZero = side1 <= 0 || side2 <= 0 | side3 <= 0;
        boolean isNotValidSums = side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1;
        try {
            if ((isSidesLessThanZero)) {
                throw new IllegalTriangleException("One of the sides are not more than 0");
            }
            if (isNotValidSums) {
                throw new IllegalTriangleException("Three sides sums are invalid");
            }
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }
    }
}
