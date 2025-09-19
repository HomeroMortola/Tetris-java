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


    private static Cell[] stickBase = 
    {
        new Cell(0, -1),
        new Cell(0, 0),
        new Cell(0, 1),
        new Cell(0, 2)
    };

    public static Cell[] getStick() {
        return stickBase;
    }


    private static Cell[] lLBace = 
    {
        new Cell(1, 0),
        new Cell(0, 0),
        new Cell(-1, 0),
        new Cell(-2, 1)
    };

    public static Cell[] getLL() {
        return lLBace;
    }


    private static Cell[] lRBase =
    {
        new Cell(-1, 0),
        new Cell(0, 0),
        new Cell(1, 0),
        new Cell(2, -1)
    };

    public static Cell[] getLR() {
        return lRBase;
    }


    private static Cell[] tBase =
    {
        new Cell(-1, 0),
        new Cell(0, 0),
        new Cell(1, 0),
        new Cell(0, -1)
    };

    public static Cell[] getT() {
        return tBase;
    }


    private static Cell[] dogLBase =
    {
        new Cell(0, -1),
        new Cell(0, 0),
        new Cell(1, 0),
        new Cell(1, 1)
    };

    public static Cell[] getDogL() {
        return dogLBase;
    }

    private static Cell[] dogRBase =
    {
        new Cell(1, 0),
        new Cell(0, 0),
        new Cell(-1, 0),
        new Cell(-1, -1)
    };

    public static Cell[] getDogR() {
        return dogRBase;
    }
    

}
