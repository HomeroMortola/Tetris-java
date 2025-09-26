package com.mycompany.app;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RotateTest {
    @Test
    public void testPieceTRotateL() {
        PieceBase p = new PieceT();
        Object[] c = p.getCells();
        
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
        PieceBase p = new PieceT();
        Object[] c = p.getCells();
        p.rotateRight();
        assertTrue(((Cell) c[0]).getX()==0);
        assertTrue(((Cell) c[0]).getY()==1);

        assertTrue(((Cell) c[1]).getX()==0);
        assertTrue(((Cell) c[1]).getY()==0);
         
        assertTrue(((Cell) c[2]).getX()==0);
        assertTrue(((Cell) c[2]).getY()==-1);

        assertTrue(((Cell) c[3]).getX()==-1);
        assertTrue(((Cell) c[3]).getY()==0);
    }

    @Test
    public void testCollisionOnRotateLeft() {
        Board board = new Board(10, 20);
        PieceBase piece = new PieceT();
        board.addPiece(piece);

        //Crea una sola celda que ocupe la posición donde la pieza rotaría
        int[][] grid = board.getGrid();
        //Coloca la celda a la izquierda de la pieza (posición donde la celda [0] de PieceT estaría tras rotar a la izquierda)
        int x = board.getCurrentPieceX() + 0;
        int y = board.getCurrentPieceY() - 1;
        grid[x][y] = 1; //Ocupa la celda en el grid

        boolean canRotate = board.canRotate(piece, true);
        assertTrue("La pieza NO debe poder rotar por colisión", !canRotate); //La pieza no se podría rotar debido a la colisión
    }

    //Lo mismo que el test anterior, pero para la rotación a la derecha
    @Test
    public void testCollisionOnRotateRight() {
        Board board = new Board(10, 20);
        PieceBase piece = new PieceT();
        board.addPiece(piece);

        int[][] grid = board.getGrid();
        int x = board.getCurrentPieceX() + 0;
        int y = board.getCurrentPieceY() + 1;
        grid[x][y] = 1;

        boolean canRotate = board.canRotate(piece, false);
        assertTrue(!canRotate);
    }
}
