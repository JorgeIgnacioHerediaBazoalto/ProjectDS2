package View;

/**
 * This method is view of the taxer(Business class).
 * Inherit Printable because use tools of printer and this class need to title.
 */
public class TaxerView extends Printable{
    private String taxiRequestAnswer;

    protected boolean ifOrder;

    /**
     * Constructor method, param ifOrder initialize in true, because when call this class we suppose the client will order the taxi.
     */
    public TaxerView() {
        super();
        this.ifOrder = true;
    }

    /**
     * Method to ask if the user is sure or not to order a taxi
     */
    public void printLoading() {
        printLoadMessage("Loading",".",4);
    }

    /**
     * Print thanks message
     */
    public void thanksMessage() {
        printMessage(printStyle.BOXING+colors.CYAN_BOLD_BRIGHT+"\n-------->"+
                colors.WHITE_BOLD_BRIGHT+" Thanks for using the app "+ printStyle.RESET+
                colors.CYAN_BOLD_BRIGHT+"<-------\n"+colors.RESET);
    }

    /**
     * Method to ask if the user is sure or not to order a taxi
     */
    public void askIfOrder() {
        printMessage(colors.WHITE_BOLD_BRIGHT+"\nDo you want to order a Taxi?: "+colors.RESET);
        taxiRequestAnswer = valuesRequester.askTwoOptionString("Yes","No");
    }

    /**
     * this method verify if the answer given is Yes or no
     * If the answer is "no" the program will end showing an end message
     *
     * @return true if the taxiRequestAnswer is yes
     */
    public boolean getIfOrder() {
        if (taxiRequestAnswer.equalsIgnoreCase("Yes")) {
            ifOrder = true;
        }
        else {
            endMessage();
            ifOrder = false;
        }
        return ifOrder;
    }

    /**
     * Method gets boolean ifOrder.
     * @return ifOrder boolean indicate if the client want a taxi.
     */
    public boolean getBoolIfOrder() {
        return ifOrder;
    }

    /**
     * This method sets an end message
     */
    private void endMessage() {
        printMessage(colors.BLUE_BOLD_BRIGHT+"\n ----"+
                colors.WHITE_BOLD_BRIGHT+ "Ok come back when you need a taxi"
                +colors.BLUE_BOLD_BRIGHT+ "----\n"+colors.RESET);
    }

    /**
     * Print if taxi is available message.
     */
    public void taxiAvaliableMessage() {
        printMessage(colors.BLUE_BOLD_BRIGHT+"::::::> "+
                colors.WHITE_BOLD_BRIGHT+"\n A taxi available is starting the ride \n"+
                colors.BLUE_BOLD_BRIGHT+" <::::::"+colors.RESET
        );
        printLoading();
    }

    /**
     * Print if taxi is not available message.
     */
    public void taxiNotAvailableMessage() {
        printMessage(colors.BLUE_BOLD_BRIGHT+"***> "+
                colors.WHITE_BOLD_BRIGHT+"\n There aren't taxis available for the moment :( \n"+
                colors.BLUE_BOLD_BRIGHT+" <***"+colors.RESET);}

    /**
     * Print title of taxis trips information.
     */
    public void racesOfTaxisPrintMessage() {
        printMessage(printStyle.BOXING+colors.CYAN_BOLD_BRIGHT+"\n-------->"+
                colors.WHITE_BOLD_BRIGHT+" TAXIS TRIPS INFORMATION "+ printStyle.RESET+
                colors.CYAN_BOLD_BRIGHT+"<-------\n"+colors.RESET);
    }
    /**
     * Method to show a message at the beginning just to give style to our app
     */
    @Override
    public void title() {
        printMessage(colors.WHITE_BOLD_BRIGHT+"\n<<<<<<<<<<  "+
                colors.CYAN_BACKGROUND+ " TAXER APP "+ colors.RESET+
                colors.WHITE_BOLD_BRIGHT+"  >>>>>>>>>>>>"+ colors.RESET+"\n");
    }
}
