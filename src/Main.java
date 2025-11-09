//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book books1 = new Book("Нзавание1", "Автор1", 23);
        Book books2 = new Book("Нзавание2", "Автор2", 124);
        Book books3 = new Book("Нзавание3", "Автор3", 124124);

        Book books4 = new Book("Нзавание1", "Автор1", 1241124);
        Book books5 = new Book("Нзавание2", "Автор2", 12412414);
        Book books6 = new Book("Нзавание3", "Автор3", 12124);

        Shelf shelf1 = new Shelf(new Book[] {books1, books2, books3});
        Shelf shelf2 = new Shelf(new Book[] {books4, books5, books6});
        Shelf shelf3 = new Shelf(new Book[] {books4, books5, books6});

        Shelf[] shelves = new Shelf[] {shelf1, shelf2};
        Shelf[] shelves1 = new Shelf[] {shelf2, shelf3};

        Rack newRack = new Rack(shelves);
        Rack newRack1 = new Rack(shelves1);

        Rack[] racks = new Rack[] {newRack, newRack1};

        Library newLib = new Library(racks);
//
////        Количество стелажей
//        System.out.println(newLib.racksCount());
//
////        Стелаж по индексу
//        System.out.println(newLib.getRacks(0));
//
////        Всего книг на стелажах
//        System.out.println(newLib.totalBooksRacks());
//
////        Поиск книги по названию
//        System.out.println(newLib.findBook("Нзавание2"));

//        Вывод общей информации
        System.out.println(newLib.toString());

    }
}