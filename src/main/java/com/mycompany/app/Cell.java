package com.mycompany.app;

public class Cell {
    protected int x;
    protected int y;

    //Constructor de Cell
    public Cell(int x, int y) {
        setCellPos(x, y);
    }

    //Set para doble encapsulamiento
    public void setCellPos(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //Get para doble encapsulamiento
    public int getCellX() {
        return x;
    }

    public int getCellY() {
        return y;
    }
}