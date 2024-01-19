package boardgame;

public class Piece {
    protected Position position;
    private Board board;
    
    public Piece(Board board) {
        this.board = board;
        position = null;
    }

    protected Board getBoard() {
        return board;
    }

    public Boolean[][] possibleMoves() {

    }

    public Boolean possibleMove(Position position) {

    }

    public Boolean isThereAnyPossibleMove() {

    }
}
