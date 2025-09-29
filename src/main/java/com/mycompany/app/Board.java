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
    private int gameState; //1 = jugando, 2 = gano, 3 = perdio
    private boolean loop;

    public Board(int width, int height) {
        setWidthHeight(width, height);
        setGameState(1);
        setLoop(false);
    }
    
    public Board(int width, int height, boolean loop) {
        setWidthHeight(width, height);
        setGameState(1);
        setLoop(loop);
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

    private void setGameState(int state){
        this.gameState = state;
    }

    private void setLoop(boolean loop){
        this.loop = loop;
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

    public int[][] getGrid(){
        return this.grid;
    }

    public int getGameState(){
        return gameState;
    }


    //Método para añadir piezas al tablero (además de comprobar si se pueden añadir, caso de que se pueda, lo añade 
    //y posiciona en el centro arriba)
    public void addPiece(PieceBase piece, int columna){
        boolean canAdd = true;
        for (int x = 0; x < getWidth(); x++) {
            for (int y = 15; y < getHeight(); y++) {
                if (grid[x][y] == 1) {
                    canAdd = false;
                }
            }
        }
        if(canAdd)
        {
            this.pieces.add(piece);
            setCurrentPiece(piece);
            setCurrentPieceX(columna);
            setCurrentPieceY(20);
            
        }else
        {
            setGameState(3);
        }
        
    }

    public void addRandomPiece(){
        int columna = (int)(Math.random() * 6) + 2;
        PieceBase piece = null;
        int opcion = (int)(Math.random() * 7) + 1;
        switch (opcion) {
            case 1: piece = new PieceDogL(); break;
            case 2: piece = new PieceDogR(); break;
            case 3: piece = new PieceLL(); break;
            case 4: piece = new PieceLR(); break;
            case 5: piece = new PieceSquare(); break;
            case 6: piece = new PieceStick(); break;
            case 7: piece = new PieceT(); break;
        }
        addPiece(piece, columna);

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
        if (getCurrentPiece() != null) {  
            for (int i = 0; i < 4; i++) {
                if (getCurrentCellY(i) == 0) {
                    canMove = false;
                    break; 
                }
            }
            if (canMove) {
                for (int i = 0; i < 4; i++) {
                    if (getGrid()[getCurrentCellX(i)][getCurrentCellY(i) - 1] == 1) {
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
                setCurrentPiece(null);
                if(loop)
                {
                    addRandomPiece();
                }
            }
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
                if (getGrid()[getCurrentCellX(i) - 1][getCurrentCellY(i)] == 1) {
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
                if (getGrid()[getCurrentCellX(i) + 1][getCurrentCellY(i)] == 1) {
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
                if(getGrid()[x][y] == 0){
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
                if (lineasCompletadas >= 5){
                    setGameState(2);
                }
            }
        }
    }

    //Método para obtener la cantidad de líneas eliminadas
    public int lineCount(){
        return lineasCompletadas;
    }
    
    //Método para COMPROBAR (no rotar) si una pieza se puede rotar (a la izquierda o a la derecha)
    //Usé una especie de "simulación" de la rotación para comprobar si se puede o no
    public boolean canRotate(PieceBase piece, boolean left) {
        Cell[] cells = piece.getCells();
        int centerX = cells[1].getX();
        int centerY = cells[1].getY();

        for (Cell cell : cells) {
            int x = cell.getX() - centerX;
            int y = cell.getY() - centerY;

            int newX = left ? -y : y;
            int newY = left ? x : -x;

            int boardX = getCurrentPieceX() + centerX + newX;
            int boardY = getCurrentPieceY() + centerY + newY;

            // Verifica límites
            if (boardX < 0 || boardX >= getWidth() || boardY < 0 || boardY >= getHeight()) {
                return false;
            }
            // Verifica colisión con otras piezas
            if (getGrid()[boardX][boardY] == 1) {
                return false;
            }
        }
        return true;
    }
    
    //Métodos para rotar la pieza actual (una vez comprobado)
    public void rotateCurrentPieceLeft() {
        if (canRotate(getCurrentPiece(), true)) {
            getCurrentPiece().rotateLeft();
        }
    }

    public void rotateCurrentPieceRight() {
        if (canRotate(getCurrentPiece(), false)) {
            getCurrentPiece().rotateRight();
        }
    }
}
