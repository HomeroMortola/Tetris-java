package com.mycompany.app;

public abstract class Piece {

    protected Cell[] cells = new Cell [4];
    
    public Piece(Cell cell0, Cell cell1, Cell cell2, Cell cell3) {
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

   

    

        
        
}