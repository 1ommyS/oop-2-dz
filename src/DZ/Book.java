package DZ;

public class Book {

    private String title;
    private String author;
    private int pages;

    @Override
    public String toString() {
        return "| Книга: " + getTitle() + " -> Автор: " + getAuthor() + " -> Страниц: " + getPages();
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
}
