package com.mycompany.app;

public class PieceT extends PieceBase{
    public PieceT(int originX, int originY){
        super(
            new Cell(originX - 1, originY),
            new Cell(originX, originY),
            new Cell(originX + 1, originY),
            new Cell(originX, originY-1)
        );
    }

    public void rotateLeft() {
        
        Cell[] cells = getElementos();
        int centerX = cells[1].getX();
        int centerY = cells[1].getY();

        for (Cell cell : cells) {
            int x = cell.getX() - centerX;
            int y = cell.getY() - centerY;

            
            int newX = -y;
            int newY = x;

            cell.setX(centerX + newX);
            cell.setY(centerY + newY);
        }
    }


    public void rotateRight() {
        Cell[] cells = getElementos();
        int centerX = cells[1].getX();
        int centerY = cells[1].getY();

        for (Cell cell : cells) {
            int x = cell.getX() - centerX;
            int y = cell.getY() - centerY;

            
            int newX = -y;
            int newY = x;

            cell.setX(centerX + newX);
            cell.setY(centerY + newY);
        }
        
    }
    
}
