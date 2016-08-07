package org.java8.streams;

import static java.util.Arrays.asList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;

public class FilterDemoTest {

    @Test
    public void shouldFilterOutStringGivenTheLineList() {
        List<String> lines = asList("mac", "windows", "linux", "hello world", "system");
        FilterDemo filterDemo = new FilterDemo();

        List<String> results = filterDemo.filterOut(lines, "hello");

        assertThat(results.size(), is(4));
        assertFalse(results.contains("hello world"));
    }
}
