package book;

import java.util.Iterator;

public class Library<Book> implements Iterable<Book> {
    private Book[] books;

    public Library(Book... books) {
        this.books = books;
    }

    @Override
    public Iterator<Book> iterator() {
        return new LibraryIterator();
    }

    private class LibraryIterator implements Iterator<Book> {
        private int i = 0;

        @Override
        public boolean hasNext() {
            return i < books.length;
        }

        public Book next() {

            return books[i++];
        }

    }

}

