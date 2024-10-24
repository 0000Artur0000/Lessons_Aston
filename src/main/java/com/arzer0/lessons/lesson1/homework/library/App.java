package com.arzer0.lessons.lesson1.homework.library;

import com.arzer0.lessons.lesson1.homework.library.logic.Administrator;
import com.arzer0.lessons.lesson1.homework.library.model.*;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        List<Reader> readers = Arrays.asList(
                new Reader("Иван Иванов"),
                new Reader("Мария Петрова"),
                new Reader("Алексей Смирнов"),
                new Reader("Ольга Кузнецова"),
                new Reader("Дмитрий Соколов")
        );

        List<Librarian> librarians = Arrays.asList(
                new Librarian("Никита Иванович"),
                new Librarian("Марина Васильевна")

        );

        List<Book> books = Arrays.asList(
                new Book("Война и мир", "Лев Толстой"),
                new Book("Преступление и наказание", "Федор Достоевский"),
                new Book("Мастер и Маргарита", "Михаил Булгаков"),
                new Book("Анна Каренина", "Лев Толстой")
        );

        Administrator admin = new Administrator();
        for (Book book : books) {
            admin.addBook(book);
        }

        Random random = new Random();

        for (Reader reader : readers) {
            Book book = books.get(random.nextInt(books.size()));
            if (admin.searchCatalog(book)) {
                Librarian librarian = librarians.get(random.nextInt(librarians.size()));
                if (random.nextBoolean()) {
                    Calendar calendar = Calendar.getInstance();
                    calendar.add(Calendar.DAY_OF_MONTH, 14);
                    librarian.issueBook(reader, book, calendar.getTime());
                } else {
                    librarian.issueBook(reader, book);
                }
            } else {
                System.out.println("Книга " + book.getTitle() + " автора " + book.getAuthor() + " не найдена в каталоге.");
            }
        }
        for (Reader reader : readers) {
            for (Book book : reader.getBorrowedBooks()) {
                if (book.getIssueType() == Book.IssueType.HOME && book.getIssueDate() != null) {
                    Date currentDate = new Date();
                    if (currentDate.after(book.getIssueDate())) {
                        admin.addToBlacklist(reader);
                        System.out.println("Читатель " + reader.getName() + " занесен в черный список за просрочку книги " + book.getTitle() + ".");
                    }
                }
            }
        }
    }
}
