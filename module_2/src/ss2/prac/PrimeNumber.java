package ss2.prac;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter number of primes to print: ");
        Scanner scanner = new Scanner(System.in);
        byte n = scanner.nextByte();
        if (n <= 0) {
            System.out.println("Wrong input");
            return;
        }
        byte count = 1;
        int num = 2;
        boolean isPrime;
        while (count <= n) {
            isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }
}
