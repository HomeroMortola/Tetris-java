package com.mycompany.app;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BoardTest {
    //Test de verificacion de existencia del tablero
    @Test
    public void testBoardExiste() {
        Board board1 = new Board(10, 20);
        assertNotNull(board1);
    }

    //Test de adición de una pieza al tablero
    @Test
    public void testAddPiece() {
        Board board1 = new Board(10, 20);
        PieceBase piece1 = new PieceSquare();
        board1.addPiece(piece1, 5);
        assertTrue(board1.getPieces() != null);
        assertTrue(board1.getCurrentPiece() == piece1);
    }
    
    //Test de caida libre de piezas
    //Stick
    @Test
    public void testStickFreeFall() {
        Board board1 = new Board(10, 20);
        PieceBase piece1 = new PieceStick();
        boolean todosMayorIgualCero = true;
        boolean alMenosUnoCero = false;

        board1.addPiece(piece1,5);
        for (int i = 0; i < 40; i++) {
            board1.moveDown();
        }
        for (int i = 0; i < 4; i++) {
            if (board1.getGrid()[0][i] < 0) {
                todosMayorIgualCero = false;
            }
            if (board1.getGrid()[0][i] == 0) {
                alMenosUnoCero = true;
                break;
            }
        }
        
        assertTrue(todosMayorIgualCero);
        assertTrue(alMenosUnoCero);
    }

    //Square
    @Test
    public void testSquareFreeFall() {
        Board board1 = new Board(10, 20);
        PieceBase piece1 = new PieceSquare();
        boolean todosMayorIgualCero = true;
        boolean alMenosUnoCero = false;

        board1.addPiece(piece1,5);
        for (int i = 0; i < 40; i++) {
            board1.moveDown();
        }

        for (int i = 0; i < 4; i++) {
            if (board1.getGrid()[0][i] < 0) {
                todosMayorIgualCero = false;
            }
            if (board1.getGrid()[0][i] == 0) {
                alMenosUnoCero = true;
                break;
            }          
        }
        assertTrue(todosMayorIgualCero);
        assertTrue(alMenosUnoCero);
    }

    //Test de colisión entre piezas
    //Square y Stick
    @Test
    public void testColision() {
        Board board1 = new Board(10, 20);
        PieceBase piece1 = new PieceSquare();
        PieceBase piece2 = new PieceStick();

        board1.addPiece(piece1,5);
        for (int i = 0; i < 40; i++) {
            board1.moveDown();
        }

        board1.addPiece(piece2,5);
        for (int i = 0; i < 40; i++) {
            board1.moveDown();
        }

        assertTrue(board1.getGrid()[5][2]==1);
        assertTrue(board1.getGrid()[5][3]==1);
        assertTrue(board1.getGrid()[5][4]==1);
        assertTrue(board1.getGrid()[5][5]==1);                
    }

    //Square y LL
    @Test
    public void testColision2() {
        Board board1 = new Board(10, 20);
        PieceBase piece1 = new PieceSquare();
        PieceBase piece2 = new PieceLL();

        board1.addPiece(piece1,5);
        for (int i = 0; i < 40; i++) {
            board1.moveDown();
        }

        board1.addPiece(piece2,5);
        for (int i = 0; i < 40; i++) {
            board1.moveDown();
        }

        assertTrue(board1.getGrid()[5][2]==1);
        assertTrue(board1.getGrid()[5][2]==1);
        assertTrue(board1.getGrid()[5][2]==1);
        assertTrue(board1.getGrid()[4][3]==1);
        
               
    }

    //Test de verificación de movimiento horizontal (tanto izquierda como derecha)
    @Test
    public void testHorizontalMovement() {
        Board board1 = new Board(10, 20);
        PieceBase piece1 = new PieceSquare();
        PieceBase piece2 = new PieceSquare();
        PieceBase piece3 = new PieceLL();
        board1.addPiece(piece1,5);

        for (int i = 0; i < 40; i++) {
            board1.moveLeft();
        }
        for (int i = 0; i < 40; i++) {
            board1.moveDown();
        }

        assertTrue(board1.getGrid()[0][0]==1);
        assertTrue(board1.getGrid()[0][1]==1);
        assertTrue(board1.getGrid()[1][0]==1);
        assertTrue(board1.getGrid()[1][1]==1);
        

        board1.addPiece(piece2,5);

        for (int i = 0; i < 40; i++) {
            board1.moveLeft();
        }

        for (int i = 0; i < 40; i++) {
            board1.moveDown();
        }
        
        
        board1.addPiece(piece3,5);

        for (int i = 0; i < 18; i++) {
            board1.moveDown();
        }
        
        for (int i = 0; i < 10; i++) {
            board1.moveLeft();
        }
        
        assertTrue(board1.getCurrentCellX(0)==4); 
        assertTrue(board1.getCurrentCellX(1)==3);
        assertTrue(board1.getCurrentCellX(2)==2);
        assertTrue(board1.getCurrentCellX(3)==2);
        
    }

    //Test de eliminar líneas completas
    @Test 
    public void testDeleteLine() {
        Board board1 = new Board(10, 20);
        PieceBase piece1 = new PieceSquare();
        PieceBase piece2 = new PieceSquare();
        PieceBase piece3 = new PieceSquare();
        PieceBase piece4 = new PieceSquare();
        PieceBase piece5 = new PieceSquare();
        PieceBase piece6 = new PieceSquare();
        
        board1.addPiece(piece1,5);
        for (int i = 0; i < 5; i++) {
            board1.moveLeft();
        }
        
        for (int i = 0; i < 40; i++) {
            board1.moveDown();
        }

        board1.addPiece(piece2,5);
        for (int i = 0; i < 3; i++) {
            board1.moveLeft();
        }
        for (int i = 0; i < 40; i++) {
            board1.moveDown();
        }
        
        board1.addPiece(piece3,5);
        for (int i = 0; i < 1; i++) {
            board1.moveLeft();
        }
        for (int i = 0; i < 40; i++) {
            board1.moveDown();
        }
        
        board1.addPiece(piece4,5);
        for (int i = 0; i < 1; i++) {
            board1.moveRight();
        }
        for (int i = 0; i < 40; i++) {
            board1.moveDown();   
        }
        
        board1.addPiece(piece5,5);
        for (int i = 0; i < 3; i++) {
            board1.moveRight();
        }
        for (int i = 0; i < 40; i++) {
            board1.moveDown();
        }    
        assertTrue(board1.getGrid()[0][0]==0); 
        assertTrue(board1.getGrid()[1][0]==0);
        assertTrue(board1.getGrid()[2][0]==0);
        assertTrue(board1.getGrid()[3][0]==0);
        assertTrue(board1.getGrid()[4][0]==0);
        assertTrue(board1.getGrid()[5][0]==0);
        assertTrue(board1.getGrid()[6][0]==0);
        assertTrue(board1.getGrid()[7][0]==0); 
        assertTrue(board1.getGrid()[8][0]==0);
        assertTrue(board1.getGrid()[9][0]==0); 

        board1.addPiece(piece6,5); 
        for (int i = 0; i < 21; i++) {
            board1.moveDown();
        }
        
        assertTrue(board1.getGrid()[5][0]==1);
        assertTrue(board1.getGrid()[6][0]==1);

        assertTrue(board1.lineCount()==2);
    }
     
    //Test de verificación de que no se agrega una pieza cuando no hay espacio
    @Test
    public void testDontAdd(){
        Board board1 = new Board(10, 20);
        PieceBase piecees[] = new PieceBase[6];
        piecees[0] = new PieceStick();
        piecees[1] = new PieceStick();
        piecees[2] = new PieceStick();
        piecees[3] = new PieceStick();
        piecees[4] = new PieceStick();
        piecees[5] = new PieceStick();
        
        for (int i = 0; i < 6; i++) {
            board1.addPiece(piecees[i],5);
            for(int j = 0; j < 20; j++ ){
                board1.moveDown();
            }
        }
        assertTrue(board1.getGameState() == 3);
    }
}
