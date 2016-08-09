package org.fp.lambda;

import static java.util.Arrays.asList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;

public class SortDemoTest {

    @Test
    public void shouldSortLinesByDictAsc() {
        SortDemo sortDemo = new SortDemo();
        List<String> lines = asList("Scrum", "Linux", "Unix", "Story");
        List<String> results = sortDemo.sortByDictAsc(lines);

        assertThat(results.size(), is(4));
        assertThat(results.get(0), is("Linux"));
        assertThat(results.get(1), is("Scrum"));
        assertThat(results.get(2), is("Story"));
        assertThat(results.get(3), is("Unix"));
    }
}
