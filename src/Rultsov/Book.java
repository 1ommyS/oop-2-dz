package Rultsov;

import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private int pages;

    public Book(String title, String author, int pages) {
        this.author = author;
        this.title = title;
        this.pages = pages;
    }


    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean equals(Object o) { // добавил для того чтобы сравнивали содержимое а не ссылки
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return pages == book.pages && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, pages);
    }

    @Override
    public String toString() {
        return "\"" + title + "\" - " + author + " (" + pages + " стр.)";
    }
}
