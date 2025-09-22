package com.mycompany.app;

public class PieceT extends PieceBase{
    public PieceT(){
        super(
            new Cell(- 1, 0),
            new Cell(0, 0),
            new Cell(1, 0),
            new Cell(0, -1)
        );
    }
}
