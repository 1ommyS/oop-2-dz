import java.util.Arrays;

public class Shelf {
    private Book[] books;

    public Shelf(Book[] books) {
        this.books = books;
    }

    public int indexOfByTitle(String title) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].getTitle().equals(title)) {
                return i;
            }
        }

        return -1;
    }

    public Book get(int index) {
        if (index < 0 || index >= books.length) {
            return null;
        }
        return books[index];
    }

    public int getBooksLength() {
        return books.length;
    }

   /* public int getFirstBookWithTitle(String title) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].getTitle().equals(title)){
                return i;
            }
        }

        return -1;
    }*/

    @Override
    public String toString() {
        return "Полка[" + Arrays.toString(books) + ']';
    }
}

