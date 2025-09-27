package chess;

import java.util.*;

public class Piece {
    public int[2] position;
    public int color; //can be reduced to boolean but maybe i might make >2 player chess so having it be int allows that
    public boolean legalMove(int[] dest) {
        return false;
    }
    Piece(int[] position, int color) {
        //0 for black, 1 for white, else undefined
        this.color = color;

        //if i just set position = input position itd just do memory addresses or smth?? i think??
        //im bad at coding dont question it
        this.position[0] = position[0];
        this.position[1] = position[1];
    }
    public double distance(int[] dest) {
        return Math.sqrt(Math.pow((this.position[0] - dest[0]),2)+Math.pow((this.position[1] - dest[1]),2));
    }

    public boolean obstructed(int[] dest, Board curr) {
        return true;
    }
}

class Rook extends Piece {

}   

class Bishop extends Piece {

}

class King extends Piece {

}

class Queen extends Piece {

}

class Pawn extends Piece {

}

class Knight extends Piece {

}