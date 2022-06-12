package View;

import Utils.ValuesRequester;

import java.text.DecimalFormat;


/**
 * This class will print race information.
 *
 * <p>
 *     Use the printer class from the utils package.
 * </p>
 *
 * @author Denis Jorge Gandarillas Delgado
 */
public class RaceView extends Printable{

    private final DecimalFormat formatCost = new DecimalFormat("#.00");
    protected ValuesRequester valuesRequester;
    protected String orderAnswer;
    protected boolean order;

    public RaceView() {
        super();
        this.valuesRequester = new ValuesRequester();
    }

    @Override
    public void title() {
        printMessage("\n"+colors.CYAN_BACKGROUND+ "INFORMATION GENERAL FROM THE RACE"+colors.RESET + "\n");
    }

    public void printLookingTaxi() {
        printLoadMessage("Looking for a taxi available"," .",4);
    }
    public String printAskTheStartPoint(){
        printMessage(colors.YELLOW_BOLD+"\nEnter your start point please: ");
        return valuesRequester.askLocation();
    }
    public String printAskTheArrivalPoint(){
        printMessage(colors.YELLOW_BOLD+"Enter your arrive point please: ");
        return valuesRequester.askLocation();
    }
    public int printAskTheNUmberOfPassengers(){
        printMessage(colors.YELLOW_BOLD+"Enter the number of passengers please: ");
        return valuesRequester.askIntPassengers(valuesRequester.askIntValue());
    }
    public void askIfSureOfInformation(){
        printMessage("\nIs correct the information of the ride?: ");
        orderAnswer = valuesRequester.askTwoOptionString("Yes","No");
    }

    public void sureOfInformation() {
        order = (orderAnswer.equalsIgnoreCase("Yes"));
    }
    public boolean getOrderRide() {
        return order;
    }

    public void setOrderRide(boolean order) {
        this.order = order;
    }

    public void printerTheInformationOfRace(){printMessage("\n"+colors.GREEN_BACKGROUND+ "INFORMATION FROM THE RACE"+colors.RESET + "\n");}
    /**
     *This method is responsible for creating the message to be printed.
     *
     * @param nameDriver Name of the assigned driver.
     * @param nameClient Name of the client who requested the service.
     * @param costRace Cost of the passage.
     * @param startingPoint Location of the starting point where the cab picks up the client.
     * @param arrivalPoint Location of the arrival point where the cab drops off the client.
     * @param passengerCount The number of passengers entering the cab.
     * @param dateTime Date and time of order.
     * @return Message about career information.
     */

    public String showInformationRace(String nameDriver, String nameClient, double costRace, String startingPoint,
                                      String arrivalPoint, int passengerCount, String dateTime, String currency){
        return colors.CYAN_BOLD+"\nDRIVER: "+colors.WHITE_BOLD_BRIGHT+nameDriver+
                colors.CYAN_BOLD+ "\nCLIENT: "+colors.WHITE_BOLD_BRIGHT+nameClient+
                colors.CYAN_BOLD+"\nCOST: "+colors.WHITE_BOLD_BRIGHT+formatCost.format(costRace)+" "+currency+
                colors.CYAN_BOLD+"\nSTARTING LOCATION: "+colors.WHITE_BOLD_BRIGHT+startingPoint+
                colors.CYAN_BOLD+"\nARRIVAL LOCATION: "+colors.WHITE_BOLD_BRIGHT+arrivalPoint+
                colors.CYAN_BOLD+"\nNUMBER OF PASSENGERS: "+colors.WHITE_BOLD_BRIGHT+passengerCount+
                colors.CYAN_BOLD+"\nDATE/TIME OF THE RACE: "+colors.WHITE_BOLD_BRIGHT+dateTime+"\n";
    }

    public void showRaceData(double costRace, String startingPoint, String arrivalPoint, int passengerCount, String currency) {
        printMessage(colors.LIGHT_GREEN + "\nCOST: "+colors.WHITE_BOLD_BRIGHT+formatCost.format(costRace)+" "+currency+
                colors.LIGHT_GREEN + "\nSTARTING LOCATION: "+colors.WHITE_BOLD_BRIGHT+startingPoint+
                colors.LIGHT_GREEN + "\nARRIVAL LOCATION: "+colors.WHITE_BOLD_BRIGHT+arrivalPoint+
                colors.LIGHT_GREEN + "\nNUMBER OF PASSENGERS: "+colors.WHITE_BOLD_BRIGHT+passengerCount+"\n");
    }

}
