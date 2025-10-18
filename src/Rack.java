public class Rack {
    private Shelf[] shelves;

    public Rack(Shelf[] shelves) {
        this.shelves = shelves;
    }

    public Shelf getShelves(int index) {
        if (index < 0 || index >= shelves.length) return null;
        return shelves[index];
    }

    public int countBooksOnRack() {
        int countBook = 0;
        int countShelf = 0;
        for (int i = 0; i < shelves.length; i++) {
            if (shelves[i] != null) {
                countBook += shelves[i].countBooksOnShelf();
            }
        }
        return countBook;
    }

    public Book findBookOnRack(String title) {
        for (int i = 0; i < shelves.length; i++) {
            Book book = shelves[i].findBookOnShelf(title);
            if (book != null && book.getTitle().equals(title)) {
                System.out.println(title + " лежит на полке " + i);
                return book;
            }
        }
        return null;
    }

    public Book takeTheBook(String title) {
        for (int i = 0; i < shelves.length; i++) {
            Book book = shelves[i].takeTheBook(title);
            if (book != null && book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Состояние полок").append("\n").append("полка 1: ").append("\n").
                append(shelves[0]).append("\n").append("полка 2: ").append("\n").append(shelves[1]);

        return sb.toString();
    }


}