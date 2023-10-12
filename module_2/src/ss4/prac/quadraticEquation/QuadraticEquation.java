package ss4.prac.quadraticEquation;

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
}
