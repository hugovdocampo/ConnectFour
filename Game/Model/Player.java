package Model;

public class Player {
    private Colour gameColour;
    private Board board;

    public Player(Colour gamePiece, Board board) {
        this.gameColour = gamePiece;
        this.board = board;
    }

    public Colour getGamePiece() {
        return gameColour;
    }

    public void dropToken(int column) {
        this.board.dropToken(column, this.gameColour);
    }
}