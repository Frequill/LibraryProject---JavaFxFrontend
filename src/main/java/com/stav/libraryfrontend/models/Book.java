package com.stav.libraryfrontend.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Book {

    @JsonProperty("book_id")
    private int bookId;
    @JsonProperty("title")
    private String title;
    @JsonProperty("description")
    private String description;
    @JsonProperty("authors")
    private String[] authors;
    @JsonProperty("genre")
    private String[] genre;
    @JsonProperty("isbn")
    private String isbn;
    @JsonProperty("published_date")
    private String published;
    @JsonProperty("pages")
    private int pages;
    @JsonProperty("image_src")
    private String imageSrc;

    public Book(int bookId, String title, String description, String[] authors, String[] genre, String isbn, String published, int pages, String imageSrc) {
        this.bookId = bookId;
        this.title = title;
        this.description = description;
        this.authors = authors;
        this.genre = genre;
        this.isbn = isbn;
        this.published = published;
        this.pages = pages;
        this.imageSrc = imageSrc;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public String[] getGenre() {
        return genre;
    }

    public void setGenre(String[] genre) {
        this.genre = genre;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPublished() {
        return published;
    }

    public void setPublished(String published) {
        this.published = published;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getImageSrc() {
        return imageSrc;
    }

    public void setImageSrc(String imageSrc) {
        this.imageSrc = imageSrc;
    }
}
