package com.neverending.world;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i;
        int n;
        int m;
        int l;
        double random;
        int board_dimx;
        int board_dimy;
        board_dimx=15;
        board_dimy=10;

        Board element = new Board();

        Board Aquilles = new Characters();

        Aquilles.setName("A");

        /****** Obstacles **************/
        Board wall = new Obstacles();
        Board corner_1 = new Obstacles();
        Board corner_2 = new Obstacles();
        Board corner_3 = new Obstacles();
        Board corner_4 = new Obstacles();


        wall.setName("o");
        wall.setPosition(7, 4);

        corner_1.setName("^");
        corner_1.setPosition(7, 3);

        corner_2.setName("<");
        corner_2.setPosition(6, 4);

        corner_3.setName(">");
        corner_3.setPosition(8, 4);

        corner_4.setName("v");
        corner_4.setPosition(7, 5);
        /**********************************/
        Board Paris = new Characters();
        Paris.setName("P");

        Board Hector = new Characters();
        Hector.setName("H");

        Board Helen_Crown = new Treasure();

        Aquilles.setPosition(1, 8);

        Paris.setPosition(13, 1 );

        Hector.setPosition(2, 1 );

        System.out.println("Position for x is: " + Aquilles.getPositionX() +
                ", Position for y is: " + Aquilles.getPositionY() );

        System.out.println("Position for x is: " + Paris.getPositionX() +
                ", Position for y is: " + Paris.getPositionY() );
        System.out.println("Distance between Aquiles and the treasure is: " +
                Helen_Crown.distance(Aquilles.getPositionX(),Aquilles.getPositionY(),
                        Helen_Crown.getPositionX(),Helen_Crown.getPositionY()));


        System.out.println("The new position for Aquiles is: " + Aquilles.getPositionX() + ", "
                + Aquilles.getPositionY());

        element.board_creator(board_dimx, board_dimy, Aquilles,Aquilles.getPositionX(),
                Aquilles.getPositionY(),Paris,Paris.getPositionX(),Paris.getPositionY(),
                Hector,Hector.getPositionX(),Hector.getPositionY(),
                wall,wall.getPositionX(), wall.getPositionY(),
                corner_1,corner_1.getPositionX(),corner_1.getPositionY(),
                corner_2,corner_2.getPositionX(), corner_2.getPositionY(),
                corner_3,corner_3.getPositionX(), corner_3.getPositionY(),
                corner_4,corner_4.getPositionX(), corner_4.getPositionY());

        System.out.println("here we are");

        for(n=0;n<board_dimy;n++){
            System.out.println(" ");
            for(i=0;i<board_dimx;i++){

                System.out.print(" " + element.board[i][n] + " ");
            }
        }
        System.out.println(" ");
        do {
            System.out.println("move!!! ");

            Scanner sc = new Scanner(System.in);

            String mover = sc.nextLine();

            if (Objects.equals(mover, "s")) {
                m = 1;
            } else if (Objects.equals(mover, "w")) {
                m = 2;
            } else if (Objects.equals(mover, "a")) {
                m = 3;
            } else if (Objects.equals(mover, "d")) {
                m = 4;
            } else {
                m = 5;
            }

            element.board_moving(Aquilles, Aquilles.getPositionX(), Aquilles.getPositionY(),
                     wall.getPositionX(), wall.getPositionY(),corner_1.getPositionX(), corner_1.getPositionY(),
                    corner_2.getPositionX(), corner_2.getPositionY(),corner_3.getPositionX(), corner_3.getPositionY(),
                    corner_4.getPositionX(), corner_4.getPositionY(), m);

            //Aquilles.move(Aquilles, m);

            random = Math.random();

            if (random<=0.25) {
                m = 1;
            } else if (random>0.25 && random <=0.5) {
                m = 2;
            } else if (random>0.5 && random <=0.75) {
                m = 3;
            } else if (random>0.75 && random <=1) {
                m = 4;
            } else {
                m = 5;
            }

            element.board_moving(Paris, Paris.getPositionX(), Paris.getPositionY()
                    , wall.getPositionX(), wall.getPositionY(),corner_1.getPositionX(), corner_1.getPositionY(),
                    corner_2.getPositionX(), corner_2.getPositionY(),corner_3.getPositionX(), corner_3.getPositionY(),
                    corner_4.getPositionX(), corner_4.getPositionY(), m);

            element.board_moving(Hector, Hector.getPositionX(), Hector.getPositionY()
                    , wall.getPositionX(), wall.getPositionY(),corner_1.getPositionX(), corner_1.getPositionY(),
                    corner_2.getPositionX(), corner_2.getPositionY(),corner_3.getPositionX(), corner_3.getPositionY(),
                    corner_4.getPositionX(), corner_4.getPositionY(), m);
            //Paris.move(Paris, m);

            for(n=0;n<board_dimy;n++){
                System.out.println(" ");
                for(i=0;i<board_dimx;i++){

                    System.out.print(" " + element.board[i][n] + " ");
                }

            }
            System.out.println(" ");
            System.out.println("Position for Aquilles: " + Aquilles.getPositionX() +
                    "," + Aquilles.getPositionY());
        }while (m>0 && m<5);



    }
}
