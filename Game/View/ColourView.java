package View;

import Model.Colour;


public class ColourView {

    private static final String[] COLOUR_REPRESENTATIONS = {
            "\u001B[31m●\u001B[0m",
            "\u001B[34m●\u001B[0m",
            " "
    };

    public void write(Colour colour) {
        System.out.print(COLOUR_REPRESENTATIONS[colour.ordinal()]);
    }
}
