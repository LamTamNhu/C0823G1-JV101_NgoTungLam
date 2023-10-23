package ss11.prac.palindrome;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string to check");
        String string = scanner.nextLine();
        string = string.toLowerCase();
        System.out.println(string);
        Stack<Character> reverseString = new Stack<>();
        Queue<Character> normalString = new ArrayDeque<>();
        int length = string.length();
        char c;
        for (int i = 0; i < length; i++) {
            c = string.charAt(i);
            normalString.add(c);
            reverseString.push(c);
        }

        while (!normalString.isEmpty()) {
            if (normalString.peek() == reverseString.peek()) {
                normalString.poll();
                reverseString.pop();
            } else {
                break;
            }
        }

        if (normalString.isEmpty()) {
            System.out.println("String IS palindrome");
        } else {
            System.out.println("String is NOT palindrome.");
        }
    }
}
