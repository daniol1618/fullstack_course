package com.tr.fs.designPrinciples.solid.singleResponsibility.incorrect;

public class BookIncorrect {
    private String title;
    private String author;
    private int pageCount;

    // Methods related to book details
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    // Method related to formatting book details for display
    public String getBookInfoFormatted() {
        return "Title: " + title + "\nAuthor: " + author + "\nPage Count: " + pageCount;
    }
}

