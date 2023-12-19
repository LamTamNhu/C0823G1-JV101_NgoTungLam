package ss3.exer;

public class Thoi {
    public static void main(String[] args) {
        int range = 1;

        for (int i = 0; i < 6; i++) {
            if (i == 0) {
                System.out.println();
                continue;
            }
            for (int j = 0; j < 12; j++) {
                if (Math.abs(6 - j) == range) {
                    System.out.print(range);
                } else {
                    System.out.print(" ");
                }
            }
            range++;
            System.out.println();
        }
        range = 4;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 12; j++) {
                if (Math.abs(6 - j) == range) {
                    System.out.print(range);
                } else {
                    System.out.print(" ");
                }
            }
            range--;
            System.out.println();
        }
    }
}
