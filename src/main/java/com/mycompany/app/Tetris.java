package com.mycompany.app;

public class Tetris {
    public Clock clock;
    public Board board;

    private void setBoard(Board board) {
        this.board = board;
    }
    private void setClock(Clock clock) {
        this.clock = clock;
    }

    public Board getBoard() {
        return board;
    }
    public Clock getClock() {
        return clock;
    }  


    public void start() {
        setBoard(new Board(10, 20,true));
        setClock(new Clock());
    }
    
    //INCOMPLETO
    public void state(){
        for(int i=0; i<4 ; i++){
            getBoard().getCurrentCellX(i);
            getBoard().getCurrentCellY(i);
        }
    }

    public void tick(){
        getClock().tick();
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
}
