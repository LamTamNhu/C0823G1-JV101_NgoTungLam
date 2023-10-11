package ss2.prac;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        int[] array1 = new int[4];
        int[] array2 = new int[3];
        int[] arrayResult = new int[array1.length + array2.length];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Enter first array element at " + i);
            array1[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int i = 0; i < array2.length; i++) {
            System.out.println("Enter second array element at " + i);
            array2[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int i = 0; i < array1.length; i++) {
            arrayResult[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            arrayResult[i + array1.length] = array2[i];
        }
        System.out.println("Merged array: ");
        for (int ele : arrayResult) {
            System.out.print(ele + " ");
        }
    }
}
