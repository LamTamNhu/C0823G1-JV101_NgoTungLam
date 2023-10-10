package ss2.prac;

import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter rect matrix width");
        int width = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[width][width];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < width; j++) {
                System.out.println("Enter integer at matrix[" + i + "][" + j + "]");
                matrix[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        int sum = 0;
        for (int i = 0; i < width; i++) {
            sum += matrix[i][i];
        }
        System.out.println("Diagonal sum is: " + sum);
    }
}
