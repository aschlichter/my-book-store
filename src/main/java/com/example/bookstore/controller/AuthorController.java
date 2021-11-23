package com.example.bookstore.controller;

import com.example.bookstore.domain.Author;
import com.example.bookstore.service.AuthorService;
import com.example.bookstore.service.AuthorServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/books")
public class AuthorController {

    private AuthorService authorService;


    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping("/list")
    public String getAllBooksAndAuthors(Model model) {
        List<Author> authorList = authorService.findAll();

        model.addAttribute("authorView", authorList);


        return "book/list-books";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model model) {

        Author author = new Author();

        model.addAttribute("author", author);

        return "book/book-form";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("authorId") long id, Model model) {

        Author author = authorService.findById(id);

        model.addAttribute("author", author);

        return "book/book-form";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("author") Author author) {

        authorService.save(author);

        return "redirect:/books/list";
    }

    @GetMapping("/delete")
    public String deleteById(@RequestParam("authorId") long id) {

        authorService.deleteById(id);

        return "redirect:/books/list";

    }


}
