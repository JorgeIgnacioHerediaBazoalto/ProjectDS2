package View;

import java.time.LocalDateTime;
import Utils.Printer;

/**
 * This class will print race information.
 *
 * <p>
 *     Use the printer class from the utils package.
 * </p>
 *
 * @author Denis Jorge Gandarillas Delgado
 */
public class RaceView {

    Printer printer = new Printer();

    /**
     * This method prints the information on the console.
     *
     * @param message Saves the message to be printed.
     */

    public void printMessage(String message){
        printer.printMessage(message);
    }

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

    public String showInformationRace(String nameDriver, String nameClient, double costRace, String startingPoint, String arrivalPoint, int passengerCount, LocalDateTime dateTime){
        return "DRIVER: "+nameDriver+"\nCLIENT: "+nameClient+"\nCOST: "+costRace+"\nSTARTING LOCATION: "+startingPoint+"\nARRIVAL LOCATION: "+arrivalPoint+"\nNUMBER OF PASSENGERS: "+passengerCount+"\nDATE/TIME OF THE RACE: "+dateTime;
    }

}
