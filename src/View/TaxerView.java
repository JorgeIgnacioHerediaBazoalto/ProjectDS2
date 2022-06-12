package View;

import Model.Race;
import Utils.Colors;
import Utils.Printer;
import Utils.ValuesRequester;


public class TaxerView extends Printable{
    private String taxiRequestAnswer;

    protected boolean ifOrder;

    public TaxerView() {
        super();
        this.ifOrder = true;
    }

    /**
     * Method to ask if the user is sure or not to order a taxi
     */
    public void printLoading() {
        System.out.print("Loading ");
        printStyle.chargeSimulator(".",4);
    }

    public void thanksMessage() {
        System.out.println(printStyle.BOXING+colors.CYAN_BOLD_BRIGHT+"\n-------->"+
                colors.WHITE_BOLD_BRIGHT+" Thanks for using the app "+ printStyle.RESET+
                colors.CYAN_BOLD_BRIGHT+"<-------"+colors.RESET);
    }

    /**
     * Method to ask if the user is sure or not to order a taxi
     */
    public void askIfOrder() {
        System.out.println(colors.WHITE_BOLD_BRIGHT+"\nDo you want to order a Taxi?: "+colors.RESET);
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

    public boolean getBoolIfOrder() {
        return ifOrder;
    }

    /**
     * This method sets an end message
     */
    private void endMessage() {
        System.out.println(colors.BLUE_BOLD_BRIGHT+"\n ----"+
                colors.WHITE_BOLD_BRIGHT+ "Ok come back when you need a taxi"
                +colors.BLUE_BOLD_BRIGHT+ "----"+colors.RESET);
    }
    public void taxiAvaliableMessage() {
        System.out.println(colors.BLUE_BOLD_BRIGHT+"::::::> "+
                colors.WHITE_BOLD_BRIGHT+"\n A taxi available is starting the ride \n"+
                colors.BLUE_BOLD_BRIGHT+" <::::::"+colors.RESET
        );
        printLoading();
    }

    public void taxiNotAvailableMessage() {
        System.out.println(colors.BLUE_BOLD_BRIGHT+"***> "+
                colors.WHITE_BOLD_BRIGHT+"\n There aren't taxis available for the moment :( \n"+
                colors.BLUE_BOLD_BRIGHT+" <***"+colors.RESET);}
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
