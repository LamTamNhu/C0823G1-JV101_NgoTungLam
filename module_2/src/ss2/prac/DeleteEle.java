package ss2.prac;

import java.util.Scanner;

public class DeleteEle {
    public static void main(String[] args) {
        int[] array = {1, 4, 6, 8, 10};
        System.out.println("Array content:");
        for (int ele : array) {
            System.out.print(ele + " ");
        }
        System.out.println("\nEnter element to delete");
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                System.out.println("Found " + x + " at index: " + i);
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = 0;
                break;
            }
        }
        System.out.println("Array content after deletion:");
        for (int ele : array) {
            System.out.print(ele + " ");
        }
    }
}
