package book;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Book bookThree = new Book("Animal Farm", 2003, "George Orwell");
        Book bookTwo = new Book("The Documents in the Case", 2003);
        Book bookOne = new Book("The Documents in the Case", 1930, "Dorothy Sayers", "Robert Eustace");


        List<Book> books = new ArrayList<>();
        books.add(bookOne);
        books.add(bookTwo);
        books.add(bookThree);
        books.sort(new BookComparator());
        for (Book book : books) {
            System.out.println(book.getTitle() + " "+book.getYear());
        }
    }
}




