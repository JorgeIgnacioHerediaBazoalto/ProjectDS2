package Utils;

import java.util.concurrent.TimeUnit;

/**
 * This is a util class to store text style values
 * This class contains constants values of different types of text style to be used in console prints
 * The style options are to create a box around the text, to strike the text and underline the text.
 *
 * @author LOS TIRADOS
 */

public class PrintStyle {
    //Text reset
    public  final String RESET = "\033[0m";
    //box
    public  final String BOXING = "\033[0;51m";   // BLACK
    public  final String BLUE_UNDERLINED = "\033[4;34m";   // BLUE
    public  final String PURPLE_UNDERLINED = "\033[4;35m"; // PURPLE

    /**
     * This method simulating load, for defect with second delay.
     */
    public void chargeSimulator() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Overloading this method simulating load, specifying the delay time.
     *
     * @param messageLoad information to print.
     * @param quantity time delay.
     */
    public void chargeSimulator(String messageLoad, int quantity) {
        for (int i = 0; i < quantity; i++) {
            try {
                System.out.print(messageLoad);
                TimeUnit.SECONDS.sleep(0);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        System.out.println();
    }
}
