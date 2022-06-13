package View;

/**
 * This class is to control the messages to display of the start menu of the app
 * This class sets and sends the information to its view Class to show the welcome menu.
 *
 * @author LOS TIRADOS
 */
public class TaxerMenuView extends Printable{

    private String startRequestAnswer;

    /**
     * This is the constructor method it initializes the util classes to set and send information to the printer.
     * It recieves the view class of taxer to send the messages to show a menu.
     *
     */
    public TaxerMenuView() {
        super();
    }

    /**
     * This method sets the welcome message at the beginning of the app.
     */
    private void setWelcomeMessage() {
        printMessage(colors.BLUE_BOLD_BRIGHT+"\n--------- "+colors.RESET+
                colors.ORANGE_BACKGROUND+colors.WHITE_BOLD_BRIGHT+"WELCOME TO TAXER"+colors.RESET+
                colors.BLUE_BOLD_BRIGHT+" ---------"+colors.RESET+"\n",true);
    }

    /**
     * This method asks if the client wants to start the app o not.
     * the method is called before giving the personal information
     */
    private void askIfStart() {
        printMessage("\nDo you want to start the App?: ");
        startRequestAnswer = valuesRequester.askTwoOptionString("Yes","No");
    }

    /**
     * this method verify if the answer given is Yes or no
     * If the answer is "no" the program will end showing an end message
     *
     * @return true if the startRequqestAnswer is yes
     */
    public boolean getIfStart() {
        return (startRequestAnswer.equalsIgnoreCase("Yes"));
    }

    /**
     * This method sets an end message
     */
    public void offMessage() {
        printMessage(colors.BLUE_BOLD_BRIGHT+"----"+
                colors.WHITE_BOLD_BRIGHT+ "Ok come back when you want to start using the app"
                +colors.BLUE_BOLD_BRIGHT+ "----"+colors.RESET);
    }

    /**
     * This is the principal method of the class that starts the Menu
     */
    public void startMenu() {
        setWelcomeMessage();
        title();
        askIfStart();
    }

    /**
     * Overriding method title, because any class have a different title.
     */
    @Override
    public void title() {
        printMessage(colors.WHITE_BOLD_BRIGHT+"\n<<<<<<<<<<  "+
                colors.CYAN_BACKGROUND+ " TAXER MENU "+ colors.RESET+
                colors.WHITE_BOLD_BRIGHT+"  >>>>>>>>>>>>"+ colors.RESET+"\n");
    }
}
