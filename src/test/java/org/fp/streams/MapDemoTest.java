package org.fp.streams;

import static java.util.Arrays.asList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class MapDemoTest {

    private MapDemo mapDemo;
    private List<Book> books;

    @Before
    public void setUp() {
        mapDemo = new MapDemo();
        books = asList(
                new Book(111, "C++ Primer"),
                new Book(112, "Refactor"),
                new Book(113, "Thinking in Java"));
    }

    @Test
    public void shouldFindOutForNameGivenBookNameInTheList() {
        assertThat(mapDemo.findOut(books, "primer"), is("C++ Primer"));
    }

    @Test
    public void shouldFindOutForNameReturnEmptyGivenBookNameNotInTheList() {
        assertThat(mapDemo.findOut(books, "hello"), is(""));
    }

}
