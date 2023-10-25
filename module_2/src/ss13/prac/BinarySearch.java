package ss13.prac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer numbers in array, separate by space");
        String input = scanner.nextLine();
        System.out.println("Enter number to find");
        int value = Integer.parseInt(scanner.nextLine());
        String[] splittedString = input.split(" ");
        int arraySize = splittedString.length;
        Integer[] parsedNums = new Integer[arraySize];
        for (int i = 0; i < arraySize; i++) {
            parsedNums[i] = Integer.parseInt(splittedString[i]);
        }
        ArrayList<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, parsedNums);
        numbers.sort(null);
        int[] sortedNums = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            sortedNums[i] = numbers.get(i);
        }
        System.out.println("Sorted array: ");
        System.out.println(numbers);
        System.out.println(binarySearch(sortedNums, 0, arraySize, value));
    }

    public static int binarySearch(int[] array, int left, int right, int value) {
        if (right >= left) {
            int middle = (right + left) / 2;
            if (array[middle] == value) {
                return middle;
            } else if (array[middle] > value) {
                return binarySearch(array, left, middle - 1, value);
            }
            if (array[middle] < value) {
                return binarySearch(array, middle + 1, right, value);
            }
        }
        return -1;
    }
}
