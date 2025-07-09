package com.library.service;
import com.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    private BookRepository bookRepository;
    private String libraryName;

    public BookService() {}
    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public void displayBooks() {
        System.out.println("Library: " + libraryName);
        bookRepository.fetch();
        System.out.println("Books displayed successfully.");
    }
}
