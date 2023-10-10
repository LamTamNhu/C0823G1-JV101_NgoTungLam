package ss2.prac;

public class PrimeUnder100 {
    public static void main(String[] args) {
        int num = 2;
        while (num <= 100) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
            }
            num++;
        }
    }
}
