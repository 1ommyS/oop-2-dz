public class Rack {
    private Shelf[] shelfes;

    Rack(Shelf[] shelf) {
        this.shelfes = shelfes;
    }

    //    Геттер
    public Shelf[] getShelf() {
        return shelfes;
    }


    //    Всего книг на полках
    public int totalBooks() {
        int total = 0;
        for (Shelf currentShelf : shelfes) {
            total += currentShelf.getBookCount();
        }
        return total;
    }

    //    Количество полок
    public int totalShelves() {
        if (shelfes.length == 0) {
            return 0;
        }
        return shelfes.length;
    }

    //    Поиск книги по названию (возвращает индекс)
    public int findFirstByTitle(String title) {
        if (title == null) {
            return -1;
        }

        for (Shelf currentShelf : shelfes) {
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

        for (Shelf currentShelf : shelfes) {
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
        if(shelfes == null || shelfes.length == 0) {
            return "Rack пустой";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("Rack (количество полок: ").append(this.shelfes.length).append(")\n");

        for (int i = 0; i < shelfes.length; i++) {
            Shelf currentShelf = shelfes[i];
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
