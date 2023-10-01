import Model.Game;

import View.View;
import View.MessageView;

public class ConnectFour {
    private final View view;

    public ConnectFour() {
        Game game = new Game();
        this.view = new View(game);
    }

    public void play() {
        do {
            this.view.start();
            this.view.play();
        } while (this.view.playAgain());
        MessageView.GOODBYE.writeln();
    }

    public static void main(String[] args) {
        new ConnectFour().play();
    }

}