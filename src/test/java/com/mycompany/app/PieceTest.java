package com.mycompany.app;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
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
    
    @Test
    public void testPieceSquer() {
        Constantes ctes = new Constantes();
        PieceBase p1 = new PieceSquare(0, 0);
        Cell[] cels = p1.getElementos();
        assertArrayEquals("n",p1.getElementos(), ctes.getCubo());
        

        
        
    }
    @Test
    public void testPieceStick() {
        PieceBase p = new PieceStick(0, 0);
        Object[] c = p.getElementos();
        assertTrue(((Cell) c[0]).getX()==0);
        assertTrue(((Cell) c[0]).getY()==-1);
        assertTrue(((Cell) c[1]).getX()==0);
        assertTrue(((Cell) c[1]).getY()==0);
        assertTrue(((Cell) c[2]).getX()==0);
        assertTrue(((Cell) c[2]).getY()==1);
        assertTrue(((Cell) c[3]).getX()==0);
        assertTrue(((Cell) c[3]).getY()==2);

    }
    @Test
    public void testPieceLR() {
        PieceBase p = new PieceLR(0, 0);
        Object[] c = p.getElementos();
        assertTrue(((Cell) c[0]).getX()==-1);
        assertTrue(((Cell) c[0]).getY()==0);
        assertTrue(((Cell) c[1]).getX()==0);
        assertTrue(((Cell) c[1]).getY()==0);  
        assertTrue(((Cell) c[2]).getX()==1);
        assertTrue(((Cell) c[2]).getY()==0);
        assertTrue(((Cell) c[3]).getX()==2);
        assertTrue(((Cell) c[3]).getY()==-1);
    }
    @Test
    public void testPieceLL() {
        PieceBase p = new PieceLL(0, 0);
        Object[] c = p.getElementos();
        assertTrue(((Cell) c[0]).getX()==1);
        assertTrue(((Cell) c[0]).getY()==0);
        assertTrue(((Cell) c[1]).getX()==0);
        assertTrue(((Cell) c[1]).getY()==0);  
        assertTrue(((Cell) c[2]).getX()==-1);
        assertTrue(((Cell) c[2]).getY()==0);
        assertTrue(((Cell) c[3]).getX()==-2);
        assertTrue(((Cell) c[3]).getY()==1);
    }
    @Test
    public void testPieceT() {
        PieceBase p = new PieceT(0, 0);
        Object[] c = p.getElementos();
        assertTrue(((Cell) c[0]).getX()==-1);
        assertTrue(((Cell) c[0]).getY()==0);
        assertTrue(((Cell) c[1]).getX()==0);
        assertTrue(((Cell) c[1]).getY()==0);  
        assertTrue(((Cell) c[2]).getX()==1);
        assertTrue(((Cell) c[2]).getY()==0);
        assertTrue(((Cell) c[3]).getX()==0);
        assertTrue(((Cell) c[3]).getY()==-1);
    }
    @Test
    public void testPieceDogR() {
        PieceBase p = new PieceDogR(0, 0);
        Object[] c = p.getElementos();
        assertTrue(((Cell) c[0]).getX()==1);
        assertTrue(((Cell) c[0]).getY()==0);
        assertTrue(((Cell) c[1]).getX()==0);
        assertTrue(((Cell) c[1]).getY()==0);  
        assertTrue(((Cell) c[2]).getX()==-1);
        assertTrue(((Cell) c[2]).getY()==0);
        assertTrue(((Cell) c[3]).getX()==-1);
        assertTrue(((Cell) c[3]).getY()==-1);
    }
    @Test
    public void testPieceDogL() {
        PieceBase p = new PieceDogL(0, 0);
        Object[] c = p.getElementos();
        assertTrue(((Cell) c[0]).getX()==0);
        assertTrue(((Cell) c[0]).getY()==-1);
        assertTrue(((Cell) c[1]).getX()==0);
        assertTrue(((Cell) c[1]).getY()==0);  
        assertTrue(((Cell) c[2]).getX()==1);
        assertTrue(((Cell) c[2]).getY()==0);
        assertTrue(((Cell) c[3]).getX()==1);
        assertTrue(((Cell) c[3]).getY()==1);
    }
    
}