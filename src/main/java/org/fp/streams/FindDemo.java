package org.fp.streams;

import static java.lang.String.format;
import static org.apache.commons.lang3.StringUtils.containsIgnoreCase;

import java.util.List;

public class FindDemo {
    public Book findOut(List<Book> books, String name) {
        return books.stream()
                .filter(it -> containsIgnoreCase(it.getName(), name))
                .findAny()
                .orElse(null);
    }


    public void assertBookPriceValid(List<Book> books) {
        books
                .stream()
                .filter(it -> it.getPrice() < 0)
                .findFirst()
                .ifPresent(book -> {
                    throw new RuntimeException(format("book price <%s> is invalid", book.getPrice()));
                });
    }
}
