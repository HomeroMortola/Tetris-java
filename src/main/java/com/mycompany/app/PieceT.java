package com.mycompany.app;

public class PieceT extends PieceBase{
    public PieceT(int originX, int originY){
        super(
            new Cell(originX- 1, originY),
            new Cell(originX, originY),
            new Cell(originX + 1, originY),
            new Cell(originX, originY-1)
            
           
        );
    }
    
}
