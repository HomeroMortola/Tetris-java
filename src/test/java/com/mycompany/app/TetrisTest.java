package com.mycompany.app;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TetrisTest {
    //Test de agregar pieza aleatoria al tablero
    @Test
    public void testAddRandomPieceWithTetris() {
        Tetris tetris = new Tetris();
        tetris.start();
        int piezasAntesInt = tetris.getBoard().getPieces().size();
        tetris.getBoard().addRandomPiece();
        int piezasDespuesInt = tetris.getBoard().getPieces().size();
        assertTrue(piezasDespuesInt == piezasAntesInt + 1); //Verifica que se agregó una pieza a la lista de piezas
        assertTrue(tetris.getBoard().getCurrentPiece() != null); //Verifica que la pieza actual no es nula

        PieceBase piezasAntes = tetris.getBoard().getPieces().get(0); //Obtiene la última pieza agregada
        PieceBase piezasDespues = tetris.getBoard().getPieces().get(1); //Obtiene la pieza actual

        assertTrue(piezasAntes != piezasDespues); //Verifica que las piezas son distintas
    }

    //Test de que la pieza baja con el reloj
    @Test
    public void testMovePieceDownWithClock() {
        Tetris tetris = new Tetris();
        tetris.start();
        PieceBase pieceBefore = tetris.getBoard().getCurrentPiece();
        int yBefore = tetris.getBoard().getCurrentPieceY();
        tetris.tick();
        tetris.tick();
        PieceBase pieceAfter = tetris.getBoard().getCurrentPiece();
        int yAfter = tetris.getBoard().getCurrentPieceY();
        assertTrue(pieceBefore == pieceAfter);
        assertTrue(yBefore == (yAfter + 1));
    }

    //Test de mover pieza lateralmente
    @Test
    public void testMovePieceLeft() {
        Tetris tetris = new Tetris();
        tetris.start();
        PieceBase pieceBefore = tetris.getBoard().getCurrentPiece();
        int xBefore = tetris.getBoard().getCurrentPieceX();
        tetris.moveLeft();
        PieceBase pieceAfter = tetris.getBoard().getCurrentPiece();
        int xAfter = tetris.getBoard().getCurrentPieceX();
        assertTrue(pieceBefore == pieceAfter);
        assertTrue(xBefore == (xAfter + 1));
    }

    @Test
    public void testMovePieceRight() {
        Tetris tetris = new Tetris();
        tetris.start();
        PieceBase pieceBefore = tetris.getBoard().getCurrentPiece();
        int xBefore = tetris.getBoard().getCurrentPieceX();
        tetris.moveRight();
        PieceBase pieceAfter = tetris.getBoard().getCurrentPiece();
        int xAfter = tetris.getBoard().getCurrentPieceX();
        assertTrue(pieceBefore == pieceAfter);
        assertTrue(xBefore == (xAfter - 1));
    }

    //Verifica que el estado inicial es "jugando"
    @Test
    public void testState() {
        Tetris tetris = new Tetris();
        tetris.start();
        int state = tetris.state();
        assertTrue(state == 1); 
    }

    //Verifica que el estado cambio a 3 (perdio)
    @Test
    public void testStateLose(){
        Tetris tetris = new Tetris();
        tetris.start(false);
        PieceBase[] pieces = {
            new PieceStick(),
            new PieceStick(),
            new PieceStick(),
            new PieceStick(),
            new PieceStick()

        };
        for (PieceBase p : pieces){
            tetris.addPiece(p, 5);
            for (int i = 0; i < 45; i++){
                tetris.tick();
            }
        }
        int state = tetris.state();
        assertTrue(state == 3);
        
    }

    @Test
    public void testStateWin(){
        Tetris tetris = new Tetris();
        
        tetris.start(false);
        
        PieceBase[] pieces = {
            new PieceSquare(),
            new PieceSquare(),
            new PieceSquare(),
            new PieceSquare(),
            new PieceSquare(),

        };
        for(int i = 0; i < 3; i++){ 
            for (int p = 0 ; p < 5; p++){
                tetris.addPiece(pieces[p], p*2);
                for (int j = 0; j < 44; j++){
                    
                    tetris.tick();
                }
            } 
        }
        
        int state = tetris.state();
        assertTrue(state == 2);
        
    }


}
