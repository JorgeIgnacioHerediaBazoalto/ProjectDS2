package Utils;

/**
 * This is a util class to store Colors values
 * This class contains constants values of colors to be used in console prints.
 *
 * @author Santiago Caballero
 */

public class Colors {

    public final String RESET = "\033[0m";  // Text Reset
    public final String BLUE = "\033[0;34m";    // BLUE
    public final String LIGHT_GREEN = "\033[38;2;136;255;0m"; //LIGHT GREEN

    // Bold
    public final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
    public final String PURPLE_BOLD = "\033[1;35m"; // PURPLE
    public final String CYAN_BOLD = "\033[1;36m";   // CYAN

    // Background
    public final String GREEN_BACKGROUND = "\033[42m";  // GREEN
    public final String BLUE_BACKGROUND = "\033[44m";   // BLUE
    public final String PURPLE_BACKGROUND = "\033[45m"; // PURPLE
    public final String CYAN_BACKGROUND = "\033[46m";   // CYAN
    public final String ORANGE_BACKGROUND = "\033[48;2;225;153;0m"; //ORANGE

    // Bold High Intensity
    public final String RED_BOLD_BRIGHT = "\033[1;91m";   // RED
    public final String GREEN_BOLD_BRIGHT = "\033[1;92m"; // GREEN
    public final String BLUE_BOLD_BRIGHT = "\033[1;94m";  // BLUE
    public final String PURPLE_BOLD_BRIGHT = "\033[1;95m";// PURPLE
    public final String CYAN_BOLD_BRIGHT = "\033[1;96m";  // CYAN
    public final String WHITE_BOLD_BRIGHT = "\033[1;97m"; // WHITE

}
