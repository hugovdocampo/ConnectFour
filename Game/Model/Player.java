package Model;

public class Player {
    private final Colour gameColour;
    private final Board board;

    public Player(Colour gamePiece, Board board) {
        this.gameColour = gamePiece;
        this.board = board;
    }

    public void dropToken(int column) {
        this.board.dropToken(column, this.gameColour);
    }
}