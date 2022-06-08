package Utils;
import java.util.Map;

/**
 * This is class Printer is used to print a message or messages on the console output
 * This class belongs to utils package and it interacts with view classes
 *
 * @author Santiago Caballero
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
        System.out.println(colors.WHITE_BOLD_BRIGHT+message+colors.RESET);
    }

    /**
     * Method to print a message with color given
     * 
     * @param message the information to print
     * @param color the color of the text
     */
    public void printMessage(String message, String color) {
        if (color.equalsIgnoreCase("red")){
            System.out.println(colors.RED_BOLD_BRIGHT+message+colors.RESET);
        }


    /**
     * Method to print 2 messages by console
     *
     * @param message1 string value
     * @param message2 string value
     */
    public void printBoxMessages(String message1, String message2) {
        System.out.println(colors.GREEN_BOLD_BRIGHT+message1+colors.RESET +
                " " + style.BOXING+colors.WHITE_BOLD_BRIGHT+message2+colors.RESET+style.RESET);
    }

    /**
     * Overloading the method to print 2 messages by console
     *
     * @param message string value
     * @param value int value
     */
    public void printMessages(String message, int value) {
        System.out.println(message+": "+value);
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
