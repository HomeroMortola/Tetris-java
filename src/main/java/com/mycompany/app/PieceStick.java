package com.mycompany.app;

public class PieceStick extends PieceBase {
    public PieceStick(int originX, int originY) {
        super(
            new Cell(originX, originY - 1),
            new Cell(originX, originY),
            new Cell(originX, originY + 1),
            new Cell(originX, originY + 2)
        );
    }
}
