package ss1.prac;

import java.util.Scanner;

public class CurrencyConvert {
    public static void main(String[] args) {
        int rate = 24368;
        int usd;
        String bull;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter USD amount");
        usd = Integer.parseInt(scanner.nextLine());
        System.out.println("USD to VND: " + usd * rate);
    }
}
