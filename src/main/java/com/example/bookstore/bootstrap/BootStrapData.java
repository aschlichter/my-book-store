package com.example.bookstore.bootstrap;

import com.example.bookstore.domain.Author;
import com.example.bookstore.repository.AuthorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;

    public BootStrapData(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;

    }

    @Override
    public void run(String... args) throws Exception {


        Author author1 = new Author("Balázs Gyula", "hun", "A kert", "Éden");
        authorRepository.save(author1);


        Author author2 = new Author("Bob Katz", "us", "Mastering Audio", "Pop");
        authorRepository.save(author2);



    }
}
