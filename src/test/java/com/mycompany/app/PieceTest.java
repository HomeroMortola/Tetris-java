package com.mycompany.app;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;


public class PieceTest {
    public PieceTest() {
    }

    @Test
    public void testPieceExiste() {
        Piece p = new Piece();
        assertNotNull(p);
    }

    @Test
    public void trstPiece4Elementos() {
        Piece p = new Piece();
        
        assertTrue(p.getElementos().length == 4);
    }
}