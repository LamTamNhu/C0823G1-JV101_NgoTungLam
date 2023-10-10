package ss2.prac;

import java.util.Scanner;

public class AddEle {
    public static void main(String[] args) {
        int[] array = {1, 4, 6, 8, 10, 0};
        System.out.println("Array content:");
        for (int ele : array) {
            System.out.print(ele + " ");
        }
        System.out.println("\nEnter element to add");
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter element's index");
        int index;
        do {
            index = Integer.parseInt(scanner.nextLine());
            if (index <= -1 || index > array.length - 1) {
                System.out.println("Invalid index, please try again");
            } else break;
        } while (true);
        for (int i = array.length - 1; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = x;
        System.out.println("Result:");
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}
