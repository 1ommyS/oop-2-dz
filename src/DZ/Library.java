package DZ;

public class Library {

    private Rack[] racks;

    @Override
    public String toString() {
        return racks.toString();
    }

    public Book findByTitle(String title) {                 // Возвращает информацию о книге переданной в параметры
        for (int i = 0; i < racksCount(); i++) {
            int result = racks[i].findFirstByTitle(title);
            if (result != -1) {
                for (int j = 0; j < racks[i].shelvesLength(); j++)
                    for (int n = 0; n < racks[j].getShelf(j).booksLength(); n++) {
                        if (racks[i].getShelf(j).get(n).getTitle().equals(title))
                            return racks[i].getShelf(j).get(n);
                    }
            }
        }
        return null;
    }

    public int totalBooks() {                   // Возвращает количество книг со всех стеллажей и полок
        int sum = 0;
        for (int i = 0; i < racks.length; i++) {
            sum += racks[i].totalBooks();
        }

        return sum;
    }

    public Rack getRack(int index) {            // Возвращает стеллаж по индексу
        if (index < 0 || index >= racks.length) {
            return null;
        }

        return racks[index];
    }

    public int racksCount() {                   // Количество стеллажей
        return racks.length;
    }

    public Library(Rack[] racks) {
        this.racks = racks;
    }
}
