package DZ;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Book[] books = {
                new Book("chujoy", "king", 500),
                new Book("voyna i mir", "lev tolstoy", 320),
        };
        Book[] books2 = {
                new Book("Kavboy", "nikolay", 344),
                new Book("divan", "abdulla", 122),
        };
        Book[] books3 = {
                new Book("robin", "pushkin", 222),
                new Book("kosmos", "luna", 294),
        };
        Book[] books4 = {
                new Book("nindzya", "nikolay", 399),
                new Book("king", "king", 288),
        };


        Shelf[] shelves = {
                new Shelf(books),
                new Shelf(books2)
        };

        Shelf[] shelves2 = {
                new Shelf(books3),
                new Shelf(books4)
        };

        Rack[] racks = {
                new Rack(shelves),
                new Rack(shelves2)
        };

        Library library = new Library(racks);

        System.out.println("Введите имя книги: ");

        String title = sc.nextLine();
        while (library.findByTitle(title) == null) {
            System.out.println("Такой книги нет в библиотеке");
            System.out.println("Введите имя книги: ");
            title = sc.nextLine();
        }
        System.out.println("Ваша книга: " + library.findByTitle(title));

        System.out.println("Введите индекс стелажа 0/1: ");
        int stellaj = sc.nextInt();
        while (stellaj < 0 || stellaj > 1) {
            stellaj = sc.nextInt();
        }

        System.out.println("Введите индекс полки 0/1: ");
        int polka = sc.nextInt();
        while (polka < 0 || polka > 1) {
            polka = sc.nextInt();
        }

        System.out.println("Введите индекс книги 0/1: ");
        int book = sc.nextInt();
        while (book < 0 || book > 1) {
            book = sc.nextInt();
        }

        System.out.println("Ваша книга: " + library.getRack(stellaj).getShelf(polka).get(book));
        System.out.println("Количество всех книг: " + library.totalBooks());

    }
}
