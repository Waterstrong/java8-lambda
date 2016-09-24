package org.fp.streams;

import static java.util.Arrays.asList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class ReduceDemoTest {

    private ReduceDemo reduceDemo;

    @Before
    public void setUp() {
        reduceDemo = new ReduceDemo();
    }

    @Test
    public void shouldCalculateTheSumGivenTheNumberList() {
        assertThat(reduceDemo.sum(asList(1, 2, 3, 5)), is(11));
    }

    @Test
    public void shouldCalculateTheMulGivenTheNumberList() {
        assertThat(reduceDemo.mul(asList(1, 3, 5, 2)), is(30));
    }

    @Test
    public void shouldFindTheMaxValueGivenNumberList() {
        assertThat(reduceDemo.max(asList(-31, -3, -5, -2, -20)), is(-2));
    }
}
