package Rultsov;

import java.util.Arrays;
import java.util.SortedMap;

public class Library {

    private String name;
    private Rack[] racks;


    public Library(String name, Rack[] racks) {
        this.name = name;
        this.racks = racks;
    }

    public Rack[] getRacks() {
        return racks;
    }

    public String getName() {
        return name;
    }

    public void allBookLibrary() {
        for (Rack rack : racks) {
            if (rack != null) {
                rack.allBooks();
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Библиотека: " + getName() + "\n");
        stringBuilder.append("Стелажей: " + racks.length + "\n");

        for (int i = 0; i < racks.length; i++) {
            if (racks[i] != null) {
                stringBuilder.append("В " + (i + 1) + "-м стелаже " + racks[i].getShelf().length + " полок\n");
            } else {
                stringBuilder.append("В " + (i + 1) + "-м стелаже: пусто\n");
            }
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Book book = new Book("A", "Виктор", 123);
        Book book1 = new Book("Б", "Валера", 444);
        Book book2 = new Book("C", "Игорь", 1000);
        Book book3 = new Book("Ы", "Игорь", 1111);

        Shelf shelf = new Shelf(new Book[5]); //полка на 4 единицы
        shelf.addBook(book);
        shelf.addBook(book1);
        shelf.addBook(book2);
        shelf.addBook(book3);
        shelf.addBook("A", "Виктор", 123); //метод перегрузка с проверкой дубликата
        System.out.println(shelf);

        Shelf shelf1 = new Shelf(new Book[5]); // 2я полка на н едениц книг
        shelf1.addBook(shelf.deliteBook("A")); // комбинируя 2 метода вставляю в полку 2
        System.out.println(shelf); //после изменений
        System.out.println(shelf1);//после изменений

        Shelf[] shelves = new Shelf[3]; // сделал масив полок куда добавил имеющиеся полки и доп в цикле с нул элементами
        shelves[0] = shelf;
        shelves[1] = shelf1;
        for (int i = 2; i < shelves.length; i++) {
            shelves[i] = new Shelf(new Book[5]);
        }


        Rack rack = new Rack(shelves); //создали стилаж и добавили в него 3 полки
        System.out.println(rack);

        Book book4 = new Book("X", "Lysa", 444);
        rack.addBookj(book4); // добовляем на любую полку
        System.out.println(rack);

        rack.moveBookToShelf("X", 2);
        System.out.println(rack);

        Rack[] racks1 = new Rack[2];
        racks1[0] = rack;

        Library library = new Library("Рыльцов", racks1);
        System.out.println(library.toString());

        library.allBookLibrary();
    }


}




