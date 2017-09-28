package com.github.sgrillon14.sampleut;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void testHelloWorldNull() {
        App.main(null);
    }

    @Test
    public void testHelloWorldNull2() {
        App.main(null);
    }

    @Test
    public void testHelloWorldOK() {
        App.main(new String[1]);
    }
}
