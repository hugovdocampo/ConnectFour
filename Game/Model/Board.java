package Model;

public class Board {

    private static final int WIDTH = 6;
    private static final int HEIGHT = 7;
    private final Colour[][] board;

    public Board() {
        this.board = new Colour[WIDTH][HEIGHT];
    }

    public Colour getColourAt(Coordinate coord) {
        if (coord.getX() < 0 || coord.getX() >= WIDTH || coord.getY() < 0 || coord.getY() >= HEIGHT) {
            return Colour.EMPTY;
        }
        return board[coord.getX()][coord.getY()];
    }

    public boolean dropToken(int column, Colour colour) {
        if (column < 0 || column >= HEIGHT) {
            return false;
        }

        for (int row = WIDTH - 1; row >= 0; row--) {
            if (board[row][column].equals(Colour.EMPTY)) {
                board[row][column] = colour;
            }
        }
        return true;
    }

    public boolean existWinner(){
        return true;
    }

    public boolean isCompleted(){
        return true;
    }

    public boolean checkWinner(Colour colour, Coordinate coordinate) {
        return true;
    }
}