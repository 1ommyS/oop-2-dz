public class Main {
    public static void main(String[] args) {
        Book[] books1 = {
                new Book("Война и мир", "Толстой", 4000),
                new Book("Бетховен", "Роберт Тайн", 425),
                new Book("Преступление и наказание", "Достоевский", 340),
        };
        Book[] books2 = {
                new Book("Капитанская дочка", "Пушкин", 150),
                new Book("Уличный кот по имени Боб", "Джеймса Боуэн", 384),
        };

        Shelf[] shelfs = {
                new Shelf(books1),
                new Shelf(books2)
        };

        Rack[] racks = {
                new Rack(shelfs)
        };

        Library library = new Library(racks);

        System.out.println(library.totalBooks());
        System.out.println(library.findByTitle("Капитанская дочка"));
    }
}
