package library;

import java.util.Arrays;

public class Library {
    private Rack[] racks;
    private int size;

    public Library(int capacity) {
        racks = new Rack[capacity];
        size = 0;
    }

    public Rack[] getRacks() {
        return Arrays.copyOf(racks, size);
    }

    public void addRack(Rack rack) {
        if (size == racks.length) {
            racks = Arrays.copyOf(racks, (int) (racks.length * 1.5));
        }
        racks[size++] = rack;
    }

    public int racksCount() {
        return size;
    }

    public int shelfCount() {
        int shelfCount = 0;
        for (Rack rack : getRacks()) {
            shelfCount += rack.getSize();
        }
        return shelfCount;
    }

    public Rack getRackByIndex(int index) {
        return (index >= 0 && index < size) ? racks[index] : null;
    }

    public int totalBooks() {
        int totalBooks = 0;
        for (Rack rack : getRacks()) {
            totalBooks += rack.totalBooks();
        }
        return totalBooks;
    }

    public Book findBookByTitle(String title) {
        for (Rack rack : getRacks()) {
            Book foundBook = rack.findBookByTitle(title);
            if (foundBook != null) return foundBook;
        }
        return null;
    }

    public String toString() {
        return String.format("стеллажи - %d; полки - %d; количество книг - %d;",
                racksCount(), shelfCount(), totalBooks());
    }

    public Book findBookByIndex(int indexRack, int indexShelf, int indexBook) {
        if (indexRack < 0 || indexRack >= size) {
            System.out.println("Неверный индекс стелажа, книга не найдена");
            return null;
        }
        return racks[indexRack].getBookByIndexShelf(indexShelf, indexBook);
    }
}