package ss2.prac;

import java.util.Scanner;

public class GeometryDisplay {
    private static void drawRectangle() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void drawSquareTriangle() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void drawIsoscelesTriangle() {
        byte space = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                if (Math.abs(j - 4) <= space) {
                    System.out.print("* ");
                } else System.out.print("  ");
            }
            System.out.println();
            space++;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("1. Print the rectangle\n" +
                    "2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)\n" +
                    "3. Print isosceles triangle\n" +
                    "4. Exit");
            byte input = scanner.nextByte();
            switch (input) {
                case 1:
                    drawRectangle();
                    break;
                case 2:
                    drawSquareTriangle();
                    break;
                case 3:
                    drawIsoscelesTriangle();
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("Wrong input!");
            }
        } while (flag);
    }
}
