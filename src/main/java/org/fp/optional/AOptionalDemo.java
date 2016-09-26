package org.fp.optional;

import static java.util.Optional.ofNullable;

import org.fp.streams.Book;

public class AOptionalDemo {
    public double getBookSubtotal(Book book, int amount) {
        return ofNullable(book).orElse(new Book()).getPrice() * amount;
    }

    public double getBookSubtotal2(Book book, int amount) {
        return ofNullable(book).orElseThrow(RuntimeException::new).getPrice() * amount;
    }

    public double getBookSubtotal3(Book book, int amount) {
        return ofNullable(book).orElseGet(Book::new).getPrice() * amount;
    }
}
