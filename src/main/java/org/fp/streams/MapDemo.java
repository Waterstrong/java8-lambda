package org.fp.streams;

import static org.apache.commons.lang3.StringUtils.containsIgnoreCase;

import java.util.List;

public class MapDemo {
    public String findOut(List<Book> books, String name) {
        return books.stream()
                .filter(it -> containsIgnoreCase(it.getName(), name))
                .map(Book::getName)
                .findAny()
                .orElse("");
    }
}
