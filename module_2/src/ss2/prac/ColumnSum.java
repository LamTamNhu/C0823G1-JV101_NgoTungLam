package ss2.prac;

import java.util.Scanner;

public class ColumnSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter matrix height");
        int height = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter matrix width");
        int width = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.println("Enter integer at matrix[" + i + "][" + j + "]");
                matrix[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        int col;
        do {
            System.out.println("Enter column for sum");
            col = Integer.parseInt(scanner.nextLine());
            if (col <= 0 || col > matrix.length) {
                System.out.println("Invalid column, please try again");
            } else break;
        } while (true);
        int sum = 0;
        for (int[] ints : matrix) {
            sum += ints[col - 1];
        }
        System.out.println("Sum of all element at column " + col + " is: " + sum);
    }
}
