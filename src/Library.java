public class Library {
    private Rack[] racks;

    Library(Rack[] racks) {
        this.racks = racks;
    }

    //    Получаем количество стелажей
    public int racksCount() {
        int totalRacks = 0;
        for (Rack currentRack : racks) {
            totalRacks += racks.length;
        }
        return totalRacks;
    }

    //    Получаем стилаж по индексу
    public Rack getRacks(int index) {
        if (index < 0 || index >= racks.length) {
            return null;
        }
        return racks[index];
    }

    //    Получение общего чила книг
    public String totalBooksRacks() {
        StringBuilder sb = new StringBuilder();
        int totalRacks = 0;
        for (Rack currentRack : racks) {
            totalRacks += currentRack.totalBooks();
        }
        sb.append("Всего книг: ").append(totalRacks);
        return sb.toString();
    }

    //    Поиск книги по наименованию
    public Book findBook(String title) {
        for (Rack currentRack : racks) {
            Book foundBook = currentRack.findBookByTitle(title);
            if (foundBook != null) {
                return foundBook;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n").append("Количество стелажей: ").append(racks.length).append('\n');

        int totalRacks = 0;
        int totalBooks = 0;
        for (Rack currentRack : racks) {
            totalRacks += currentRack.totalShelves();

            Shelf[] shelf =  currentRack.getShelf();

            for (Shelf currentShelf : shelf) {
                totalBooks += currentShelf.getBookCount();
            }

        }
        sb.append("\n").append("Количество полок: ").append(totalRacks).append('\n');
        sb.append("\n").append("Количество книг: ").append(totalBooks).append('\n');

        return sb.toString();
    }
}
