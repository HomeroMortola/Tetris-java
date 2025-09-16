package com.mycompany.app;

public class PieceDogR extends PieceBase {
    public PieceDogR(int originX, int originY) {
        super(
            new Cell(originX + 1, originY),
            new Cell(originX, originY),
            new Cell(originX - 1, originY),
            new Cell(originX - 1, originY - 1)
        );
    }
}
