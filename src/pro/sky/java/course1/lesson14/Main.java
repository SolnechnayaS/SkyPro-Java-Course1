package pro.sky.java.course1.lesson14;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Астрид", "Эриксон");
        author1.setLastName("Линдгрен"); //уточнение фамилии автора

        Author author2 = new Author("Жюль", "Верн");

        Book book1 = new Book(author1, "Пе́ппи Дли́нныйчуло́к", 1945);
        System.out.println(book1);

        Book book2 = new Book(author2, "Дети Капитана Гранда", 1865);
        book2.setBookName("Дети капитана Гранта"); //исправлены орфорграфиеские ошибки в названии книги
        book2.setBookPublishingYear(1867); //уточнена дата издания книги
        System.out.println(book2);

        Book book3 = new Book(author1, "Карлсон, который живёт на крыше", 1955);
        book3.setBookName("Малыш и Карлсон, который живёт на крыше");
        System.out.println(book3);

        Book book4 = new Book(author1, "Малыш и Карлсон, который живёт на крыше", 1955);
        System.out.println(book4);

        Author author3 = new Author("Жюль", "Вёрн");

        System.out.println();
        System.out.println("Сравнение книги 3 и книги 4: " + book3.equals(book4));
        System.out.println("Сравнение автора 1 и автора 2: " + author1.equals(author2));
        System.out.println("Сравнение автора 1 и книги 4: " + author1.equals(book4));

        System.out.println();
        System.out.println("Хэш-код Книги 1: " + book1.hashCode());
        System.out.println("Хэш-код Книги 2: " + book2.hashCode());
        System.out.println("Хэш-код Книги 3: " + book3.hashCode());
        System.out.println("Хэш-код Книги 4: " + book4.hashCode());
        System.out.println("Хэш-код Автора 1: " + author1.hashCode());
        System.out.println("Хэш-код Автора 2: " + author2.hashCode());
        System.out.println("Хэш-код Автора 3: " + author3.hashCode());
    }
}