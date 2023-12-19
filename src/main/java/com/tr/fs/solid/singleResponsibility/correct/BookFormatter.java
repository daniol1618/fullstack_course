package com.tr.fs.solid.singleResponsibility.correct;

// BookFormatter class responsible for formatting book details for display
public class BookFormatter {
    public String getBookInfoFormatted(Book book) {
        return "Title: " + book.getTitle() + "\nAuthor: " + book.getAuthor() + "\nPage Count: " + book.getPageCount();
    }
}
