package com.mycompany.app;

public abstract class Piece {

    private Cell[] cells = new Cell [4];
    
    //Constructor de la pieza (4 Cells)
    public Piece(Cell cell0, Cell cell1, Cell cell2, Cell cell3) {
        setElementos(cell0, -1);
        setElementos(cell1, 0);
        setElementos(cell2, 1);
        setElementos(cell3, 2);
    }
     
    public void setElementos(Cell _cell, int i) {
        this.cells[i] = _cell;
    }

    public Cell[] getElementos() {
        return cells;
    }

   

    

        
        
}