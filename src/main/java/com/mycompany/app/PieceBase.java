package com.mycompany.app;

public abstract class PieceBase {

    private Cell[] cells = new Cell [4];
    
    //Constructor de la pieza (4 Cells)
    public PieceBase(Cell cell0, Cell cell1, Cell cell2, Cell cell3) {
        setElementos(cell0, 0);
        setElementos(cell1, 1);
        setElementos(cell2, 2);
        setElementos(cell3, 3);
    }
     
    public void setElementos(Cell _cell, int i) {
        this.cells[i] = _cell;
    }

    public Cell[] getElementos() {
        return cells;
    }
    
    public abstract void rotateLeft();

    public abstract void rotateRight();
    
}