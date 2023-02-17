package book;

import book.entity.Author;
import book.entity.Book;

import java.util.List;

/**
 * Создать Gradle-проект и настроить его под Hibernate.
 * Взять пример ex_003_hibernate_get_and_insert. Получить объект Book и коллекцию объектов. Получить конкретный Book по id.
 * Добавить Новый Book. И это все реализовать в классе BookHelper.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        AuthorHelper ah = new AuthorHelper();
        BookHelper bh = new BookHelper();
        Author author = new Author();
        Book book = new Book();

        // add authors
        author.setName("Alexandre Dumas");
        ah.addAuthor(author);
        author.setName("Nat Gould");
        ah.addAuthor(author);
        author.setName("Arthur Conan Doyle");
        ah.addAuthor(author);

        // add books
        book.setAuthor_id(1);
        book.setName("The Count of Monte Cristo");
        bh.addBook(book);
        book.setAuthor_id(1);
        book.setName("The Two Dianas");
        bh.addBook(book);
        book.setAuthor_id(2);
        book.setName("Fast as the Wind");
        bh.addBook(book);
        book.setAuthor_id(3);
        book.setName("The Lost World");
        bh.addBook(book);

        // get book by id
        System.out.println("id = " + 3 + " Book: " + bh.getBookById(3));

        // get all books
        System.out.println("\n Books List:");
        List<Book> list = bh.getAll();
        for (Book temp : list) System.out.println(temp);
    }
}
