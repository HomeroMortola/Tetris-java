package com.mycompany.app;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;


public class PieceTest {
    public PieceTest() {
    }

    @Test
    public void testPieceExiste() {
        PieceBase p = new PieceSquare(0, 0);
        assertNotNull(p);
    }

    @Test
    public void testPiece4Elementos() {
        PieceBase p = new PieceSquare(0, 0);
        assertTrue(p.getElementos().length == 4);
    }
    
}