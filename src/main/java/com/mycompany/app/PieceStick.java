package com.mycompany.app;

public class PieceStick extends PieceBase {
    public PieceStick() {
        super(
            new Cell(0, - 1),
            new Cell(0, 0),
            new Cell(0, 1),
            new Cell(0, 2)
        );
    }
}
