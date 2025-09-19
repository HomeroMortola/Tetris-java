package com.mycompany.app;

public abstract class PieceBase {

    private final Cell[] cells = new Cell[4];

    //Constructor de la pieza (4 Cells)
    public PieceBase(Cell cell0, Cell cell1, Cell cell2, Cell cell3) {
        setElementos(cell0, 0);
        setElementos(cell1, 1);
        setElementos(cell2, 2);
        setElementos(cell3, 3);
    }

    //Asigna una celda en la posición indicada, doble encapsulamiento
    public void setElementos(Cell cell, int i) {
        this.cells[i] = cell;
    }

    //Devuelve el arreglo de celdas, doble encapsulamiento
    public Cell[] getElementos() {
        return cells;
    }

    //Método privado para rotar las piezas (si se pone left, gira a la izquierda, si se deja vacío, a la derecha, pero para eso están
    //los métodos de más abajo).
    private void rotate(boolean left) {
        //Obtiene los valores del pivot de la pieza, que es la segunda celda del arreglo
        int centerX = cells[1].getX();
        int centerY = cells[1].getY();

        for (Cell cell : cells) {
            //Obtiene la posición de cada celda respecto al pivot
            int x = cell.getX() - centerX;
            int y = cell.getY() - centerY;

            //Variables para los nuevos valores de x e y (rotados)
            int newX, newY;
            if (left) {
                newX = -y;
                newY = x;
            } else {
                newX = y;
                newY = -x;
            }

            //Establece la nueva posición de la celda
            cell.setX(centerX + newX);
            cell.setY(centerY + newY);
        }
    }

    //Rota a la izquierda
    public void rotateLeft() {
        rotate(true);
    }

    //Rota a la derecha
    public void rotateRight() {
        rotate(false);
    }
}