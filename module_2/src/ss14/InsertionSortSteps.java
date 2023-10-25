package ss14;

import java.util.Arrays;

public class InsertionSortSteps {
    public static void main(String[] args) {
        int[] numbers = new int[]{11, 2, 32, 4, 54, 65, 7, 87, 9};
        insertionSort(numbers);
    }

    public static void insertionSort(int[] list) {
        System.out.println("Original array");
        System.out.println(Arrays.toString(list));
        int listLength = list.length;
        int checkingPosition;
        int checkingNum;
        boolean isSwitched;
        for (int i = 0; i < listLength; i++) {
            isSwitched = false;
            checkingNum = list[i];
            checkingPosition = i;
            System.out.println("Pass number " + (i + 1) + " at index " + i);
            while (checkingPosition > 0 && checkingNum < list[checkingPosition - 1]) {
                System.out.println(checkingNum + " < " + list[checkingPosition - 1] +
                        " at index " + (checkingPosition - 1) + ", switching position");
                list[checkingPosition] = list[checkingPosition - 1];
                list[checkingPosition - 1] = checkingNum;
                System.out.println("Array after switch");
                System.out.println(Arrays.toString(list));
                System.out.println("--------------");
                checkingPosition--;
                isSwitched = true;
            }
            list[checkingPosition] = checkingNum;
            if (!isSwitched) {
                System.out.println("No change to array");
            } else {
                System.out.println("Array after pass number " + i + "\n" + Arrays.toString(list));
            }
        }
    }
}
