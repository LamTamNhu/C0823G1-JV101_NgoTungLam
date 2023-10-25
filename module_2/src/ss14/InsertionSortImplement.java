package ss14;

import java.util.Arrays;

public class InsertionSortImplement {
    public static void main(String[] args) {
        int[] numbers = new int[]{11, 2, 32, 4, 54, 65, 7, 87, 9};
        insertionSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static void insertionSort(int[] list) {
        int listLength = list.length;
        int checkingPosition;
        int checkingNum;
        for (int i = 0; i < listLength; i++) {
            checkingNum = list[i];
            checkingPosition = i;
            while (checkingPosition > 0 && checkingNum < list[checkingPosition - 1]) {
                list[checkingPosition] = list[checkingPosition - 1];
                checkingPosition--;
            }
            list[checkingPosition] = checkingNum;
        }
    }
}
