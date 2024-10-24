package com.arzer0.lessons.lesson1.homework.library.model;

import java.util.Date;

public class Librarian {
    private final String name;

    public Librarian(String name) {
        this.name = name;
    }

    public void issueBook(Reader reader, Book book, Date issueDate) {
        book.setIssueDate(issueDate);
        book.setIssueType(Book.IssueType.HOME);
        book.setIssuedTo(reader);
        reader.placeOrder(book);
        System.out.println("Библиотекарь " + name + " выдал книгу " + book.getTitle() + " автора " + book.getAuthor() + " читателю " + reader.getName() + " на дом до " + issueDate);
    }

    public void issueBook(Reader reader, Book book) {
        book.setIssueType(Book.IssueType.READING_ROOM);
        book.setIssuedTo(reader);
        reader.placeOrder(book);
        System.out.println("Библиотекарь " + name + " выдал книгу " + book.getTitle() + " автора " + book.getAuthor() + " читателю " + reader.getName() + " в читальный зал");
    }

    public String getName() {
        return name;
    }
}
