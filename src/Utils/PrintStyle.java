package Utils;

import java.util.concurrent.TimeUnit;

/**
 * This is a util class to store text style values
 * This class contains constants values of different types of text style to be used in console prints
 * The style options are to create a box around the text, to strike the text and underline the text.
 *
 * @author Santiago Caballero
 */

public class PrintStyle {

    //Text reset
    public  final String RESET = "\033[0m";
    //box
    public  final String BOXING = "\033[0;51m";   // BLACK

    //strikeout
    public  final String BLACK_STRIKE = "\033[9;30m";   // BLACK
    public  final String RED_STRIKE = "\033[9;31m";     // RED
    public  final String GREEN_STRIKE = "\033[9;32m";   // GREEN
    public  final String YELLOW_STRIKE = "\033[9;33m";  // YELLOW
    public  final String BLUE_STRIKE = "\033[9;34m";    // BLUE
    public  final String WHITE_STRIKE = "\033[9;37m";   // WHITE

    //underline
    public  final String BLACK_UNDERLINED = "\033[4;30m";  // BLACK
    public  final String RED_UNDERLINED = "\033[4;31m";    // RED
    public  final String GREEN_UNDERLINED = "\033[4;32m";  // GREEN
    public  final String YELLOW_UNDERLINED = "\033[4;33m"; // YELLOW
    public  final String BLUE_UNDERLINED = "\033[4;34m";   // BLUE
    public  final String PURPLE_UNDERLINED = "\033[4;35m"; // PURPLE
    public  final String CYAN_UNDERLINED = "\033[4;36m";   // CYAN
    public  final String WHITE_UNDERLINED = "\033[4;37m";  // WHITE

    public void chargeSimulator() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void chargeSimulator(String messageLoad, int quantity) {
        for (int i = 0; i < quantity; i++) {
            try {
                System.out.print(messageLoad);
                TimeUnit.MILLISECONDS.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        System.out.println();
    }
}
