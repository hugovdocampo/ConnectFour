package Model;

public class Board {

    public static final int ROWS = 6;
    public static final int COLUMNS = 7;
    private final Colour[][] board;
    private Coordinate lastCoordinate;

    public Board() {
        this.board = new Colour[ROWS][COLUMNS];
        this.initialize();
    }

    public void initialize() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                board[i][j] = Colour.EMPTY;
            }
        }
    }

    public Colour getColourAt(Coordinate coord) {
        return board[coord.getX()][coord.getY()];
    }

    public void dropToken(int column, Colour colour) {
        int row = 0;
        boolean tokenDropped = false;

        do {
            if (board[row][column].equals(Colour.EMPTY)) {
                board[row][column] = colour;
                lastCoordinate = new Coordinate(row, column);
                tokenDropped = true;
            }
            row++;
        } while (!tokenDropped);
    }


    public boolean checkVictory() {
        Line lineChecker = new Line();
        for (Direction direction : Direction.values()) {
            if (lineChecker.hasFourInARow(this, lastCoordinate, direction)) {
                return true;
            }
        }
        return false;
    }

    public boolean isValidColumn(int column) {
        return column >= 0 && column < COLUMNS && board[ROWS - 1][column].equals(Colour.EMPTY);
    }

    public boolean isBoardFull() {
        for (int column = 0; column < COLUMNS; column++) {
            if (board[ROWS - 1][column].equals(Colour.EMPTY)) {
                return false;
            }
        }
        return true;
    }

    public boolean isWithinBounds(Coordinate coord) {
        return coord.getX() >= 0 && coord.getX() < ROWS &&
                coord.getY() >= 0 && coord.getY() < COLUMNS;
    }

}