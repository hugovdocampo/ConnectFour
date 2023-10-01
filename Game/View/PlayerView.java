package View;

import Model.Game;

import java.util.Scanner;

public class PlayerView extends ConnectFourView {

    PlayerView(Game game) {
        super(game);
    }

    public void askColumn() {
        Scanner scanner = new Scanner(System.in);
        int column;
        do {
            MessageView.ASK_PLAYER_COLUMN.writeln();
            column = scanner.nextInt();
        } while (!this.game.isValidColumn(column));
        this.game.dropToken(column);
    }
}