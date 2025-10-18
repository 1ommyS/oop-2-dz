package DZ;

public class Rack {

    private Shelf[] shelves;

    public int shelvesLength() {        // Возвращает количество полок
        return shelves.length;
    }

    public int findFirstByTitle(String title) { // Возвращает индекс полки на котором находится книга

        for (int i = 0; i < shelves.length; i++) {
            if (shelves[i] != null && shelves[i].indexOfByTitle(title) != -1) {
                return i;
            }
        }

        return -1;
    }

    public int totalBooks() {                   // Возвращает количество книг на всех полках

        int sum = 0;
        for (int i = 0; i < shelves.length; i++) {
            if (shelves[i] != null) {
                sum += shelves[i].totalBooks();
            }
        }

        return sum;
    }

    public Shelf getShelf(int index) {              // Возвращает полку по индексу
        if (index < 0 || index >= shelves.length) return null;
        return shelves[index];
    }

    public Rack(Shelf[] shelves) {
        this.shelves = shelves;
    }
}
