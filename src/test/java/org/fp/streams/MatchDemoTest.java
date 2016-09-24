package org.fp.streams;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class MatchDemoTest {

    private MatchDemo matchDemo;

    @Before
    public void setUp() {
        matchDemo = new MatchDemo();
    }

    @Test
    public void shouldReturnTrueIfOneMatchTheRule() {
        assertTrue(matchDemo.anyMatch(asList("water", "lsq@demo.com", "sss", "Hi, hello, Ha")));
    }

    @Test
    public void shouldReturnFalseIfNoLineMatchTheRule() {
        assertFalse(matchDemo.anyMatch(asList("Cool", "HsI")));
    }
}
