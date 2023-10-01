package View;

public enum MessageView {

    START_MESSAGE(
            "================================================\n" +
                    "    ____ ___ _ _ _ _ _____ ____ _____ _ _   \n" +
                    " / ___/ _ \\| \\ | | \\ | | ____/ ___|_   _| | || |  \n" +
                    "| |  | | | |  \\| |  \\| |  _|| |     | |   | || |_ \n" +
                    "| |__| |_| | |\\  | |\\  | |__| |___  | |   |__   _|\n" +
                    "  \\____\\___/|_| \\_|_| \\_|_____\\____| |_|      |_| \n" +
                    "================================================"
    ),
    ASK_PLAYER_COLUMN("Please enter a column number: "),
    INVALID_COLUMN("The selected column is not valid. Please enter another column."),
    WINNER("Congratulations! You won!"),
    DRAW("It's a draw!"),
    PLAY_AGAIN("Do you want to play again (Y | N)"),
    GOODBYE("Thanks for playing! Goodbye!");

    private final String message;

    MessageView(String message) {
        this.message = message;
    }

    public void writeln() {
        System.out.println(this.message);
    }
}
