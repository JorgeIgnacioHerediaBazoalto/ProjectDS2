package View;

import java.text.DecimalFormat;


/**
 * This class will print race information.
 *
 * <p>
 *     Use the printer class from the utils package.
 * </p>
 *
 * @author LOS TIRADOS
 */
public class RaceView extends Printable{

    private final DecimalFormat formatCost = new DecimalFormat("#.00");
    protected String sureOfRideAnswer;
    protected boolean sureOfRide;

    /**
     * This is method constructor receives params of the printable and initialize to params this class.
     */
    public RaceView() {
        super();
    }

    /**
     * Overriding method title, because any class have a different title.
     */
    @Override
    public void title() {
        printMessage("\n"+colors.CYAN_BACKGROUND+ "GENERAL INFORMATION FROM THE RACE"+colors.RESET + "\n");
    }

    /**
     * Generate message that we are looking for an available cab
     */
    public void printLookingTaxi() {
        printLoadMessage("Looking for a taxi available"," .",4);
    }

    /**
     * Generate message to ask start point of trip.
     * @return message of start point.
     */
    public String printAskTheStartPoint(){
        printMessage(colors.YELLOW_BOLD+"\nEnter your start point please: ");
        return valuesRequester.askLocation();
    }

    /**
     * Generate message to ask arrival point of trip.
     * @return message of arrival point.
     */
    public String printAskTheArrivalPoint(){
        printMessage(colors.YELLOW_BOLD+"Enter your arrive point please: ");
        return valuesRequester.askLocation();
    }

    /**
     * Generate message to ask number of passengers of trip.
     * @return message of number of passengers.
     */
    public int printAskTheNUmberOfPassengers(){
        printMessage(colors.YELLOW_BOLD+"Enter the number of passengers please: ");
        return valuesRequester.askIntPassengers(valuesRequester.askIntValue());
    }

    /**
     * This method asks if the customer is sure of the trip information entered.
     */
    public void askIfSureOfInformation(){
        printMessage("\nIs correct the information of the ride?: ");
        sureOfRideAnswer = valuesRequester.askTwoOptionString("Yes","No");
    }

    /**
     * This method convert answer (yes or not) in boolean
     */
    public void sureOfInformation() {
        sureOfRide = (sureOfRideAnswer.equalsIgnoreCase("Yes"));
    }

    /**
     * The method receives the order about the trip
     * @return order.
     */
    public boolean getSureOfRide() {
        return sureOfRide;
    }

    /**
     * Method sets order ride
     * @param order is boolean indicate if the client is sure of information, and we assign the trip.
     */
    public void setOrderRide(boolean order) {
        this.sureOfRide = order;
    }

    /**
     * This method print title of information partial from the race, this section help user to see if your information is correct.
     */
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

    /**
     * This method print information partial from the race, this message help user to see if your information is correct.
     * @param costRace generated randomly.
     * @param startingPoint start point when pick up to client.
     * @param arrivalPoint arrival point when let the client.
     * @param passengerCount How many passengers will go.
     * @param currency type money.
     */
    public void showRaceData(double costRace, String startingPoint, String arrivalPoint, int passengerCount, String currency) {
        printMessage(colors.LIGHT_GREEN + "\nCOST: "+colors.WHITE_BOLD_BRIGHT+formatCost.format(costRace)+" "+currency+
                colors.LIGHT_GREEN + "\nSTARTING LOCATION: "+colors.WHITE_BOLD_BRIGHT+startingPoint+
                colors.LIGHT_GREEN + "\nARRIVAL LOCATION: "+colors.WHITE_BOLD_BRIGHT+arrivalPoint+
                colors.LIGHT_GREEN + "\nNUMBER OF PASSENGERS: "+colors.WHITE_BOLD_BRIGHT+passengerCount+"\n");
    }

}
