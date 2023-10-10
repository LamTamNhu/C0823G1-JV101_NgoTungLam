package ss2.prac;

public class CharCount {
    public static void main(String[] args) {
        String str = "Ain't no way bro, skull";
        char letter = 'h';
        byte count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letter) {
                count++;
            }
        }
        System.out.println(letter + " appear " + count + " times");
    }
}
