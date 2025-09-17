package com.mycompany.app;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RotateTest {
    @Test
    public void testPieceTRotateL() {
        PieceBase p = new PieceT(0, 0);
        Object[] c = p.getElementos();
        
        p.rotateLeft();
        assertTrue(((Cell) c[0]).getX()==0);
        assertTrue(((Cell) c[0]).getY()==-1);

        assertTrue(((Cell) c[1]).getX()==0);
        assertTrue(((Cell) c[1]).getY()==0);  

        assertTrue(((Cell) c[2]).getX()==0);
        assertTrue(((Cell) c[2]).getY()==1);

        assertTrue(((Cell) c[3]).getX()==1);
        assertTrue(((Cell) c[3]).getY()==0);
    }
    @Test
    public void testPieceTRotateR() {
        PieceBase p = new PieceT(0, 0);
        Object[] c = p.getElementos();
        p.rotateRight();
        assertTrue(((Cell) c[0]).getX()==0);
        assertTrue(((Cell) c[0]).getY()==-1);

        assertTrue(((Cell) c[1]).getX()==0);
        assertTrue(((Cell) c[1]).getY()==0);
         
        assertTrue(((Cell) c[2]).getX()==0);
        assertTrue(((Cell) c[2]).getY()==1);

        assertTrue(((Cell) c[3]).getX()==1);
        assertTrue(((Cell) c[3]).getY()==0);
    }
}
