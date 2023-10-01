package View;

import Model.Game;

import java.util.function.BooleanSupplier;

public class PlayView extends ConnectFourView {
    PlayView(Game game) {
        super(game);
    }

    public void play() {
        do {
            new PlayerView(this.game).askColumn();
            this.game.switchPlayersTurn();
            new BoardView().drawBoard(this.game);
        } while (!this.checkConnectFour() && !this.isBoardFull());
    }

    public boolean checkConnectFour() {
        return checkCondition(this.game::checkVictory, MessageView.WINNER::writeln);
    }

    public boolean isBoardFull() {
        return checkCondition(this.game::isBoardFull, MessageView.DRAW::writeln);
    }

    private boolean checkCondition(BooleanSupplier condition, Runnable action) {
        boolean result = condition.getAsBoolean();
        if (result) {
            action.run();
        }
        return result;
    }

}
