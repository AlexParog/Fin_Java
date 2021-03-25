package com.example.demo.model;

import java.time.LocalDate;

public class Blog {
    private Long id;
    private String name;
    private String text;
    private LocalDate dateOfCreation;
    private LocalDate expirationDate;
    private String tag;
    private String author;

    public Blog(Long id, String name, String text, LocalDate dateOfCreation,
                LocalDate expirationDate, String tag, String author) {
        this.id = id;
        this.name = name;
        this.text = text;
        this.dateOfCreation = dateOfCreation;
        this.expirationDate = expirationDate;
        this.tag = tag;
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getText() {
        return text;
    }

    public LocalDate getDateOfCreation() {
        return dateOfCreation;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public String getTag() {
        return tag;
    }

    public String getAuthor() {
        return author;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setDateOfCreation(LocalDate dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
