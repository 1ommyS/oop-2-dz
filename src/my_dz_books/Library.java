package my_dz_books;

public class Library {
    private Rack[] racks;

    public Library(Rack[] racks) {
        this.racks = racks;
    }

    public int racksCount() {
        return racks.length;
    }

    public Rack getRack(int index) {
        if (index >= 0 && index < racks.length) {
            return racks[index];
        }
        return null;
    }

    public int totalbooks() {
        int total = 0;

        for (int i = 0; i < racks.length; i++) {
            total += racks[i].totalBooks();
        }
        return total;
    }

    public Book findBookByTitle(String title) {
        for(var rack : racks) {
            for (var shelf : rack.getShelves()) {
                Book book = shelf.findBookByTittle(title);

                if (book != null) {
                    return book;
                }
            }
        }
        return null;
    }

    public String toString() {
        return String.format("Racks: %d, %d, %d", racks.length, totalbooks(), totalbooks());
    }
}
