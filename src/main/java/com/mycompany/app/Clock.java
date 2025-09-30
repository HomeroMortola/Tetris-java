package com.mycompany.app;

public class Clock {
    private int time;

    //Constructor de Clock
    public Clock() {
        setTime(0);
    }

    //Set para doble encapsulamiento
    public void setTime(int time) {
        this.time = time;
    }

    //Get para doble encapsulamiento
    public int getTime() {
        return time;
    }
    
    //Avanza el reloj un tick
    public int tick() {
        return time++;
    }
}
