package View;

/**
 * This class print the information about the client.
 * Use Printer of the Utils package.
 *
 * @author Karina Aguirre.
 */
public class ClientView extends Printable{

    @Override
    public void title() {
        printMessage("\n"+colors.BLUE_BACKGROUND+ "INFORMATION FROM THE CLIENT"+colors.RESET + "\n");
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
        printMessage("\nAre you sure about your information?: ");
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
