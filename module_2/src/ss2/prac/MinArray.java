package ss2.prac;

public class MinArray {
    public static void main(String[] args) {
        int[] array = {1, -2, 5, 0};
        int min = array[0];
        for (int ele : array) {
            if (ele < min) {
                min = ele;
            }
        }
        System.out.println("Min value is: " + min);
    }
}
