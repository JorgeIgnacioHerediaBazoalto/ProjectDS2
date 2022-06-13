package View;

/**
 * This class print the information about the client.
 * Use Printer of the Utils package.
 *
 * @author LOS TIRADOS.
 */
public class ClientView extends Printable{
    private String sureAnswer;
    private boolean isSure;

    /**
     * This method is constructor to ClientView, help us to printMessages.
     */
    public ClientView() {
        super();
    }

    /**
     * Overriding method title, because any class have a different title.
     */
    @Override
    public void title() {
        printMessage("\n"+colors.BLUE_BACKGROUND+ "INFORMATION FROM THE CLIENT"+colors.RESET + "\n");
    }

    /**
     * Generate a message to ask name of client.
     * @return message to ask name.
     */
    public String printAskTheNameClient(){
        printMessage(colors.PURPLE_BOLD+"Enter your name please: ");
        return valuesRequester.askName();
    }

    /**
     * Generate a message to ask phone number of client.
     * @return message to ask phone.
     */
    public int printAskThePhoneClient(){
        printMessage(colors.PURPLE_BOLD+"Enter your phone number please: ");
        return valuesRequester.askIntValue();
    }

    /**
     * Generate a message to ask home location of client.
     * @return message to ask home location.
     */
    public String printAskTheLocationClient(){
        printMessage(colors.PURPLE_BOLD+"Enter your home location please: ");
        return valuesRequester.askLocation();
    }

    /**
     * This method asks if the customer is sure of the information entered.
     */
    public void askIfSure(){
        printMessage("\nAre you sure about your information?: ");
        sureAnswer = valuesRequester.askTwoOptionString("Yes","No");
    }

    /**
     * Method that get if sure when the answer is yes.
     *
     * @return isSure
     */
    public boolean getIfSure() {
        isSure = (sureAnswer.equalsIgnoreCase("Yes"));
        return isSure;
    }

    /**
     * Method gets boolean if client is sure or not.
     * @return isSure
     */
    public boolean getIfSureBool() {
        return isSure;
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
