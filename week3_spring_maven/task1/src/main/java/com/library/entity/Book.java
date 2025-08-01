package com.library.entity;
import javax.persistence.*;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String title;

    public Book() {}
    public Book(String title) { this.title = title; }

    public Long getId() { return id; }
    public String getTitle() { return title; }
    public void setId(Long id) { this.id = id; }
    public void setTitle(String title) { this.title = title; }
}
