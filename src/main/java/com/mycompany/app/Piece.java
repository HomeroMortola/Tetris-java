package com.mycompany.app;

public class Piece {

    protected int[][] elementos = new int[4][4];
    
    public int[][] getElementos() {
        return elementos;
    }

    public int getElementos(int x, int y) {
        return this.elementos[x][y];
    }
        
        
}