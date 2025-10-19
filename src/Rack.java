import java.util.Arrays;

public class Rack {
    private Shelf[] shelves;

    public Rack(Shelf[] shelves) {
        this.shelves = shelves;
    }

    public Shelf[] getShelves() {
        return shelves;
    }

    //вернуть ссылку на полку
    public Shelf getShelf(int index) {
        if (index < 0 || index >= shelves.length) return null;
        return shelves[index];
    }

//суммарно книг на всех полках
    public int totalBooks() {
        int total = 0;
        for (Shelf shelf : shelves) {
            total+=shelf.getBooksLength();
        }
        return total;
    }

//вернуть индекс полки, где впервые встречается книга с таким названием, либо -1
    public int findFirstByTitle(String title) {
        for (int i = 0; i < shelves.length; i++) {
            if (shelves[i].indexOfByTitle(title) != -1)
                return i;
        } return 1;
    }

    @Override
    public String toString() {
        return "Количество полок в стеллаже: " + shelves.length +", количество книг: " + totalBooks() ;
    }

}
