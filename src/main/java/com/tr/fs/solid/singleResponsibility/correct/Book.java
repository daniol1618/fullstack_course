package com.tr.fs.solid.singleResponsibility.correct;

// Book class responsible for managing book details
public class Book {
    private String title;
    private String author;
    private int pageCount;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    // Getters for book details
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPageCount() {
        return pageCount;
    }
}

