package chess;


public class Board {
    public Pieces[8][8] state;
    public const int size = 8;
    Board() {//i just hard coded all of the positions bc im very bad at coding
        //pawns
        for (int i = 0; i < 8; i++) {
            state[1][i] = new Pawn({1,i},1);
            state[6][i] = new Pawn({6,i},0);
        }
        //knights
        state[0][1] = new Knight({0,1},1);
        state[0][6] = new Knight({0,6},1);
        state[7][1] = new Knight({7,1},0);
        state[7][6] = new Knight({7,6},0);
        //bishops
        state[0][2] = new Bishop({0,2},1);
        state[0][5] = new Bishop({0,5},1);
        state[7][2] = new Bishop({7,2},0);
        state[7][5] = new Bishop({7,5},0);
        //rooks
        state[0][0] = new Rook({0,0},1);
        state[0][7] = new Rook({0,7},1);
        state[7][7] = new Rook({7,7},0);
        state[7][0] = new Rook({7,0},0);
        //kings
        state[0][4] = new King({0,4},1);
        state[7][4] = new King({7,4},0);
        //queens
        state[0][3] = new Queen({0,3},1);
        state[7][3] = new Queen({7,3},0);
    }
}