public class Main {
    public static void main(String[] args) {


        Book book1 = new Book("1 книга", "1 автор", 1);
        Book book2 = new Book("2 книга", "2 автор", 1);
        Book book3 = new Book("3 книга", "3 автор", 1);
        Book book4 = new Book("4 книга", "4 автор", 1);
        Book book5 = new Book("5 книга", "5 автор", 1);
        Book book6 = new Book("6 книга", "6 автор", 1);
        Book book7 = new Book("7 книга", "7 автор", 1);
        Book book8 = new Book("8 книга", "8 автор", 1);
        Book book9 = new Book("9 книга", "9 автор", 1);
        Book book10 = new Book("10 книга", "10 автор", 1);

        Shelf shelf1 = new Shelf(new Book[]{book1, book2, book10});
        Shelf shelf2 = new Shelf(new Book[]{book3, book4, book9});
        Shelf shelf3 = new Shelf(new Book[]{book5, book6});
        Shelf shelf4 = new Shelf(new Book[]{book7, book8});


        Rack rack1 = new Rack(new Shelf[]{shelf1, shelf2});
        Rack rack2 = new Rack(new Shelf[]{shelf3, shelf4});

        System.out.println("На стеллаже 1 " + rack1);
        System.out.println("На стеллаже 2 " + rack2);

        Library library = new Library(new Rack[]{rack1, rack2});

        System.out.println(library + "\n");

        System.out.println(library.racksCount() + " - Количество стелажей");

        System.out.println(shelf4.countBooksOnShelf() + " - Количестко книг на 2 полке 2 стеллажа");

        //System.out.println(rack1.countBooksOnRack() + rack2.countBooksOnRack() + " Количество книг на стеллажах");

        System.out.println(library.totalBooks() + " Количество книг в библиотеке");

        //System.out.println("на 1 полке" + shelf1.findBookOnShelf("1 книга") );

        //System.out.println(rack1.findBookOnRack("1 книга"));

        library.findBookOnLibrary("4 книга");

        library.takeTheBook("1 книга324");
    }
}
