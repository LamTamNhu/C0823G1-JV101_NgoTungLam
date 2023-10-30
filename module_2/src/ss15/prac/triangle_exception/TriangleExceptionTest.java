package ss15.prac.triangle_exception;

import java.util.Scanner;

public class TriangleExceptionTest {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double side1 = inputTriangleSide(1);
        double side2 = inputTriangleSide(2);
        double side3 = inputTriangleSide(3);

        boolean isNotValidSums = side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1;
        try {
            if (isNotValidSums) {
                throw new IllegalTriangleException("Three sides sums are invalid");
            }
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }
    }

    private static double inputTriangleSide(int sideCount) {
        switch (sideCount) {
            case 1:
                System.out.println("Input first side");
                break;
            case 2:
                System.out.println("Input second side");
                break;
            case 3:
                System.out.println("Input third side");
        }
        double side = 0;
        do {
            try {
                side = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, try again!");;
            }
            if (side <= 0) {
                System.out.println("Triangle side must be more than 0, try again!");
            }
        } while (side <= 0);
        return side;
    }

}
