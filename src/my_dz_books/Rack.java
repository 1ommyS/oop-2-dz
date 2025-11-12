package my_dz_books;

public class Rack {
    private Shelf[] shelves;

    public Rack(Shelf[] shelves) {
        this.shelves = shelves;
    }

    public Shelf[] getShelves() {
        return shelves;
    }

    public Shelf getShelf(int index) {
        if (index >= 0 && index < shelves.length) {
            return shelves[index];
        }
        return null;
    }

    public int totalBooks() {
        int sum = 0;

        for (int i = 0; i < shelves.length; i++) {
            sum += shelves[i].sumBooks();
        }
        return sum;
    }

    public int findFirstByTittle (String tittle) {
        for (int i = 0; i < shelves.length; i++) {

//            String needName = tittle;
//            if (needName.equals(shelves[i].indexOfByTittle(tittle))) {
//                return i;
//            }
            if(shelves[i].findOfByTittle(tittle) != 0) return i;
        }
        return -1;
    }
}
