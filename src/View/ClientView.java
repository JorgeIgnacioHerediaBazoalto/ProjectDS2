package View;
import Utils.Printer;
import Utils.Colors;
import Utils.PrintStyle;

/**
 * This class print the information about the client.
 * Use Printer of the Utils package.
 *
 * @author Karina Aguirre.
 */
public class ClientView {
    protected Printer printer = new Printer();
    protected PrintStyle printStyle = new PrintStyle();
    protected Colors colors = new Colors();

    /**
     * his method prints in console the message that will be entered in message.
     *
     * @param message client information.
     */
    public void printMessage(String message) {
        printer.printMessage(message);
    }
    public void printAskTheNameClient(){
        printMessage(colors.PURPLE_BOLD+"Enter your name please: ");
    }
    public void printAskThePhoneClient(){
        printMessage(colors.PURPLE_BOLD+"Enter your phone number please: ");
    }
    public void printAskTheLocationClient(){
        printMessage(colors.PURPLE_BOLD+"Enter your home location please: ");
    }
    public void printIfTheAboutInformation(){
        printMessage("\nAre you sure about your information?");
    }
    public void printTitleInformationOfClient(){
        printMessage("\n"+colors.BLUE_BACKGROUND+ "INFORMATION FROM THE CLIENT"+colors.RESET + "\n");
    }

    /**
     * This method creates a String about the information of client for print.
     *
     * @param name the name of client.
     * @param phoneNumber the phone number of client.
     * @param location the location of client.
     * @return client information.
     */
    public String showGeneralInformationClient(String name, int phoneNumber, String location){
        return (colors.BLUE+printStyle.BLUE_UNDERLINED+"\nClient name:"+colors.RESET+" "+ colors.WHITE_BOLD_BRIGHT+name +
                colors.BLUE+ printStyle.BLUE_UNDERLINED+"\nPhone Number:"+colors.RESET+" " +colors.WHITE_BOLD_BRIGHT+ phoneNumber +
                colors.BLUE+printStyle.BLUE_UNDERLINED+"\nLocation:"+colors.RESET+" " +colors.WHITE_BOLD_BRIGHT+ location+"\n");
    }
}
