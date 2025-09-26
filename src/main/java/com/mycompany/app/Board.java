package com.mycompany.app;
import java.util.List;
import java.util.ArrayList;

public class Board { 

    private List<PieceBase> pieces = new ArrayList<PieceBase>();
    private int width;
    private int height;
    private int grid[][];
    private PieceBase currentPice;
    private int lineasCompletadas;

    private int currentPiceY;
    private int currentPiceX;

    public Board(int width, int height) {
        setWidthHeight(width, height);
    }

    //Set para doble encapsulamiento
    public void setWidthHeight(int width, int height) {
        setWidth(width);
        setHeight(height);
        drawGrid();
    }

    private void setWidth(int width) {
        this.width = width;
    }

    private void setHeight(int height) {
        this.height = height;
    }

    private void setCurrentPiece(PieceBase piece){
        this.currentPice = piece;
    }

    private void setCurrentPieceX(int x){
        this.currentPiceX = x;
    }

    private void setCurrentPieceY(int y){
        this.currentPiceY = y;
    }

    private void setGrid(int[][] grid){
        this.grid = grid;
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

    public int getCurrentCellX(int i){
        return getCurrentPieceX() + getCurrentPiece().getCells()[i].getX();
    }

    public int getCurrentCellY(int i){
        return getCurrentPieceY() + getCurrentPiece().getCells()[i].getY();
    }

    public int[][] getFrid(){
        return this.grid;
    }

    //Método para añadir piezas al tablero (además de comprobar si se pueden añadir, caso de que se pueda, lo añade 
    //y posiciona en el centro arriba)
    public void addPiece(PieceBase piece){
        boolean canAdd = true;
        for (int x = 0; x < getWidth(); x++) {
            for (int y = 17; y < getHeight(); y++) {
                if (grid[x][y] == 1) {
                    canAdd = false;
                }
            }
        }
        if(canAdd)
        {
            this.pieces.add(piece);
            setCurrentPiece(piece);
            setCurrentPieceX(5);
            setCurrentPieceY(20);
        }
    }

    //Método para dibujar la cuadrícula del tablero
    private void drawGrid() {
        grid = new int[getWidth()][getHeight()+3];//+3 para que las piezas puedan entrar
        for (int x = 0; x < getWidth(); x++) {
            for (int y = 0; y < getHeight(); y++) {
                grid[x][y] = 0;
            }
        }
        setGrid(grid);
    }

    //Métodos para mover las piezas (comprobando si se pueden mover o no)
    public void moveDown(){
    boolean canMove = true; 
        for (int i = 0; i < 4; i++) {
            if (getCurrentCellY(i) == 0) {
                canMove = false;
                break; 
            }
        }
        if (canMove) {
            for (int i = 0; i < 4; i++) {
                if (getFrid()[getCurrentCellX(i)][getCurrentCellY(i) - 1] == 1) {
                canMove = false;
                break; 
                }
            }
        }
        
        if (canMove) { 
            setCurrentPieceY(getCurrentPieceY() - 1);
        } else {
            for (int i = 0; i < 4; i++) {
                grid[getCurrentCellX(i)][getCurrentCellY(i)] = 1;
                setGrid(grid);
                
            }
            EliminarLinea();
        }
    }

    public void moveLeft(){
        boolean canMove = true; 
        for (int i = 0; i < 4; i++) {
            if (getCurrentCellX(i) == 0){
                canMove = false;
                break; 
            }
        }
        if (canMove) {
            for (int i = 0; i < 4; i++) {
                if (getFrid()[getCurrentCellX(i) - 1][getCurrentCellY(i)] == 1) {
                canMove = false;
                break; 
                }
            }
        }
        
        if (canMove) { 
            setCurrentPieceX(getCurrentPieceX() - 1);
        }
    }

    public void moveRight(){
        boolean canMove = true; 
        for (int i = 0; i < 4; i++) {
            if (getCurrentCellX(i) == getWidth() - 1){
                canMove = false;
                break; 
            }
        }
        if (canMove) {
            for (int i = 0; i < 4; i++) {
                if (getFrid()[getCurrentCellX(i) + 1][getCurrentCellY(i)] == 1) {
                canMove = false;
                break; 
                }
            }
        }
        
        if (canMove) { 
            setCurrentPieceX(getCurrentPieceX() + 1);
        }
    }

    //Método para eliminar líneas completas y desplazar las demás hacia abajo
    public void EliminarLinea(){
        for(int y = 0; y < getHeight(); y++){
            boolean lineaCompleta = true;
            for(int x = 0; x < getWidth(); x++){
                if(getFrid()[x][y] == 0){
                    lineaCompleta = false;
                    break;
                }
            }
            if(lineaCompleta){
                for(int RemplazarY = y; RemplazarY < getHeight() - 1; RemplazarY++){
                    for(int x = 0; x < getWidth(); x++){
                        grid[x][RemplazarY] = grid[x][RemplazarY + 1];
                    }
                }
                for(int x = 0; x < getWidth(); x++){
                    grid[x][getHeight() - 1] = 0;
                }
                y--; // Re-evaluar la misma línea después de eliminarla
                lineasCompletadas++;
            }
        }
    }

    //Método para obtener la cantidad de líneas eliminadas
    public int lineCount(){
        return lineasCompletadas;
    }



    


    //INCOMPLETO
    public void tick(){
        
        moveDown();
        
    }
    

    
    

}
