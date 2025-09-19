package com.mycompany.app;
import java.util.List;
import java.util.ArrayList;

public class Board { 

    private List<PieceBase> pieces = new ArrayList<PieceBase>();
    private int width;
    private int height;
    private PieceBase currentPice;


    

    public Board(int width, int height) {
        setWidthHeight(width, height);
    }

    //Set para doble encapsulamiento
    public void setWidthHeight(int width, int height) {
        setWidth(width);
        setHeight(height);
    }

    private void setWidth(int width) {
        this.width = width;
    }

    private void setHeight(int height) {
        this.height = height;
    }

    public void addPiece(PieceBase piece){
        this.pieces.add(piece);
        setCurrentPiece(piece);
    }

    private void setCurrentPiece(PieceBase piece){
        this.currentPice = piece;
    }


    //Get para doble enc
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public List<PieceBase> getPieces() {
        return pieces;
    }
    
    public PieceBase getCurrentPiece(){
        return this.currentPice;
    }

    public void moveDown(){
    boolean canMove = true; 
        for (int i = 0; i < 4; i++) {
            if (getCurrentPiece().getElementos()[i].getY() == 0) {
                canMove = false;
                break; 
            }
            //añadir colicion luego aqui
        }
        
        if (canMove) { 
            for (int i = 0; i < 4; i++) {
                getCurrentPiece().getElementos()[i].setY(getCurrentPiece().getElementos()[i].getY() - 1);
            }
        }
    }
    


    //INCOMPLETO
    public void tick(){
        
        moveDown();
        
    }
    

    //INCOMPLETO
    public void lineConunt(){
    }






    

    
}
