package View;

import Model.Board;
import Model.Coordinate;
import Model.Game;

public class BoardView {
    public void drawBoard(Game game) {
        for (int i = Board.ROWS - 1; i >= 0; i--) {
            System.out.print("|");
            for (int j = 0; j < Board.COLUMNS; j++) {
                System.out.print(" ");
                new ColourView().write(game.getColour(new Coordinate(i, j)));
                System.out.print(" |");
            }
            System.out.println("\n" + "+---".repeat(Board.COLUMNS) + "+");
        }

        for (int i = 0; i < Board.COLUMNS; i++) {
            System.out.printf("  %d ", i);
        }
        System.out.println("\n" + "    ".repeat(Board.COLUMNS));
    }

}