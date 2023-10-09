package ss1.prac;

import java.util.Scanner;

public class NumberReader {
    private static String convertUnit(int num) {
        switch (num) {
            case 0:
                return "";
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            case 10:
                return "ten";
            case 11:
                return "eleven";
            case 12:
                return "twelve";
            case 13:
                return "thirteen";
            case 14:
                return "fourteen";
            case 15:
                return "fifteen";
            case 16:
                return "sixteen";
            case 17:
                return "seventeen";
            case 18:
                return "eighteen";
            case 19:
                return "nineteen";
        }
        return "wrong input";
    }

    private static String convertTens(int num) {
        if (num < 20) {
            return "";
        }
        if (num < 30) {
            return "twenty ";
        } else if (num < 40) {
            return "thirty ";
        } else if (num < 50) {
            return "forty ";
        } else if (num < 60) {
            return "fifty ";
        } else if (num < 70) {
            return "sixty ";
        } else if (num < 80) {
            return "seventy ";
        } else if (num < 90) {
            return "eighty ";
        } else {
            return "ninety ";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number:");
        int num = Integer.parseInt(scanner.nextLine());
        if (num <= 0) {
            System.out.println("Number must be more than 0");
            return;
        }
        if (num > 999) {
            System.out.println("Number must be less than 999");
            return;
        }
        if (num <= 19) {
            System.out.println(convertUnit(num));
            return;
        }
        if (num <= 99) {
            System.out.println(convertTens(num) + convertUnit(num % 10));
            return;
        }
        if (num % 100 < 20) {
            System.out.println(convertUnit(num / 100) + " hundred " + convertUnit(num % 100));
            return;
        }
        System.out.println(convertUnit(num / 100) + " hundred " + convertTens(num % 100) + convertUnit(num % 10));
    }
}
