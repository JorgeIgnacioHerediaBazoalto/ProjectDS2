package Taxer;

import Utils.Colors;
import Utils.ValuesRequester;

/**
 * This class is to control the messages to ask if the user needs a ride
 * This class sets and sends the information to its view Class to ask the ride information.
 *
 * @author Santiago Caballero
 */
public class TaxerRideController {
    private final ValuesRequester valuesRequester;
    private String taxiRequestAnswer;
    protected Colors colors;
    protected TaxerView taxerRideView;

    /**
     * This is the constructor method it initializes the util classes to set,verify and send information to the printer.
     * It recieves the view class of taxer to send the messages to order a taxi.
     *
     * @param taxerRideView received to send the messages and information to print.
     */
    public TaxerRideController(TaxerView taxerRideView) {
        this.valuesRequester = new ValuesRequester();
        this.colors = new Colors();
        this.taxerRideView = taxerRideView;
    }

    /**
     * Method to set a message at the beginning just to give style to our app
     */
    private void setAppStartMessage() {
        taxerRideView.printMessage(colors.BLUE_BOLD_BRIGHT+"\n--------- "+colors.RESET+
                colors.WHITE_BOLD_BRIGHT+"TAXER"+colors.RESET+
                colors.BLUE_BOLD_BRIGHT+" ---------"+colors.RESET+"\n",true);
    }

    /**
     * Method to ask if the user is sure or not to order a taxi
     */
    private void askIfOrder() {
        taxerRideView.printMessage("Do you want to order a Taxi ?", colors.WHITE_BOLD_BRIGHT);
        taxiRequestAnswer = valuesRequester.askTwoOptionString("Yes","No");
    }

    /**
     * this method verify if the answer given is Yes or no
     * If the answer is "no" the program will end showing an end message
     *
     * @return true if the taxiRequestAnswer is yes
     */
    public boolean getIfOrder() {
        boolean willOrder;
        if (taxiRequestAnswer.equalsIgnoreCase("Yes")) willOrder = true;
        else {
            endMessage();
            willOrder = false;
        }
        return willOrder;
    }
    /**
     * This method sets an end message
     */
    private void endMessage() {
        taxerRideView.printMessage(colors.BLUE_BOLD_BRIGHT+"----"+
                colors.WHITE_BOLD_BRIGHT+ "Ok come back when you need a taxi"
                +colors.BLUE_BOLD_BRIGHT+ "----"+colors.RESET);
    }
    /**
     * This is the principal method of the class that start asking for order a taxi.
     */
    public void startApp() {
        setAppStartMessage();
        askIfOrder();
    }
}
