package Model;

public class Coordinate {
    private final int x;
    private final int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    public Coordinate set(Coordinate other) {
        return new Coordinate(this.x + other.x, this.y + other.y);
    }

}
