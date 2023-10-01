package Model;


public enum Direction {
    HORIZONTAL_RIGHT(new Coordinate(1, 0)),
    HORIZONTAL_LEFT(new Coordinate(-1, 0)),
    VERTICAL_UP(new Coordinate(0, 1)),
    VERTICAL_DOWN(new Coordinate(0, -1)),
    DIAGONAL_ASCENDING_RIGHT(new Coordinate(1, 1)),
    DIAGONAL_ASCENDING_LEFT(new Coordinate(-1, 1)),
    DIAGONAL_DESCENDING_RIGHT(new Coordinate(1, -1)),
    DIAGONAL_DESCENDING_LEFT(new Coordinate(-1, -1));

    private final Coordinate coordinate;

    Direction(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }
}
