package com.example.dictionary.repository;
import java.util.HashMap;

public class Repository implements IRepository {
    private static final HashMap<String, String> dictionary = new HashMap<>();

    static {
        dictionary.put("dog", "chó");
        dictionary.put("cat", "mèo");
        dictionary.put("book", "sách");
        dictionary.put("bottle", "bình");
    }

    @Override
    public String translate(String word) {
        return dictionary.get(word);
    }
}
