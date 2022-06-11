package View;

import Utils.*;

/**
 * This class is to control the messages to display of the start menu of the app
 * This class sets and sends the information to its view Class to show the welcome menu.
 *
 * @author Santiago Caballero
 */
public class TaxerMenuView {

    private final ValuesRequester valuesRequester;
    private String startRequestAnswer;
    protected Colors colors;
    protected Printer printer;

    /**
     * This is the constructor method it initializes the util classes to set and send information to the printer.
     * It recieves the view class of taxer to send the messages to show a menu.
     *
     */
    public TaxerMenuView() {
        this.printer = new Printer();
        this.valuesRequester = new ValuesRequester();
        this.colors = new Colors();
    }

    /**
     * This method sets the welcome message at the beginning of the app.
     */
    private void setWelcomeMessage() {
        printer.printMessage(colors.BLUE_BOLD_BRIGHT+"\n--------- "+colors.RESET+
                colors.WHITE_BOLD_BRIGHT+"WELCOME TO TAXER"+colors.RESET+
                colors.BLUE_BOLD_BRIGHT+" ---------"+colors.RESET+"\n",true);
    }

    /**
     * This method asks if the client wants to start the app o not.
     * the method is called before giving the personal information
     */
    private void askIfStart() {
        printer.printMessage("Do you want to start the App?: ");
        startRequestAnswer = valuesRequester.askTwoOptionString("Yes","No");
    }

    /**
     * this method verify if the answer given is Yes or no
     * If the answer is "no" the program will end showing an end message
     *
     * @return true if the startRequqestAnswer is yes
     */
    public boolean getIfStart() {
        boolean willStart;
        if (startRequestAnswer.equalsIgnoreCase("Yes")) willStart = true;
        else {
            //offMessage();
            willStart = false;
        }
        return
                willStart;
    }

    /**
     * This method sets an end message
     */
    public void offMessage() {
        printer.printMessage(colors.BLUE_BOLD_BRIGHT+"----"+
                colors.WHITE_BOLD_BRIGHT+ "Ok come back when you want to start using the app"
                +colors.BLUE_BOLD_BRIGHT+ "----"+colors.RESET);
    }

    /**
     * This is the principal method of the class that starts the Menu
     */
    public void startMenu() {
        setWelcomeMessage();
        askIfStart();
    }

}
