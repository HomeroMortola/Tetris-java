package com.mycompany.app;

public class PieceSquare extends Piece {
    public PieceSquare(int originX, int originY) {
        super(
            new Cell(originX, originY),
            new Cell(originX + 1, originY),
            new Cell(originX, originY + 1),
            new Cell(originX + 1, originY + 1)
        );
    }
}
