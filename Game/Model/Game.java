package Model;

public class Game {

    private final Board board;
    private final Turn turn;

    public Game() {
        this.board = new Board();
        this.turn = new Turn(this.board);
    }

    public boolean checkVictory() {
        return this.board.checkVictory();
    }

    public boolean isBoardFull() {
        return this.board.isBoardFull();
    }

    public Colour getColour(Coordinate coordinate) {
        return this.board.getColourAt(coordinate);
    }

    public boolean isValidColumn(int column) {
        return this.board.isValidColumn(column);
    }

    public void dropToken(int column) {
        this.turn.dropToken(column);
    }

    public void switchPlayersTurn() {
        this.turn.changePlayer();
    }

    public void reset() {
        turn.reset();
        board.initialize();
    }
}
