package Rultsov;

import java.util.Arrays;

public class Rack {

    private Shelf[] shelf;

    public Rack(Shelf[] shelf) {
        this.shelf = shelf;
    }

    public Shelf[] getShelf() {
        return shelf;
    }

    public void setShelf(Shelf[] shelf) {
        this.shelf = shelf;
    }
//    public Shelf searchBookShelf(String title) {
//        for (Shelf s : shelf) {
//            if (s != null && title.equals(s.searchName(title))) {
//                System.out.println("Книга находится на полке " + s);
//                return s;
//            }
//        }
//        return null;
//    }// нашли книгу на какой полке она находтся и возвращаем

    public void allBooks() {
        int countBook = 0;
        int countShelf = 0;
        for (int i = 0; i < shelf.length; i++) {
            if (shelf[i] != null) {
                countShelf++;
                countBook += shelf[i].allBook();
                int booksOnThisShelf = shelf[i].allBook();
                System.out.println("Количество книг на полке " + i + " " +  booksOnThisShelf);
            }
        }
    }

    public void addBookj(Book book) {
        for (int i = 0; i < shelf.length; i++) {
            if (shelf[i] != null && shelf[i].hasFreeSpace()) {
                shelf[i].addBook(book);
                return;
            }
        }
        System.out.println("Все полки заняты");
    } //вставляет книгу в хоотичном порядке на полки


    public Book tookTheBook(String title) {
        for (Shelf s : shelf) {
            if (s != null) {
                Book book = s.deliteBook(title);
                if (book != null) {
                    System.out.println("Нашел книгу на полке: " + s);
                    return book;
                }
            }
        }
        return null;
    } // вытащили книгу с полки и возвращаем

    public void moveBookToShelf(String title, int targetShelfIndex) {
        Book book = tookTheBook(title);
        if (book == null) {
            System.out.println("Книга '" + title + "' не найдена на стелаже");
            return;
        }
        shelf[targetShelfIndex].addBook(book);
        System.out.println("Переместил книгу '" + title + "' на полку " + targetShelfIndex);
    } // пермещение на полку ручной режим

    // В классе Rack
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("🗄️ Стелаж:\n");

//        if (shelf != null) {
        for (int i = 0; i < shelf.length; i++) {
            if (shelf[i] != null) {
                sb.append("== Полка ").append(i).append(" ===\n");
                sb.append(shelf[i].toString()).append("\n");
            }
        }
//        }
        return sb.toString();
    }
}



