package com.mycompany.app;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BoardTest {
    @Test
    public void testBoardExiste() {
        Board b = new Board(10, 20);
        assertNotNull(b);
    }
    @Test
    public void testBoardWidth() {
        Board b = new Board(10, 20);
        
    }
}
