package com.neverending.world;

public class Board {
    int x;
    int y;
    /**
     * Constructor
     */
    ///////////////////methods/////////////////////////
    protected Board() {
        x = 0;
        y = 0;

    }
    /**
     * Setter and Getter for position
     */
    public void setPosition(int x, int y){
        this.x = x;
        this.y = y;

    }
    public int getPositionX(){
        return x;
    }
    public int getPositionY(){
        return y;
    }
    // hello_3
}

