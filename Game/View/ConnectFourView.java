package View;

import Model.Game;

abstract class ConnectFourView {
    protected Game game;

    ConnectFourView(Game game) {
        this.game = game;
    }
}