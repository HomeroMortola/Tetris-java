package com.mycompany.app;
import java.util.List;
import java.util.ArrayList;

public class Board { 

    private List<PieceBase> pieces = new ArrayList<PieceBase>();
    private int width;
    private int height;
    private int board[][];
    private PieceBase currentPice;

    private int currentPiceY;
    private int currentPiceX;

    public Board(int width, int height) {
        setWidthHeight(width, height);
    }

    //Set para doble encapsulamiento
    public void setWidthHeight(int width, int height) {
        setWidth(width);
        setHeight(height);
        drawBoard();
    }

    private void setWidth(int width) {
        this.width = width;
    }

    private void setHeight(int height) {
        this.height = height;
    }

    private void drawBoard() {
        this.board = new int[getWidth()][getHeight()];
        for (int x = 0; x < getWidth(); x++) {
            for (int y = 0; y < getHeight(); y++) {
                this.board[x][y] = 0;
            }
        }
    }

    public void addPiece(PieceBase piece){
        this.pieces.add(piece);
        setCurrentPiece(piece);
        setCurrentPieceX(5);
        setCurrentPieceY(20);
    }

    private void setCurrentPiece(PieceBase piece){
        this.currentPice = piece;
    }

    public void setCurrentPieceX(int x){
        this.currentPiceX = x;
    }

    public void setCurrentPieceY(int y){
        this.currentPiceY = y;
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

    public int getCurrentPieceX(){
        return this.currentPiceX;
    }

    public int getCurrentPieceY(){
        return this.currentPiceY;
    }

    public int getCellX(int i){
        return getCurrentPieceX() + getCurrentPiece().getCells()[i].getX();
    }

    public int getCellY(int i){
        return getCurrentPieceY() + getCurrentPiece().getCells()[i].getY();
    }

    public void moveDown(){
    boolean canMove = true; 
        for (int i = 0; i < 4; i++) {
            if (getCellY(i) == 0 || board[getCellX(i)][getCellY(i) - 1] == 1) {
                canMove = false;
                break; 
            }
        }
        
        if (canMove) { 
            setCurrentPieceY(getCurrentPieceY() - 1);
        } else {
            for (int i = 0; i < 4; i++) {
                board[getCellX(i)][getCellY(i)] = 1;
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
