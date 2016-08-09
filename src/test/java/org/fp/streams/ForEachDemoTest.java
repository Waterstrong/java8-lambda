package org.fp.streams;

import static java.util.Arrays.asList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class ForEachDemoTest {

    private List<String> lines;
    private ForEachDemo forEachDemo;

    @Before
    public void setUp() {
        lines = asList("water", "lsq@demo.com", "sss", "hello");
        forEachDemo = new ForEachDemo();
    }

    @Test
    public void shouldAddSuffixToEachLines() {
        List<String> results = forEachDemo.addSuffix(lines, "@demo.com");

        assertThat(results.size(), is(4));
        assertThat(results.get(0), is("water@demo.com"));
        assertThat(results.get(1), is("lsq@demo.com"));
        assertThat(results.get(3), is("hello@demo.com"));
    }

    @Test
    public void shouldFilterOutLineLengthIsGreaterThanThreeAndAddSuffixToEachLines() {
        List<String> results = forEachDemo.addSuffixWithLength(lines, "@demo.com");

        assertThat(results.size(), is(3));
        assertThat(results.get(0), is("water@demo.com"));
        assertThat(results.get(1), is("lsq@demo.com"));
        assertThat(results.get(2), is("hello@demo.com"));
    }
}
