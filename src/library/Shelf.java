package library;

import java.util.Arrays;

public class Shelf {
    private Book[] books;
    private int size;

    public Shelf(int capacity) {
        this.books = new Book[capacity];
        this.size = 0;
    }

    public Book[] getBooks() {
        return Arrays.copyOf(books, size);
    }

    public int getSize() {
        return size;
    }

    public void addBook(Book book) {
        if (size == books.length * 0.8) {
            books = Arrays.copyOf(books, (int) (books.length * 1.5));
        }
        books[size++] = book;
    }

    public int indexOfByTitle(String title) {
        for (int i = 0; i < size; i++) {
            if (title.equalsIgnoreCase(books[i].getTitle())) {
                return i;
            }
        }
        return -1;
    }

    public Book getBookByTitle(String title) {
        int indexFoundBook = indexOfByTitle(title);
        return (indexFoundBook >= 0) ? books[indexFoundBook] : null;
    }

    public Book getBookByIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Неверный индекс, книга не найдена");
            return null;
        }
        return books[index];
    }
}