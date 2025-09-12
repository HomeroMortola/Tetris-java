package com.mycompany.app;

public class PieceDogL extends Piece {
    public PieceDogL(int originX, int originY) {
        super(
            new Cell(originX, originY - 1),
            new Cell(originX, originY),
            new Cell(originX + 1, originY),
            new Cell(originX + 1, originY + 1)
        );
    }
    
}
