package DZ;

public class Shelf {

    private Book[] books;

    public int booksLength() {
        return books.length;
    }

    public int totalBooks() {                   // Вернуть количество книг на полке
        int sum = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) sum++;
        }

        return sum;
    }

    @Override
    public String toString() {
        return books.toString();
    }

    public Book get(int index) {                // Вернуть книгу по индексу

        if (index < 0 || index >= books.length) return null;
        return books[index];
    }

    public int indexOfByTitle(String title) {   // Вернуть индекс книги переданный в параметры

        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].getTitle().equalsIgnoreCase(title))
                return i;
        }

        return -1;
    }

    public Shelf(Book[] books) {
        this.books = books;
    }
}
