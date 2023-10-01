package View;

import Model.Game;

public class StartView extends ConnectFourView {
    public StartView(Game game) {
        super(game);
    }

    public void beginGame() {
        MessageView.START_MESSAGE.writeln();
        new BoardView().drawBoard(this.game);
    }
}