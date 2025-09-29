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
    public void testCaidaLibreStick() {
        Board board1 = new Board(10, 20);
        PieceBase piece1 = new PieceStick();
        boolean todosMayorIgualCero = true;
        boolean alMenosUnoCero = false;

        board1.addPiece(piece1,5);
        for (int i = 0; i < 40; i++) {
            board1.moveDown();
        }
        for (int i = 0; i < 4; i++) {
            if (board1.getCurrentCellY(i) < 0) {
                todosMayorIgualCero = false;
            }
            if (board1.getCurrentCellY(i) == 0) {
                alMenosUnoCero = true;
                break;
            }
        }
        
        assertTrue(todosMayorIgualCero);
        assertTrue(alMenosUnoCero);
    }
    @Test
    public void testCaidaLibreSquare() {
        Board board1 = new Board(10, 20);
        PieceBase piece1 = new PieceSquare();
        boolean todosMayorIgualCero = true;
        boolean alMenosUnoCero = false;

        board1.addPiece(piece1,5);
        for (int i = 0; i < 40; i++) {
            board1.moveDown();
        }

        for (int i = 0; i < 4; i++) {
            if (board1.getCurrentCellY(i) < 0) {
                todosMayorIgualCero = false;
            }
            if (board1.getCurrentCellY(i) == 0) {
                alMenosUnoCero = true;
                break;
            }          
        }
        assertTrue(todosMayorIgualCero);
        assertTrue(alMenosUnoCero);
    }

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
        assertTrue(board1.getCurrentCellY(0)==2);
        assertTrue(board1.getCurrentCellY(1)==3);
        assertTrue(board1.getCurrentCellY(2)==4);
        assertTrue(board1.getCurrentCellY(3)==5);         
    }

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
        assertTrue(board1.getCurrentCellY(0)==2);
        assertTrue(board1.getCurrentCellY(1)==2);
        assertTrue(board1.getCurrentCellY(2)==2);
        assertTrue(board1.getCurrentCellY(3)==3);         
    }

    @Test
    public void testMovimientoHorizontal() {
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

        assertTrue(board1.getCurrentCellX(0)==0); 
        assertTrue(board1.getCurrentCellX(1)==1);
        assertTrue(board1.getCurrentCellX(2)==0);
        assertTrue(board1.getCurrentCellX(3)==1);

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


    @Test 
    public void testEliminarLinea() {
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
     
    @Test
    public void TestnoAgrega(){
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
