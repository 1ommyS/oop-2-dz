public class Shelf {
    private Book[]books;

    public Shelf(Book[] books) {
        this.books = books;
    }

    public Book[] getBooks() {
        return books;
    }

    //поиск по названию
    public int indexOfByTitle(String title) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].getTitle().equalsIgnoreCase(title)) {
                return i;
            }
        }
        return -1;
    }

    public Book findOfByTitle(String title) {
        for (Book book:books){
            if (book.getTitle().equalsIgnoreCase(title)) return book;
        }
        return null;
    }
    //только чтение, не удаляет
    public Book get(int index) {
        if (index < 0 || index >= books.length) {
            return null;
        }
        return books[index];
    }

    public int getBooksLength() {
        return books.length;
    }

    @Override
    public String toString() {
        int countBook = 0;
        for (Book book : books) {
            if (book != null) countBook++;

        }
        return "На полке " + countBook + " книг(и)";

    }


}






