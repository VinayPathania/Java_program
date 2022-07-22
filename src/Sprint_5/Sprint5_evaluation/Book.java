package Sprint_5.Sprint5_evaluation;

import java.util.HashSet;

public class Book {
    int bookId;
    String bookName;
    String author;

    Book(int bookId, String bookName, String author){
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
    }

    public static void main(String[] args) {
        HashSet<Book> booksCollection =new HashSet<>();
        booksCollection.add(new Book(1,"Name1","Author1"));
        booksCollection.add(new Book(2,"Name2","Author1"));
        booksCollection.add(new Book(3,"Name1","Author1"));
        booksCollection.add(new Book(1,"Name4","Author2"));

        System.out.println(booksCollection);

    }
}
