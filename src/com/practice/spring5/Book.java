package com.practice.spring5;

public class Book {
    private String bookName;
    private String bookAuthor;

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void test() {
        System.out.println(bookName + bookAuthor);
    }
}
