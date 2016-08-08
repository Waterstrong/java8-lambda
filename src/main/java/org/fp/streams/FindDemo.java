package org.fp.streams;

import static org.apache.commons.lang3.StringUtils.containsIgnoreCase;

import java.util.List;

public class FindDemo {
    public Book findOut(List<Book> books, String name) {
        return books.stream()
                .filter(it -> containsIgnoreCase(it.getName(), name))
                .findAny()
                .orElse(null);
    }
}
