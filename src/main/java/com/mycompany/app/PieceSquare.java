package com.mycompany.app;

public class PieceSquare extends PieceBase {
    public PieceSquare() {
        super(
            new Cell(0, 0),
            new Cell(1, 0),
            new Cell(0, 1),
            new Cell(1, 1)
        );
    }
    
    @Override
    public void rotateLeft() {
        // No rotation needed for square piece
    }
}
