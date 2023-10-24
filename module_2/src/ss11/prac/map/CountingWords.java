package ss11.prac.map;

import java.util.Arrays;
import java.util.TreeMap;

public class CountingWords {
    public static void main(String[] args) {
        TreeMap<String, Integer> wordCounterTree = new TreeMap<>();
        String string = "The quick dog jump dog over the cat lazy brown cat";
        String[] wordArray = string.split(" ");
        System.out.println(Arrays.toString(wordArray));
        wordCounterTree.put(wordArray[0].toLowerCase(), 1);
        String word;
        int newVal;
        for (int i = 1; i < wordArray.length; i++) {
            word = wordArray[i].toLowerCase();
            if (wordCounterTree.containsKey(word)) {
                newVal = wordCounterTree.get(word);
                wordCounterTree.put(word, newVal + 1);
            } else {
                wordCounterTree.put(word, 1);
            }
        }

        System.out.println(wordCounterTree);
    }
}
