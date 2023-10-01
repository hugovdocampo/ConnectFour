package Model;

public enum Direction {
    HORIZONTAL(new Coordinate(1, 0)),
    VERTICAL(new Coordinate(0, 1)),
    DIAGONAL_ASCENDING(new Coordinate(1, 1)),
    DIAGONAL_DESCENDING(new Coordinate(1, -1));

    private final Coordinate coordinate;

    Direction(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }
}
