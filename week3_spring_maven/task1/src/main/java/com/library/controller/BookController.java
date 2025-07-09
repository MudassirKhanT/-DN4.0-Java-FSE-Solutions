package com.library.controller;

import com.library.entity.Book;
import com.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookRepository repo;

    @GetMapping
    public List<Book> getAll() {
        return repo.findAll();
    }

    @PostMapping
    public Book add(@RequestBody Book book) {
        return repo.save(book);
    }
}
