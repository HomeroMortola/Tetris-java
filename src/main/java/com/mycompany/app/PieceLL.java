package com.mycompany.app;

public class PieceLL extends PieceBase {
    public PieceLL(int originX, int originY) {
        super(
            new Cell(originX + 1, originY),
            new Cell(originX, originY),
            new Cell(originX - 1, originY),
            new Cell(originX - 2, originY + 1)
        );
    }
    
}
