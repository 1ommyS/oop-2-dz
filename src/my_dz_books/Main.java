package my_dz_books;

public class Main {
    public static void main(String[] args) {

        //книги

        Book[] books1 = {
                new Book("Мастер и Маргарита", "Михаил Булгаков", 480),
                new Book("Преступление и наказание", "Фёдор Достоевский", 670),
                new Book("Война и мир", "Лев Толстой", 1225),
                new Book("Три товарища", "Эрих Мария Ремарк", 430),
                new Book("1984", "Джордж Оруэлл", 328)
        };

        Shelf[] shelf = {
                new Shelf(books1),
        };

        Rack[] rack = {
                new Rack(shelf)
        };

        Library library = new Library (rack);

        System.out.println(library.totalbooks());
        System.out.println(library.findBookByTitle("Мастер и Маргарита"));
        System.out.println(library.getRack(234));


    }
}
