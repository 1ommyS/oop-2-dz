public class Rack {
    private Shelf[] shelf;

    Rack(Shelf[] shelf) {
        this.shelf = shelf;
    }

    //    Геттер
    public Shelf[] getShelf() {
        return shelf;
    }


    //    Всего книг на полках
    public int totalBooks() {
        int total = 0;
        for (Shelf currentShelf : shelf) {
            total += currentShelf.getBookCount();
        }
        return total;
    }

    //    Количество полок
    public int totalShelves() {
        int totalShelves = 0;
        for (Shelf currentShelf : shelf) {
            totalShelves =+ shelf.length;
        }
        return totalShelves;
    }

    //    Поиск книги по названию (возвращает индекс)
    public int findFirstByTitle(String title) {
        if (title == null) {
            return -1;
        }

        for (Shelf currentShelf : shelf) {
            Book[] booksTitle = currentShelf.getBooks();

            for (int bookIndex = 0; bookIndex < booksTitle.length; bookIndex++) {
                Book currentBookTitle = booksTitle[bookIndex];

                if (currentBookTitle.getTitle().equals(title)) {
                    return bookIndex;
                }
            }
        }
        return -1;
    }

    //    Поиск книги по названию (возвращает книгу)
    public Book findBookByTitle (String title) {
        if (title == null) {
            return null;
        }

        for (Shelf currentShelf : shelf) {
            Book[] books = currentShelf.getBooks();

            for (Book currentBook : books) {
                if (currentBook.getTitle().equals(title)) {
                    return currentBook;
                }
            }
        }
        return null;
    }

    @Override
    public String toString() {
        if(shelf == null || shelf.length == 0) {
            return "Rack пустой";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("Rack (количество полок: ").append(this.shelf.length).append(")\n");

        for (int i = 0; i < shelf.length; i++) {
            Shelf currentShelf = shelf[i];
            sb.append("Полка - ").append(i + 1).append(":\n");

            if (currentShelf == null) {
                sb.append("null");
            } else {
                Book[] books = currentShelf.getBooks();
                sb.append(" Книг - ").append(books.length).append("\n");

                for (Book currentBook : books) {
                    if (currentBook != null) {
                        sb.append("    - \"").append(currentBook.getTitle())
                                .append("\" (").append(currentBook.getAuthor())
                                .append(", ").append(currentBook.getPages()).append(" стр.)\n");
                    }
                }
            }
        }
        return sb.toString();
    }
}
