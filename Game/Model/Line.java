package Model;

public class Line {
    private static final int REQUIRED_IN_A_ROW = 4;

    public boolean hasFourInARow(Board board, Coordinate startingCoord, Direction direction) {
        Colour currentColour = board.getColourAt(startingCoord);
        Coordinate currentCoord = startingCoord;

        for (int i = 0; i < REQUIRED_IN_A_ROW; i++) {
            Colour colourAtCoord = board.getColourAt(currentCoord);

            if (!colourAtCoord.equals(currentColour)) {
                return false;
            }

            currentCoord = currentCoord.set(direction.getCoordinate());
        }
        return true;
    }
}
