package pro.sky.java.course1.lesson14;

import java.util.Objects;

public class Book {
    private final Author author;
    private String bookName;
    private int bookPublishingYear;

    public Book(Author author, String bookName, int bookPublishingYear) {
        this.author = author;
        this.bookName = bookName;
        this.bookPublishingYear = bookPublishingYear;

    }

//    public String getAuthorFullName() {
//        String authorFullName = this.author.toString();
//        return authorFullName;
//    }

    public String getAuthorFullName() {
        return author.toString();
    }
    public String getBookName() {
        return this.bookName;
    }

    public int getBookPublishingYear() {
        return this.bookPublishingYear;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setBookPublishingYear(int bookPublishingYear) {
        this.bookPublishingYear = bookPublishingYear;
    }
    @Override
    public String toString() {
        return "\nДанные о книге:\nАвтор: " + getAuthorFullName() + "\nНазвание книги: " + getBookName() + "\nГод издания книги: " + getBookPublishingYear();
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, bookName, bookPublishingYear);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookPublishingYear == book.bookPublishingYear && author.equals(book.author) && bookName.equals(book.bookName);
    }
}