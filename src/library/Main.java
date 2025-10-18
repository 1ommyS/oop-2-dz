package library;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = initLibrary();
        System.out.println(library.totalBooks());
        System.out.println(library.findBookByTitle("Мастер и Маргарита"));
        int indexRack = 1;
        int indexShelf = 1;
        int indexBook = 5;
        System.out.println(library.findBookByIndex(indexRack, indexShelf, indexBook));
    }

    public static Library initLibrary() {
        Library library = new Library(2);
        for (int i = 0; i < 2; i++) {
            Rack rack = new Rack(2);
            for (int j = 0; j < 2; j++) {
                Shelf shelf = new Shelf(3);
                shelf.addBook(new Book("Мастер и Маргарита", "Булгаков", 400));
                shelf.addBook(new Book("Преступление и наказание", "Достоевский", 550));
                shelf.addBook(new Book("Война и мир", "Толстой", 1200));
                rack.addShelf(shelf);
            }
            library.addRack(rack);
        }
        return library;
    }
}
