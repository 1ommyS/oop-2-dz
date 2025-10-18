public class Shelf {
    private Book[] books;

    public Shelf(Book[] books) {
        this.books = books;
    }


    public Book getBooks(int index) {
        if (index < 0 || index >= books.length) return null;
        return books[index];
    }

    public int countBooksOnShelf() {
        int count = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) count++;
        }

        return count;
    }

    public Book findBookOnShelf(String title) {
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            if (book.getTitle().equals(title))
                return book;
        }
        return null;
    }

    public Book takeTheBook(String title) {
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            if (book.getTitle().equals(title))
                return book;
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < books.length; i++) {
            sb.append(books[i].getTitle() + " " + books[i].getAuthor() + "\n");
        }
        return sb.toString();
    }

}