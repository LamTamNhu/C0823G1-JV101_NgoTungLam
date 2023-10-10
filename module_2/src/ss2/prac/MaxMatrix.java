package ss2.prac;

import java.util.Scanner;

public class MaxMatrix {


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
        int max = matrix[0][0];
        int row = 0;
        int col = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        System.out.println("Max value is: " + max + " at [" + row + "][" + col + "]");
    }
}
