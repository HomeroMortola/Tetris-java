package com.mycompany.app;

public class Tetris {
    public Clock clock1;
    public Board board1;

    private void setBoard1(Board board1) {
        this.board1 = board1;
    }
    private void setClock1(Clock clock1) {
        this.clock1 = clock1;
    }

    public Board getBoard() {
        return board1;
    }
    public Clock getClock() {
        return clock1;
    }  


    public void start() {
        setBoard1(new Board(10, 20,true));
        setClock1(new Clock());
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
