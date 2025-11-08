public class Rack {
    private Shelf[] shelves;

    public Rack(Shelf[] shelves) {
        this.shelves = shelves;
    }

    public Shelf[] getShelves() {
        return shelves;
    }

    public Shelf getShelf(int index) {
        if (index < 0 || index >= shelves.length) {
            return null;
        }

        return shelves[index];
    }

    public int totalBooks() {
        int result = 0;
        for (var shelf : shelves) {
            result += shelf.getBooksLength();
        }

        return result;
    }

    public int findFirstByTitle(String title) {
        for (int i = 0; i < shelves.length; i++) {
            if (shelves[i] != null && shelves[i].indexOfByTitle(title) != -1) return i;
        }

        return -1;
    }
}
