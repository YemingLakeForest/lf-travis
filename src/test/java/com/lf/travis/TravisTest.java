package com.lf.travis;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TravisTest {

    @Test
    public void oopsTest() {
        Travis travis = new Travis();
        assertEquals("oops", travis.oops());
    }

}