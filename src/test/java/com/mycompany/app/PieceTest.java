package com.mycompany.app;

import org.junit.Test;

//import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

//import java.lang.reflect.Array;
//import java.util.Arrays;


public class PieceTest {
    public PieceTest() {
    }

    @Test
    public void testPieceExiste() {
        PieceBase p = new PieceSquare();
        assertNotNull(p);
    }

    @Test
    public void testPiece4Elementos() {
        PieceBase p = new PieceSquare();
        assertTrue(p.getCells().length == 4);
    }
    
    @Test
    public void testPieceSquer() {
        Constantes constantes = new Constantes();
        PieceBase p1 = new PieceSquare();
        Cell[] cels = p1.getCells();
        Cell[] esperado = constantes.getCubo();

        for (int i = 0; i < cels.length; i++) {
            assertEquals("x distinto en celda " + i, esperado[i].getX(), cels[i].getX());
            assertEquals("y distinto en celda " + i, esperado[i].getY(), cels[i].getY());
        }
    }
    @Test
    public void testPieceStick() {
        Constantes constantes = new Constantes();
        PieceBase p1 = new PieceStick();
        Cell[] cels = p1.getCells();
        Cell[] esperado = constantes.getStick();

        for (int i = 0; i < cels.length; i++) {
            assertEquals("x distinto en celda " + i, esperado[i].getX(), cels[i].getX());
            assertEquals("y distinto en celda " + i, esperado[i].getY(), cels[i].getY());
        }
    }
    @Test
    public void testPieceLR() {
        Constantes constantes = new Constantes();
        PieceBase p1 = new PieceLR();
        Cell[] cels = p1.getCells();
        Cell[] esperado = constantes.getLR();

        for (int i = 0; i < cels.length; i++) {
            assertEquals("x distinto en celda " + i, esperado[i].getX(), cels[i].getX());
            assertEquals("y distinto en celda " + i, esperado[i].getY(), cels[i].getY());
        }
    }
    @Test
    public void testPieceLL() {
        Constantes constantes = new Constantes();
        PieceBase p1 = new PieceLL();
        Cell[] cels = p1.getCells();
        Cell[] esperado = constantes.getLL();

        for (int i = 0; i < cels.length; i++) {
            assertEquals("x distinto en celda " + i, esperado[i].getX(), cels[i].getX());
            assertEquals("y distinto en celda " + i, esperado[i].getY(), cels[i].getY());
        }
    }
    @Test
    public void testPieceT() {
        Constantes constantes = new Constantes();
        PieceBase p1 = new PieceT();
        Cell[] cels = p1.getCells();
        Cell[] esperado = constantes.getT();

        for (int i = 0; i < cels.length; i++) {
            assertEquals("x distinto en celda " + i, esperado[i].getX(), cels[i].getX());
            assertEquals("y distinto en celda " + i, esperado[i].getY(), cels[i].getY());
        }
    }
    @Test
    public void testPieceDogR() {
        Constantes constantes = new Constantes();
        PieceBase p1 = new PieceDogR();
        Cell[] cels = p1.getCells();
        Cell[] esperado = constantes.getDogR();

        for (int i = 0; i < cels.length; i++) {
            assertEquals("x distinto en celda " + i, esperado[i].getX(), cels[i].getX());
            assertEquals("y distinto en celda " + i, esperado[i].getY(), cels[i].getY());
        }
    }
    @Test
    public void testPieceDogL() {
        Constantes constantes = new Constantes();
        PieceBase p1 = new PieceDogL();
        Cell[] cels = p1.getCells();
        Cell[] esperado = constantes.getDogL();

        for (int i = 0; i < cels.length; i++) {
            assertEquals("x distinto en celda " + i, esperado[i].getX(), cels[i].getX());
            assertEquals("y distinto en celda " + i, esperado[i].getY(), cels[i].getY());
        }
    }
    
}