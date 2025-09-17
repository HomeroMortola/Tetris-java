package com.mycompany.app;

public class Cell {
    private int x;
    private int y;

    //Constructor de Cell
    public Cell(int x, int y) {
        setPosition(x, y);
    }

    //Set para doble encapsulamiento
    public void setPosition(int x, int y) {
        setX(x);
        setY(y);
    }

    public void setX(int value) {
        this.x = value;
    }

    public void setY(int value) {
        this.y = value;
    }

    //Get para doble encapsulamiento
    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}