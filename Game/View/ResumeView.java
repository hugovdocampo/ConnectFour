package View;

import Model.Game;

public class ResumeView extends ConnectFourView {

    ResumeView(Game game) {
        super(game);
    }

    public boolean playAgain() {
        YesNoDialog askToPlay = new YesNoDialog();
        askToPlay.read();
        if (askToPlay.isAffirmative()) {
            this.game.reset();
        }
        return askToPlay.isAffirmative();
    }
}
