package com.mycompany.app;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;


public class TetrisTest {
    public TetrisTest() {
    }

    @Test
    public void testTetrisExiste() {
        Tetris t = new Tetris(10, 20);
        assertNotNull(t);
    }
    
}
