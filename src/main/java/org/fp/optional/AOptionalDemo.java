package org.fp.optional;

import static java.util.Optional.ofNullable;

import org.fp.streams.Book;

public class AOptionalDemo {
    public double getBookSubtotal(Book book, int amount) {
        return ofNullable(book).orElse(new Book()).getPrice() * amount;
    }
}
