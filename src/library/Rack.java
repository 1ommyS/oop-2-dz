package library;

import java.util.Arrays;

public class Rack {
    private Shelf[] shelves;
    private int size;

    public Rack(int capacity) {
        this.shelves = new Shelf[capacity];
        this.size = 0;
    }

    public Shelf[] getShelves() {
        return Arrays.copyOf(shelves, size);
    }

    public int getSize() {
        return size;
    }

    public void addShelf(Shelf shelf) {
        if (size == shelves.length) {
            throw new IllegalArgumentException(
                    "В шкафу все полки заняты, невозможно добавить новую полку");
        }
        shelves[size++] = shelf;
    }

    public Shelf getShelf(int index) {
        return (index >= 0 && index < size) ? shelves[index] : null;
    }

    public int totalBooks() {
        int totalBooks = 0;
        for (int i = 0; i < size; i++) {
            totalBooks += shelves[i].getSize();
        }
        return totalBooks;
    }

    public int findFirstShelfByTitle(String title) {
        for (int i = 0; i < size; i++) {
            if (shelves[i].getBookByTitle(title) != null) {
                return i;
            }
        }
        return -1;
    }

    public Book findBookByTitle(String title) {
        for (Shelf shelf : getShelves()) {
            Book findBook = shelf.getBookByTitle(title);
            if (findBook != null) return findBook;
        }
        return null;
    }

    public Book getBookByIndexShelf(int indexShelf, int indexBook) {
        if (indexShelf < 0 || indexShelf >= size) {
            System.out.println("Неверный индекс полки, книга не найдена");
            return null;
        }
        return shelves[indexShelf].getBookByIndex(indexBook);
    }
}