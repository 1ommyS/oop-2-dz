import java.util.Arrays;

public class Library {
    private Rack[] racks;

    public Library(Rack[] racks) {
        this.racks = racks;
    }

    public int racksCount() {
        return racks.length;
    }

    public Rack getRack(int index) {
        if (index < 0 || index >= racks.length)
            return null;
        return racks[index];
    }

    public int totalBooks() {
        int totalBooks = 0;
        for (Rack rack : racks) {
            totalBooks += rack.totalBooks(); // используем метод Rack
        }
        return totalBooks;

    }

    public Book findByTitle(String title) {
        for (Rack rack : racks) {
            for (Shelf shelf : rack.getShelves()) {
                Book book = shelf.findOfByTitle(title);
                if (book != null)
                    return book;
            }

        }return null;
    }

    @Override
    public String toString() {
        return "Library{" +
                "racks=" + Arrays.toString(racks) +
                '}';
    }
}





