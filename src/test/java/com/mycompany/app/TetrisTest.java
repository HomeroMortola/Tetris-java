package com.mycompany.app;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TetrisTest {
    @Test
    public void testAddRandomPieceWithTetris() {
        Tetris tetris = new Tetris();
        tetris.start();
        int piezasAntes = tetris.getBoard().getPieces().size();
        tetris.getBoard().addRandomPiece();
        int piezasDespues = tetris.getBoard().getPieces().size();
        assertTrue(piezasDespues == piezasAntes + 1); //Verifica que se agregó una pieza a la lista de piezas
        assertTrue(tetris.getBoard().getCurrentPiece() != null); //Verifica que la pieza actual no es nula
    }

}
