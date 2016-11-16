package org.fp.streams;

import static java.util.Arrays.asList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class FindDemoTest {

    private FindDemo findDemo;
    private List<Book> books;

    @Before
    public void setUp() {
        findDemo = new FindDemo();
        books = asList(
                new Book(111, "C++ Primer"),
                new Book(112, "Refactor"),
                new Book(113, "Thinking in Java"));
    }

    @Test
    public void shouldFindBookGivenBookNameInTheList() {
        Book book = findDemo.findOut(books, "Primer");

        assertThat(book.getId(), is(111));
        assertThat(book.getName(), is("C++ Primer"));
    }

    @Test
    public void shouldReturnNullGivenBookNameNotInTheList() {
        assertNull(findDemo.findOut(books, "Hello"));
    }

    @Test(expected = RuntimeException.class)
    public void shouldThrowExceptionGivenInvalidBookPrice() {
        books.add(new Book(114, "Hello", -1d));
        findDemo.assertBookPriceValid(books);
    }

    @Test
    public void shouldNotThrowExceptionGivenValidBookPrice() {
        findDemo.assertBookPriceValid(books);
    }
}
