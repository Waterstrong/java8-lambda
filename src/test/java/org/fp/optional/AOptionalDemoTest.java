package org.fp.optional;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.fp.streams.Book;
import org.junit.Before;
import org.junit.Test;

public class AOptionalDemoTest {

    private AOptionalDemo optionalDemo;

    @Before
    public void setUp() {
        optionalDemo = new AOptionalDemo();
    }

    @Test
    public void shouldGetSubTotalGivenTheBook() {
        assertThat(optionalDemo.getBookSubtotal(new Book(1, "Hello", 35d), 2), is(70d));
    }

    @Test
    public void shouldGetSubTotalZeroGivenNullBook() {
        assertThat(optionalDemo.getBookSubtotal(null, 2), is(0d));
    }
}
