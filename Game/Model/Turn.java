package Model;

public class Turn {

    private static final int NUM_PLAYERS = 2;
    private int currentPlayer;
    private final Player[] players;

    public Turn(Player[] players) {
        this.currentPlayer = 0;
        this.players = players;

    }
    public Player change() {
        this.currentPlayer = (this.currentPlayer + 1) % NUM_PLAYERS;
        return players[currentPlayer];
    }
}