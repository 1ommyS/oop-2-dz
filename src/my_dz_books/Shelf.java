package my_dz_books;

import java.util.Arrays;

public class Shelf {
    private Book[] books;

    public Shelf(Book[] books) {
        this.books = books;
    }



    public Book[] getBooks() {
        return books;
    }

    public int findOfByTittle(String tittle) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getTitle().equalsIgnoreCase(tittle)) {
                return i;
            }
        }
        return -1;
    }

    public Book findBookByTittle(String tittle) {
        for (var book : books) {
            if (book.getTitle().equalsIgnoreCase(tittle)) {
                return book;
            }
        }
        return null;
    }

    public Book get(int index) {
        if (index >= 0 && index < books.length) {
            return books[index];
        }
        return null;
    }

    public int sumBooks() {
        return books.length;
    }

    @Override
    public String toString() {
        return "Shelf{" +
                "books=" + Arrays.toString(books) +
                '}';
    }
}
