package org.fp.interfaces;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class FunctionalDemoTest {

    @Test
    public void shouldCallConverter() {
        assertThat(new FunctionalDemo().call("12"), is(12));
    }
}
