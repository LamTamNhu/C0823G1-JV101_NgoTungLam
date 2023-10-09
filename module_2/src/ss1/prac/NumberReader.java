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
        }
        return "wrong input";
    }

    private static String convertTens(int num) {
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
        System.out.println("Enter your weight:");
        int num = Integer.parseInt(scanner.nextLine());
        if (num <= 0) {
            System.out.println("Weight must be more than 0");
            return;
        }
        if (num > 999) {
            System.out.println("Weight must be less than 999");
            return;
        }
        if (num <= 19) {
            switch (num) {
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                case 10:
                    System.out.println("Ten");
                    break;
                case 11:
                    System.out.println("Eleven");
                    break;
                case 12:
                    System.out.println("Twelve");
                    break;
                case 13:
                    System.out.println("Thirteen");
                    break;
                case 14:
                    System.out.println("Fourteen");
                    break;
                case 15:
                    System.out.println("Fifteen");
                    break;
                case 16:
                    System.out.println("Sixteen");
                    break;
                case 17:
                    System.out.println("Seventeen");
                    break;
                case 18:
                    System.out.println("Eighteen");
                    break;
                case 19:
                    System.out.println("Nineteen");
                    break;
            }
            return;
        }
        String unit = convertUnit(num % 10);
        if (num <= 99) {
            System.out.println(convertTens(num) + unit);
            return;
        }
        System.out.println(convertUnit(num / 100) + " hundred " + convertTens(num % 100) + unit);
    }
}
