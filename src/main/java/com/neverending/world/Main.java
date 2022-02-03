package com.neverending.world;

public class Main {
    public static void main(String[] args) {
        Board Aquiles = new Characters();
        Board Paris = new Characters();

        Aquiles.setPosition(5, 5);


        System.out.println("Position for x is: " + Aquiles.getPositionX() +
                ", Position for y is: " + Aquiles.getPositionY() );

        System.out.println("Position for x is: " + Paris.getPositionX() +
                ", Position for y is: " + Paris.getPositionY() );
    }
}
