package com.mycompany.app;

public class PieceDogR extends PieceBase {
    public PieceDogR() {
        super(
            new Cell(1, 0),
            new Cell(0, 0),
            new Cell(- 1, 0),
            new Cell(- 1, - 1)
        );
    }
}
