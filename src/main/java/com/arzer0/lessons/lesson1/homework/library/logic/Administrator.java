package com.arzer0.lessons.lesson1.homework.library.logic;

import com.arzer0.lessons.lesson1.homework.library.model.*;

import java.util.ArrayList;
import java.util.List;

public class Administrator {
    private static List<Book> catalog = new ArrayList<>();

    public void addBook(Book book) {
        catalog.add(book);
    }

    public boolean searchCatalog(Book book) {
        return catalog.contains(book);
    }

    public void addToBlacklist(Reader reader) {
        reader.setBlacklisted(true);
        System.out.println("Читатель " + reader.getName() + " добавлен в черный список.");
    }
}
