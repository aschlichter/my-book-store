package com.example.bookstore.service;

import com.example.bookstore.domain.Author;

import java.util.List;

public interface AuthorService {

    List<Author> findAll();

    Author findById(long id);

    Author save(Author author);

    void deleteById(long id);
}
