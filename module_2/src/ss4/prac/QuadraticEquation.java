package ss4.prac;

import java.util.Scanner;

public class QuadraticEquation {
    double a;
    double b;
    double c;

    QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return b * 2 - 4 * a * c;
    }

    public double getRoot1() {
        return ((-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a);
    }

    public double getRoot2() {
        return ((-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter b");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter c");
        double c = Double.parseDouble(scanner.nextLine());
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDiscriminant() < 0) {
            System.out.println("The equation has no roots");
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("The equation has 1 roots: " + quadraticEquation.getRoot1());
        } else {
            System.out.println("Root 1: " + quadraticEquation.getRoot1());
            System.out.println("Root 2: " + quadraticEquation.getRoot2());
        }
    }
}
