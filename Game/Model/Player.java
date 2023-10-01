package Model;

public class Player {
    private String name;
    private Colour gameColour;

    public Player(String name, Colour gamePiece) {
        this.name = name;
        this.gameColour = gamePiece;
    }

    public String getName() {
        return name;
    }

    public Colour getGamePiece() {
        return gameColour;
    }
}