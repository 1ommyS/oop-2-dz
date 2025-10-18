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
            else {
                System.out.println("такой книги нету");
                return null;
            }
        }
        return null;
    }


    public Rack getRacks(int index) {
        if (index < 0 || index >= racks.length) return null;
        return racks[index];
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Состояние библиотеки" + "\n" + "Стеллаж 1: " + "\n" + racks[0] + "\n" +
                "Стеллаж 2: " + "\n" + racks[1]);

        return sb.toString();
    }
}

