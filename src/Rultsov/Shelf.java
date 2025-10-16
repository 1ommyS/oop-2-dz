package Rultsov;

import java.util.Arrays;
import java.util.SortedMap;

public class Shelf {
    private Book[] books;


    public Shelf(Book[] books) {
        this.books = books;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public void addBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].equals(book)){
                System.out.println("Дубликат");
                return;
            }
        }
        for(int i = 0; i < books.length; i++){
            if(books[i] == null){
                books[i] = book;
                System.out.println("Книгу вставили на свободное место");
                return;
            }
        }
    } // добовляем и проверфем если свободное место именно

    public boolean hasFreeSpace(){
        for(Book b : books){
            if(b == null) return true;
        }
        return false;
    } //есть ли своболное место

    public void addBook(String title, String author, int pages) { // либо можно добовлять так
        Book book = new Book(title, author, pages);
        addBook(book);
    } // добовляем книгу перегрузка

    public String searchName(String title) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].getTitle().equals(title)) {
                return "Книга " + title + " стоит по счету " + i;
            }
        }
        return null;
    } // находим книгу по названию

    public int allBook() {
        int count = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                count++;
            }
        }
        return count;
    } //количество книг

    public Book deliteBook(String title) {
        Book delBook = null;
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].getTitle().equals(title)) {
                delBook = books[i];
                books[i] = null;
                System.out.println("Взял книгу: " + delBook + " с полки");
                return delBook;
            }
        }
        System.out.println("Книга не найдена на полке");
        return null;
    } // возвращаем книгу и удаляем ее с полки


    // В классе Shelf
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Полка:\n");

        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                sb.append("   ").append(i).append(books[i]).append("\n");
            }
        }
        return sb.toString();
    }
}
