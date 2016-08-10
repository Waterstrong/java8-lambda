package org.fp.interfaces;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class DefaultMethodDemoTest {

    private final DefaultMethodDemo defaultMethodDemo = new DefaultMethodDemo();

    @Test
    public void shouldCallDefaultMethodGivenInterface() {
        assertThat(defaultMethodDemo.callDefault(4), is(16d));
    }

    @Test
    public void shouldCallImplMethodGivenInterface() {
        assertThat(defaultMethodDemo.callImpl(4), is(8d));
    }
}
