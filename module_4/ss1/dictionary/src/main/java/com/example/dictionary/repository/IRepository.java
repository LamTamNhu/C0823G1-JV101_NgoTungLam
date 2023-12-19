package com.example.dictionary.repository;

import org.springframework.stereotype.Repository;

@Repository
public interface IRepository {
    String translate(String word);
}
