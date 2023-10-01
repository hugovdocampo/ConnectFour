package View;

import java.util.Scanner;

public class YesNoDialog {
    private boolean isAffirmative;

    public void read() {
        MessageView.PLAY_AGAIN.writeln();
        Scanner scanner = new Scanner(System.in);
        char answer;
        do {
            answer = Character.toLowerCase(scanner.next().charAt(0));
        } while (answer != 'y' && answer != 'n');

        isAffirmative = (answer == 'y');
    }

    public boolean isAffirmative() {
        return isAffirmative;
    }
}
