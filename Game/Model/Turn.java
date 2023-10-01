package Model;

import java.util.stream.IntStream;

public class Turn {

    private static final int NUM_PLAYERS = 2;
    private int currentPlayer;
    private final Board board;

    private final Player[] players;

    public Turn(Board board) {
        this.currentPlayer = 0;
        this.players = new Player[NUM_PLAYERS];
        this.board = board;
        this.reset();
    }

    public void reset() {
        IntStream.range(0, NUM_PLAYERS)
                .forEach(i -> players[i] = new Player(Colour.values()[i % Colour.values().length], this.board));
    }

    public void changePlayer() {
        this.currentPlayer= (this.currentPlayer + 1) % NUM_PLAYERS;
    }

    public void dropToken(int column) {
        this.players[currentPlayer].dropToken(column);
    }

}