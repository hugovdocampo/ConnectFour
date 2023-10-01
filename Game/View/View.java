package View;

import Model.Game;

public class View extends ConnectFourView {
    private final StartView startView;
    private final PlayView playView;
    private final ResumeView resumeView;

    public View(Game game) {
        super(game);
        this.startView = new StartView(game);
        this.playView = new PlayView(game);
        this.resumeView = new ResumeView(game);
    }

    public void start() {
        this.startView.beginGame();
    }

    public void play() {
        this.playView.play();
    }

    public boolean playAgain() {
        return this.resumeView.playAgain();
    }

}
