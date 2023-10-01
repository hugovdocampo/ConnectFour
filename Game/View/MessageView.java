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
    ASK_PLAYER_NAME_1("Player 1, please enter your name: "),
    ASK_PLAYER_NAME_2("Player 2, please enter your name: "),
    ASK_PLAYER_PIECE("Please enter your game piece (X | O): "),
    ASK_PLAYER_COLUMN("Please enter a column number: "),
    INVALID_COLUMN("Invalid column. Please enter a number between 1 and 7."),
    COLUMN_FULL("Column full. Please enter another column."),
    WINNER("Congratulations! You won!"),
    INVALID_PIECE_SELECTION("Invalid piece selection. Please enter X or O."),
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
