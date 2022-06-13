package Utils;
import java.util.Map;

/**
 * This is class Printer is used to print a message or messages on the console output
 * This class belongs to utils package and it interacts with view classes
 *
 * @author LOS TIRADOS
 */
public class Printer {
    private final Colors colors;
    private final PrintStyle style;

    /**
     * This is the constructor method of the class Printer
     * It instances the class Colors and PrintStyle to modify the print style
     *
     */
    public Printer() {
        colors = new Colors();
        style = new PrintStyle();
    }

    /**
     * Method to print a message by console
     *
     * @param message a String value
     */
    public void printMessage(String message) {
        System.out.print(colors.WHITE_BOLD_BRIGHT+message+colors.RESET);
    }

    /**
     * Overloading the Method to print a message with a delay
     *
     * @param message the information to print
     * @param delay true the message will have a delay
     */
    public void printMessage(String message, boolean delay) {
        System.out.println(colors.WHITE_BOLD_BRIGHT+message+colors.RESET);
        style.chargeSimulator();
    }

    /**
     * Overloading the Method to print a message with color given.
     * 
     * @param message the information to print
     * @param color the color of the text
     */
    public void printMessage(String message, String color) {
        if (color.equals("red")) {
            System.out.print(colors.RED_BOLD_BRIGHT + message + colors.RESET);
        }
    }

    /**
     * Overloading the Method to print a message simulating load.
     *
     * @param message the information to print.
     * @param messageLoad string that it implies that it carries.
     * @param quantity load delay.
     */
    public void printLoadMessage(String message, String messageLoad, int quantity) {
        System.out.print("\n"+colors.WHITE_BOLD_BRIGHT+message+colors.RESET);
        style.chargeSimulator(colors.WHITE_BOLD_BRIGHT+messageLoad+colors.RESET,quantity);
        System.out.println();
    }

    /**
     * Method to print a dictionary with its key and value showing like a list with style and colors
     * it loops each key and value of the dictionary and prints them by console output
     * key and value need to be string type
     *
     * @param dictionary map type
     */
    public void printDictionary(Map<String, String> dictionary) {
        dictionary.forEach((key,value) ->
                System.out.println(colors.GREEN_BOLD_BRIGHT+key+colors.RESET+": "
                        +colors.WHITE_BOLD_BRIGHT+value+colors.RESET));
    }

}