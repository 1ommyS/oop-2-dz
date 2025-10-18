public class Library {
    private Rack[] racks;

    public Library(Rack[] racks) {
        this.racks = racks;
    }

    public int racksCount() {
        return racks.length;
    }

    public int totalBooks() {

        int countBook = 0;
        for (Rack rack : racks) {
            if (racks != null) {
                countBook += rack.countBooksOnRack();
            }
        }
        return countBook;
    }

    public Book findBookOnLibrary(String title) {
        for (int i = 0; i < racks.length; i++) {
            Book book = racks[i].findBookOnRack(title);
            if (book != null && book.getTitle().equals(title)) {
                System.out.println(title + " лежит на стеллаже " + i);
                return book;
            }
        }

        return null;
    }

    public Book takeTheBook(String title) {
        for (int i = 0; i < racks.length; i++) {
            Book book = racks[i].takeTheBook(title);
            if (book != null && book.getTitle().equals(title)) {
                System.out.println("взяли книгу " + title);
                return book;
            }
        }
        System.out.println("такой книги нету");
        return null;
    }


    public Rack getRacks(int index) {
        if (index < 0 || index >= racks.length) return null;
        return racks[index];
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Состояние библиотеки").append("\n").append("Стеллаж 1: ").append("\n").append(racks[0])
                .append("\n").append("Стеллаж 2: ").append("\n").append(racks[1]);

        return sb.toString();
    }
}

