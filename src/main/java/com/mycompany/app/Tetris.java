package com.mycompany.app;

public class Tetris {
    public Clock clock;
    public Board board;
    public int gameState; //1 = jugando, 2 = gano, 3 = perdio

    //Set para doble encapsulamiento
    private void setBoard(Board board) {
        this.board = board;
    }
    private void setClock(Clock clock) {
        this.clock = clock;
    }

    private void setGameState(int state) {
        this.gameState = state;
    }

    //Get para doble encapsulamiento
    public Board getBoard() {
        return board;
    }

    public Clock getClock() {
        return clock;
    }  

    public int getGameState() {
        return gameState;
    }

    public void start() {
        setBoard(new Board(10, 20,true));
        setClock(new Clock());
        getBoard().addRandomPiece();
        setGameState(1);
    }

    public void start(boolean loop) {
        setBoard(new Board(10, 20));
        setClock(new Clock());
        setGameState(1);
    }

    public int state(){
        return getGameState();
    }

    public void tick(){
        getClock().tick();
        if ( getBoard().getGameState() == 2 || getBoard().getGameState() == 3){
            setGameState(getBoard().getGameState());
            setBoard(new Board(10, 20));
        }
        if ((getClock().getTime() % 2)== 0)
        {
            getBoard().moveDown();
        }
        
    }

    public void moveLeft(){
        getBoard().moveLeft();
    }

    public void moveRight(){
        getBoard().moveRight();
    }

    public void rotateLeft(){
        getBoard().getCurrentPiece().rotateLeft();
    }
    public void rotateRight(){
        getBoard().getCurrentPiece().rotateRight();
    }
    public void addPiece(PieceBase piece, int x){
        getBoard().addPiece(piece, x);
        setGameState(getBoard().getGameState());
    }
}
