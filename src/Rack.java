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
        sb.append("Состояние полок" + "\n" + "полка 1: " + "\n" + shelves[0] + "\n" +
                "полка 2: " + "\n" + shelves[1]);

        return sb.toString();
    }


}