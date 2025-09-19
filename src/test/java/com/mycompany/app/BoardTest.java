package com.mycompany.app;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BoardTest {
    @Test
    public void testBoardExiste() {
        Board board1 = new Board(10, 20);
        assertNotNull(board1);
    }
    @Test
    public void testBoardWidth() {
        Board board1 = new Board(10, 20);
        
    }
    @Test
    public void testCaidaLibreStick() {
        Board board1 = new Board(10, 20);
        PieceBase piece1 = new PieceStick(5,20);
        boolean todosMayorIgualCero = true;
        boolean alMenosUnoCero = false;

        board1.addPiece(piece1);
        for (int i = 0; i < 19; i++) {
            board1.moveDown();
        }
        for (int i = 0; i < 4; i++) {
            if (board1.getCurrentPiece().getElementos()[i].getY() < 0) {
            todosMayorIgualCero = false;
            }
            if (board1.getCurrentPiece().getElementos()[i].getY() == 0) {
                alMenosUnoCero = true;
            }
        }
        assertTrue(todosMayorIgualCero);
        assertTrue(alMenosUnoCero);
    }
    @Test
    public void testCaidaLibreSquare() {
        Board board1 = new Board(10, 20);
        PieceBase piece1 = new PieceSquare(5,20);
        boolean todosMayorIgualCero = true;
        boolean alMenosUnoCero = false;

        board1.addPiece(piece1);
        for (int i = 0; i < 20; i++) {
            board1.moveDown();
        }
        for (int i = 0; i < 4; i++) {
            if (board1.getCurrentPiece().getElementos()[i].getY() < 0) {
            todosMayorIgualCero = false;
            }
            if (board1.getCurrentPiece().getElementos()[i].getY() == 0) {
                alMenosUnoCero = true;
            }          
        }
        assertTrue(todosMayorIgualCero);
        assertTrue(alMenosUnoCero);

        

       
    }
}
