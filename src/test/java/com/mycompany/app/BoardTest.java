package com.mycompany.app;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class BoardTest {
    @Test
    public void testTetrisExiste() {
        Board b = new Board(10, 20);
        assertNotNull(b);
    }
}
