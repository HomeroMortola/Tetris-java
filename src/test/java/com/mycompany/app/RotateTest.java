package com.mycompany.app;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RotateTest {

    //Rotación pieza T
    @Test
    public void testPieceTRotateL() {
        PieceBase p = new PieceT();
        Object[] c = p.getCells();
        p.rotateLeft();
        assertTrue(((Cell) c[0]).getX() == 0);
        assertTrue(((Cell) c[0]).getY() == -1);
        assertTrue(((Cell) c[1]).getX() == 0);
        assertTrue(((Cell) c[1]).getY() == 0);
        assertTrue(((Cell) c[2]).getX() == 0);
        assertTrue(((Cell) c[2]).getY() == 1);
        assertTrue(((Cell) c[3]).getX() == 1);
        assertTrue(((Cell) c[3]).getY() == 0);
    }

    @Test
    public void testPieceTRotateR() {
        PieceBase p = new PieceT();
        Object[] c = p.getCells();
        p.rotateRight();
        assertTrue(((Cell) c[0]).getX() == 0);
        assertTrue(((Cell) c[0]).getY() == 1);
        assertTrue(((Cell) c[1]).getX() == 0);
        assertTrue(((Cell) c[1]).getY() == 0);
        assertTrue(((Cell) c[2]).getX() == 0);
        assertTrue(((Cell) c[2]).getY() == -1);
        assertTrue(((Cell) c[3]).getX() == -1);
        assertTrue(((Cell) c[3]).getY() == 0);
    }

    //Rotación pieza Stick
    @Test
    public void testPieceStickRotateL() {
        PieceBase p = new PieceStick();
        Object[] c = p.getCells();
        p.rotateLeft();
        assertTrue(((Cell) c[0]).getX() == 1);
        assertTrue(((Cell) c[0]).getY() == 0);
        assertTrue(((Cell) c[1]).getX() == 0);
        assertTrue(((Cell) c[1]).getY() == 0);
        assertTrue(((Cell) c[2]).getX() == -1);
        assertTrue(((Cell) c[2]).getY() == 0);
        assertTrue(((Cell) c[3]).getX() == -2);
        assertTrue(((Cell) c[3]).getY() == 0);
    }

    @Test
    public void testPieceStickRotateR() {
        PieceBase p = new PieceStick();
        Object[] c = p.getCells();
        p.rotateRight();
        assertTrue(((Cell) c[0]).getX() == -1);
        assertTrue(((Cell) c[0]).getY() == 0);
        assertTrue(((Cell) c[1]).getX() == 0);
        assertTrue(((Cell) c[1]).getY() == 0);
        assertTrue(((Cell) c[2]).getX() == 1);
        assertTrue(((Cell) c[2]).getY() == 0);
        assertTrue(((Cell) c[3]).getX() == 2);
        assertTrue(((Cell) c[3]).getY() == 0);
    }

    //Rotación pieza L derecha
    @Test
    public void testPieceLRRotateL() {
        PieceBase p = new PieceLR();
        Object[] c = p.getCells();
        p.rotateLeft();
        assertTrue(((Cell) c[0]).getX() == 0);
        assertTrue(((Cell) c[0]).getY() == 1);
        assertTrue(((Cell) c[1]).getX() == 0);
        assertTrue(((Cell) c[1]).getY() == 0);
        assertTrue(((Cell) c[2]).getX() == 0);
        assertTrue(((Cell) c[2]).getY() == -1);
        assertTrue(((Cell) c[3]).getX() == -1);
        assertTrue(((Cell) c[3]).getY() == -1);
    }

    @Test
    public void testPieceLRRotateR() {
        PieceBase p = new PieceLR();
        Object[] c = p.getCells();
        p.rotateRight();
        assertTrue(((Cell) c[0]).getX() == 0);
        assertTrue(((Cell) c[0]).getY() == -1);
        assertTrue(((Cell) c[1]).getX() == 0);
        assertTrue(((Cell) c[1]).getY() == 0);
        assertTrue(((Cell) c[2]).getX() == 0);
        assertTrue(((Cell) c[2]).getY() == 1);
        assertTrue(((Cell) c[3]).getX() == 1);
        assertTrue(((Cell) c[3]).getY() == 1);
    }

    //Rotación pieza L izquierda
    @Test
    public void testPieceLLRotateL() {
        PieceBase p = new PieceLL();
        Object[] c = p.getCells();
        p.rotateLeft();
        assertTrue(((Cell) c[0]).getX() == 0);
        assertTrue(((Cell) c[0]).getY() == -1);
        assertTrue(((Cell) c[1]).getX() == 0);
        assertTrue(((Cell) c[1]).getY() == 0);
        assertTrue(((Cell) c[2]).getX() == 0);
        assertTrue(((Cell) c[2]).getY() == 1);
        assertTrue(((Cell) c[3]).getX() == 1);
        assertTrue(((Cell) c[3]).getY() == 1);
    }

    @Test
    public void testPieceLLRotateR() {
        PieceBase p = new PieceLL();
        Object[] c = p.getCells();
        p.rotateRight();
        assertTrue(((Cell) c[0]).getX() == 0);
        assertTrue(((Cell) c[0]).getY() == 1);
        assertTrue(((Cell) c[1]).getX() == 0);
        assertTrue(((Cell) c[1]).getY() == 0);
        assertTrue(((Cell) c[2]).getX() == 0);
        assertTrue(((Cell) c[2]).getY() == -1);
        assertTrue(((Cell) c[3]).getX() == -1);
        assertTrue(((Cell) c[3]).getY() == -1);
    }
    
    //Rotación pieza Dog derecha
    @Test
    public void testPieceDogRRotateL() {
        PieceBase p = new PieceDogR();
        Object[] c = p.getCells();
        p.rotateLeft();
        assertTrue(((Cell) c[0]).getX() == 0);
        assertTrue(((Cell) c[0]).getY() == 1);
        assertTrue(((Cell) c[1]).getX() == 0);
        assertTrue(((Cell) c[1]).getY() == 0);
        assertTrue(((Cell) c[2]).getX() == 1);
        assertTrue(((Cell) c[2]).getY() == 0);
        assertTrue(((Cell) c[3]).getX() == 1);
        assertTrue(((Cell) c[3]).getY() == -1);
    }

    @Test
    public void testPieceDogRRotateR() {
        PieceBase p = new PieceDogR();
        Object[] c = p.getCells();
        p.rotateRight();
        assertTrue(((Cell) c[0]).getX() == 0);
        assertTrue(((Cell) c[0]).getY() == -1);
        assertTrue(((Cell) c[1]).getX() == 0);
        assertTrue(((Cell) c[1]).getY() == 0);
        assertTrue(((Cell) c[2]).getX() == -1);
        assertTrue(((Cell) c[2]).getY() == 0);
        assertTrue(((Cell) c[3]).getX() == -1);
        assertTrue(((Cell) c[3]).getY() == 1);
    }

    //Rotación pieza Dog izquierda
    @Test
    public void testPieceDogLRotateL() {
        PieceBase p = new PieceDogL();
        Object[] c = p.getCells();
        p.rotateLeft();
        assertTrue(((Cell) c[0]).getX() == -1);
        assertTrue(((Cell) c[0]).getY() == 0);
        assertTrue(((Cell) c[1]).getX() == 0);
        assertTrue(((Cell) c[1]).getY() == 0);
        assertTrue(((Cell) c[2]).getX() == 0);
        assertTrue(((Cell) c[2]).getY() == 1);
        assertTrue(((Cell) c[3]).getX() == 1);
        assertTrue(((Cell) c[3]).getY() == 1);
    }

    @Test
    public void testPieceDogLRotateR() {
        PieceBase p = new PieceDogL();
        Object[] c = p.getCells();
        p.rotateRight();
        assertTrue(((Cell) c[0]).getX() == 1);
        assertTrue(((Cell) c[0]).getY() == 0);
        assertTrue(((Cell) c[1]).getX() == 0);
        assertTrue(((Cell) c[1]).getY() == 0);
        assertTrue(((Cell) c[2]).getX() == 0);
        assertTrue(((Cell) c[2]).getY() == -1);
        assertTrue(((Cell) c[3]).getX() == -1);
        assertTrue(((Cell) c[3]).getY() == -1);
    }

    //Tests de colisión al rotar (izquierda y derecha)
    @Test
    public void testCollisionOnRotateLeft() {
        Board board = new Board(10, 20);
        PieceBase piece = new PieceT();
        board.addPiece(piece, 5);
        int[][] grid = board.getGrid();
        int x = board.getCurrentPieceX() + 0;
        int y = board.getCurrentPieceY() - 1;
        grid[x][y] = 1;
        boolean canRotate = board.canRotate(piece, true);
        assertTrue("La pieza NO debe poder rotar por colisión", !canRotate);
    }

    @Test
    public void testCollisionOnRotateRight() {
        Board board = new Board(10, 20);
        PieceBase piece = new PieceT();
        board.addPiece(piece, 5);
        int[][] grid = board.getGrid();
        int x = board.getCurrentPieceX() + 0;
        int y = board.getCurrentPieceY() + 1;
        grid[x][y] = 1;
        boolean canRotate = board.canRotate(piece, false);
        assertTrue(!canRotate);
    }
}
