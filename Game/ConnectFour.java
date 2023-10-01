import Model.Board;
import Model.Game;

public class ConnectFour {
    private Game game;

    public ConnectFour() {

    }


    public void play() {
        do {
            game = new Game();
            game.play();
        } while ()
    }


    public static void main(String[] args) {
        ConnectFour conecta4 = new ConnectFour();
        conecta4.play();
    }
}