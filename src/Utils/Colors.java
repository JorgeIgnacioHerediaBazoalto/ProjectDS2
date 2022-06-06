package Utils;

/**
 * This is a util class to store Colors values
 * This class contains constants values of colors to be used in console prints.
 *
 * @author Santiago Caballero
 */

public class Colors {

    public final String RESET = "\033[0m";  // Text Reset
    public final String ERASE = "\033[H\033[2J";
    public final String HIDDEN = "\033[8;30m";

    // Regular Colors
    public final String BLACK = "\033[0;30m";   // BLACK
    public final String RED = "\033[0;31m";     // RED
    public final String GREEN = "\033[0;32m";   // GREEN
    public final String YELLOW = "\033[0;33m";  // YELLOW
    public final String BLUE = "\033[0;34m";    // BLUE
    public final String PURPLE = "\033[0;35m";  // PURPLE
    public final String CYAN = "\033[0;36m";    // CYAN
    public final String WHITE = "\033[0;37m";   // WHITE
    public final String LIGHT_PURPLE = "\033[38;2;200;0;200m"; //LIGHT PURPLE
    public final String ORANGE = "\033[38;2;225;153;0m"; //ORANGE
    public final String LIGHT_GREEN = "\033[38;2;136;255;0m"; //LIGHT GREEN
    public final String LIGHT_BLUE = "\033[38;2;120;172;255m"; //LIGHT BLUE
    public final String ROSY_PINK = "\033[38;2;255;0;162m"; //ROSY PINK
    public final String BROWN = "\033[38;2;135;82;62m"; //BROWN
    public final String FOREST_GREEN = "\033[38;2;62;135;81m"; //FOREST GREEN
    public final String BANANA_YELLOW = "\033[38;2;240;238;113m"; //BANANA YELLOW

    // Bold
    public final String BLACK_BOLD = "\033[1;30m";  // BLACK
    public final String RED_BOLD = "\033[1;31m";    // RED
    public final String GREEN_BOLD = "\033[1;32m";  // GREEN
    public final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
    public final String BLUE_BOLD = "\033[1;34m";   // BLUE
    public final String PURPLE_BOLD = "\033[1;35m"; // PURPLE
    public final String CYAN_BOLD = "\033[1;36m";   // CYAN
    public final String WHITE_BOLD = "\033[1;37m";  // WHITE

    // Background
    public final String BLACK_BACKGROUND = "\033[40m";  // BLACK
    public final String RED_BACKGROUND = "\033[41m";    // RED
    public final String GREEN_BACKGROUND = "\033[42m";  // GREEN
    public final String YELLOW_BACKGROUND = "\033[43m"; // YELLOW
    public final String BLUE_BACKGROUND = "\033[44m";   // BLUE
    public final String PURPLE_BACKGROUND = "\033[45m"; // PURPLE
    public final String CYAN_BACKGROUND = "\033[46m";   // CYAN
    public final String WHITE_BACKGROUND = "\033[47m";  // WHITE
    public final String LIGHT_PURPLE_BACKGROUND = "\033[48;2;200;0;200m"; //LIGHT PURPLE
    public final String ORANGE_BACKGROUND = "\033[48;2;225;153;0m"; //ORANGE
    public final String LIGHT_GREEN_BACKGROUND = "\033[48;2;136;255;0m"; //LIGHT GREEN
    public final String LIGHT_BLUE_BACKGROUND = "\033[48;2;120;172;255m"; //LIGHT BLUE
    public final String BROWN_BACKGROUND = "\033[48;2;135;82;62m"; //BROWN

    // Bold High Intensity
    public final String BLACK_BOLD_BRIGHT = "\033[1;90m"; // BLACK
    public final String RED_BOLD_BRIGHT = "\033[1;91m";   // RED
    public final String GREEN_BOLD_BRIGHT = "\033[1;92m"; // GREEN
    public final String YELLOW_BOLD_BRIGHT = "\033[1;93m";// YELLOW
    public final String BLUE_BOLD_BRIGHT = "\033[1;94m";  // BLUE
    public final String PURPLE_BOLD_BRIGHT = "\033[1;95m";// PURPLE
    public final String CYAN_BOLD_BRIGHT = "\033[1;96m";  // CYAN
    public final String WHITE_BOLD_BRIGHT = "\033[1;97m"; // WHITE

}