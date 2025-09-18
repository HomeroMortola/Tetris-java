package com.mycompany.app;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Array;
import java.util.Arrays;


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
        Constantes constantes = new Constantes();
        PieceBase p1 = new PieceSquare(0, 0);
        Cell[] cels = p1.getElementos();
        Cell[] esperado = constantes.getCubo();

        for (int i = 0; i < cels.length; i++) {
            assertEquals("x distinto en celda " + i, esperado[i].getX(), cels[i].getX());
            assertEquals("y distinto en celda " + i, esperado[i].getY(), cels[i].getY());
        }
    }
    @Test
    public void testPieceStick() {
        Constantes constantes = new Constantes();
        PieceBase p1 = new PieceStick(0, 0);
        Cell[] cels = p1.getElementos();
        Cell[] esperado = constantes.getStick();

        for (int i = 0; i < cels.length; i++) {
            assertEquals("x distinto en celda " + i, esperado[i].getX(), cels[i].getX());
            assertEquals("y distinto en celda " + i, esperado[i].getY(), cels[i].getY());
        }
    }
    @Test
    public void testPieceLR() {
        Constantes constantes = new Constantes();
        PieceBase p1 = new PieceLR(0, 0);
        Cell[] cels = p1.getElementos();
        Cell[] esperado = constantes.getLR();

        for (int i = 0; i < cels.length; i++) {
            assertEquals("x distinto en celda " + i, esperado[i].getX(), cels[i].getX());
            assertEquals("y distinto en celda " + i, esperado[i].getY(), cels[i].getY());
        }
    }
    @Test
    public void testPieceLL() {
        Constantes constantes = new Constantes();
        PieceBase p1 = new PieceLL(0, 0);
        Cell[] cels = p1.getElementos();
        Cell[] esperado = constantes.getLL();

        for (int i = 0; i < cels.length; i++) {
            assertEquals("x distinto en celda " + i, esperado[i].getX(), cels[i].getX());
            assertEquals("y distinto en celda " + i, esperado[i].getY(), cels[i].getY());
        }
    }
    @Test
    public void testPieceT() {
        Constantes constantes = new Constantes();
        PieceBase p1 = new PieceT(0, 0);
        Cell[] cels = p1.getElementos();
        Cell[] esperado = constantes.getT();

        for (int i = 0; i < cels.length; i++) {
            assertEquals("x distinto en celda " + i, esperado[i].getX(), cels[i].getX());
            assertEquals("y distinto en celda " + i, esperado[i].getY(), cels[i].getY());
        }
    }
    @Test
    public void testPieceDogR() {
        Constantes constantes = new Constantes();
        PieceBase p1 = new PieceDogR(0, 0);
        Cell[] cels = p1.getElementos();
        Cell[] esperado = constantes.getDogR();

        for (int i = 0; i < cels.length; i++) {
            assertEquals("x distinto en celda " + i, esperado[i].getX(), cels[i].getX());
            assertEquals("y distinto en celda " + i, esperado[i].getY(), cels[i].getY());
        }
    }
    @Test
    public void testPieceDogL() {
        Constantes constantes = new Constantes();
        PieceBase p1 = new PieceDogL(0, 0);
        Cell[] cels = p1.getElementos();
        Cell[] esperado = constantes.getDogL();

        for (int i = 0; i < cels.length; i++) {
            assertEquals("x distinto en celda " + i, esperado[i].getX(), cels[i].getX());
            assertEquals("y distinto en celda " + i, esperado[i].getY(), cels[i].getY());
        }
    }
    
}