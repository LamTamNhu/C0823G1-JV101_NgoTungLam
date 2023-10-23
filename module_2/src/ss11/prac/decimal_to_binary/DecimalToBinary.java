package ss11.prac.decimal_to_binary;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        int modResult;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter decimal number");
        int num = Integer.parseInt(scanner.nextLine());
        Stack<Integer> modStack = new Stack<>();
        do {
            modResult = num % 2;
            modStack.push(modResult);
            num = num / 2;
        } while (num > 0);
        System.out.print("Binary: ");
        for (int e : modStack) {
            System.out.print(e);
        }
    }
}
