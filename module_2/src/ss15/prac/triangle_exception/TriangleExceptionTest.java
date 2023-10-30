package ss15.prac.triangle_exception;

import java.util.Scanner;

public class TriangleExceptionTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double side1 = 0, side2 = 0, side3 = 0;
        try {
            System.out.println("Enter first side");
            side1 = Double.parseDouble(scanner.nextLine());
            checkSideLessThanZero(side1);
            System.out.println("Enter second side");
            side2 = Double.parseDouble(scanner.nextLine());
            checkSideLessThanZero(side2);
            System.out.println("Enter third side");
            side3 = Double.parseDouble(scanner.nextLine());
            checkSideLessThanZero(side3);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }

        boolean isNotValidSums = side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1;
        try {
            if (isNotValidSums) {
                throw new IllegalTriangleException("Three sides sums are invalid");
            }
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void checkSideLessThanZero(double side) throws IllegalTriangleException {
        if (side <= 0) {
            throw new IllegalTriangleException("Side need to be more than 0");
        }
    }
}
