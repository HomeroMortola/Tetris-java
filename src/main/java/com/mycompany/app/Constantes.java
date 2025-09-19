package com.mycompany.app;

public class Constantes {
    //Constantes de la pieza base
    private Cell[] cuboBase = 
    {
        new Cell(0, 0),
        new Cell(1, 0),
        new Cell(0, 1),
        new Cell(1, 1)
    };

    public Cell[] getCubo() {
        return cuboBase;
    }

    //Constantes de StickBase
    private static Cell[] stickBase = 
    {
        new Cell(0, -1),
        new Cell(0, 0),
        new Cell(0, 1),
        new Cell(0, 2)
    };

    public Cell[] getStick() {
        return stickBase;
    }

    //Constantes de LRBase
    private static Cell[] lLBace = 
    {
        new Cell(1, 0),
        new Cell(0, 0),
        new Cell(-1, 0),
        new Cell(-2, 1)
    };

    public Cell[] getLL() {
        return lLBace;
    }

    //Constantes de TBase
    private static Cell[] lRBase =
    {
        new Cell(-1, 0),
        new Cell(0, 0),
        new Cell(1, 0),
        new Cell(2, -1)
    };

    public Cell[] getLR() {
        return lRBase;
    }

    //Constantes de TBase
    private static Cell[] tBase =
    {
        new Cell(-1, 0),
        new Cell(0, 0),
        new Cell(1, 0),
        new Cell(0, -1)
    };

    public Cell[] getT() {
        return tBase;
    }

    //Constantes de DogLBase
    private static Cell[] dogLBase =
    {
        new Cell(0, -1),
        new Cell(0, 0),
        new Cell(1, 0),
        new Cell(1, 1)
    };

    public Cell[] getDogL() {
        return dogLBase;
    }

    //Constantes de DogRBase
    private static Cell[] dogRBase =
    {
        new Cell(1, 0),
        new Cell(0, 0),
        new Cell(-1, 0),
        new Cell(-1, -1)
    };

    public Cell[] getDogR() {
        return dogRBase;
    }
}
