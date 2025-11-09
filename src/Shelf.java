public class Shelf {
    private Book[] book;

    public Shelf(Book[] book) {
        this.book = book;
    }

    //    Получить индекс книги по названию
    public int indexOfByTitle(String title) {
        if (title == null) {
            return -1;
        }

        for (int i = 0; i < book.length; i++) {
            if (book[i].getTitle().equals(title)) {
                return i;
            }
        }

        return -1;
    }

    //    Получить количество книг
    public int getBookCount() {
        return this.book.length;
    }


    //   Возвращает массив книг, хранящийся на полке
    public Book[] getBooks() {
        return this.book;
    }

    //    Возвращает книгу по индексу
    public Book get(int index) {
        if (index < 0 || index >= book.length) {
            return null;
        }
        return book[index];
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < book.length; i++) {
            result.append(book[i].toString());
        }
        return result.toString();
    }
}

