package com.mycompany.app;

public class Clock {
    private int time;
    public Clock() {
        setTime(0);
    }
    public void setTime(int time) {
        this.time = time;
    }

    public int getTime() {
        return time;
    }
    public int tick() {
        return time++;
    }
}
