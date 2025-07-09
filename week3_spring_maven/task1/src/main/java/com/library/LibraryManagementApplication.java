package com.library;

import com.library.service.BookService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class LibraryManagementApplication {
    public static void main(String[] args) {
        // Run Spring Boot (for REST)
        SpringApplication.run(LibraryManagementApplication.class, args);

        // Run classic Spring XML + AOP
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService service = (BookService) context.getBean("bookService");
        service.setLibraryName("City Central Library");
        service.displayBooks();
    }
}
