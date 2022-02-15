package com.neverending.world;

public class Board {
    int x;
    int y;
    int i;
    int n;
    int board_dimx;
    int board_dimy;
    String name;


    /**
     * Constructor
     */
    ///////////////////methods/////////////////////////
    protected Board(){
        x = 0;
        y = 0;

    }


    public void setBoardSize(int board_dimx, int board_dimy) {
       this.board_dimx = board_dimx;
       this.board_dimy = board_dimy;

    }



    Object [][] board = new Object[15][10];
    /**
     * Creator of the Board
     */
    public void board_creator(int board_dimx, int board_dimy, Board Aquilles, int Aqx, int Aqy,
                              Board Paris, int Pqx, int Pqy, Board Hector, int Hqx, int Hqy,
                              Board wall, int wqx, int wqy,Board corner_1, int c1qx, int c1qy,
                              Board corner_2, int c2qx, int c2qy,Board corner_3,
                              int c3qx, int c3qy, Board corner_4,int c4qx, int c4qy){

        //System.out.println("position: "+ Aqx + "and "+ Aqy);
        for(i=0;i<board_dimx;i++){

            for(n=0;n<board_dimy;n++){

                board[i][n] = "-";
            }

        }
        board[Aqx][Aqy]= Aquilles.name;
        board[Pqx][Pqy]= Paris.name;
        board[Hqx][Hqy]= Hector.name;
        board[wqx][wqy]= wall.name;
        board[c1qx][c1qy]= corner_1.name;
        board[c2qx][c2qy]= corner_2.name;
        board[c3qx][c3qy]= corner_3.name;
        board[c4qx][c4qy]= corner_4.name;
    }
    /**
     * to Move the Items and Characters
     */
    public void board_moving(Board item, int Iqx, int Iqy,
                             int wqx, int wqy, int c1qx, int c1qy,
                             int c2qx, int c2qy, int c3qx, int c3qy,
                             int c4qx, int c4qy, int mover){
        int Iqx_n;
        int Iqy_n;
        Iqx_n=0;
        Iqy_n=0;
        switch(mover){

            case 1:
                Iqx_n = Iqx;
                Iqy_n = Iqy + 1;
                break;
            case 2:
                Iqx_n = Iqx;
                Iqy_n = Iqy -1;
                break;
            case 3:
                Iqx_n = Iqx - 1;
                Iqy_n = Iqy;
                break;
            case 4:
                Iqx_n = Iqx + 1;
                Iqy_n = Iqy;
                break;
            default:
                System.out.println("Error");
                break;

        }
        System.out.println("Iqy_n: " + Iqy_n);
            board[Iqx][Iqy]= "-";
            if(Iqy_n<0){
                Iqy_n=9;
            }else if(Iqy_n>9){
                Iqy_n=0;
            }else if(Iqx_n>14){
                Iqx_n=0;
            }else if(Iqx_n<0){
                Iqx_n=14;
            }else if(Iqx_n==wqx && Iqy_n==wqy) {
                Iqx_n = Iqx;
                Iqy_n = Iqy;
            }else if(Iqx_n==c1qx && Iqy_n==c1qy) {
                Iqx_n = Iqx;
                Iqy_n = Iqy;
            }else if(Iqx_n==c2qx && Iqy_n==c2qy) {
                Iqx_n = Iqx;
                Iqy_n = Iqy;
            }else if(Iqx_n==c3qx && Iqy_n==c3qy) {
                Iqx_n = Iqx;
                Iqy_n = Iqy;
            }else if(Iqx_n==c4qx && Iqy_n==c4qy) {
                Iqx_n = Iqx;
                Iqy_n = Iqy;
            }
            System.out.println("Position for item: " + item.getPositionX() +
                    "," + item.getPositionY());

            item.setPosition(Iqx_n,Iqy_n);
            board[Iqx_n][Iqy_n]= item.name;

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
    /**
     * Move Character or Object
     */
    public void move(Board item, int mover){
        switch(mover){

            case 1:
                setPosition(item.getPositionX(), item.getPositionY() + 1);
                break;
            case 2:
                setPosition(item.getPositionX(), item.getPositionY() + -1);
                break;
            case 3:
                setPosition(item.getPositionX()-1, item.getPositionY());
                break;
            case 4:
                setPosition(item.getPositionX()+1, item.getPositionY());
                break;
            default:
                System.out.println("Error");
                break;

        }
    }
    /**
     * Distance between Characters or Items
     */
    public double distance(int x, int y, int a, int b){
        double d;

        d = Math.sqrt( Math.pow(x-a,2) +  Math.pow(y-b,2));

        return d;
    }
    public void setName(String name){

        this.name = name;
    }
    public String getName(){

        return name;
    }

    // hello_4
}

