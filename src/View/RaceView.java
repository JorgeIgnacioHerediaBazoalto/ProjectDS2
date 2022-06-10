package View;

import java.time.LocalDateTime;
import Utils.Printer;
import Utils.Colors;
import Utils.PrintStyle;

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

    protected Printer printer = new Printer();
    protected Colors colors = new Colors();
    protected PrintStyle printStyle = new PrintStyle();

    /**
     * This method prints the information on the console.
     *
     * @param message Saves the message to be printed.
     */

    public void printMessage(String message){
        printer.printMessage(message);
    }

    public void printLoadStyle() {
        printer.printLoadMessage("Looking for a taxi available"," .",4);
    }
    public void printAskTheStartPoint(){printMessage(colors.YELLOW_BOLD+"Enter your start point please: ");}
    public void printAskTheArrivetPoint(){printMessage(colors.YELLOW_BOLD+"Enter your arrive point please: ");}
    public void printAskTheNUmberOfPassangers(){printMessage(colors.YELLOW_BOLD+"Enter the number of passangers please: ");}
    public void printIfTheAboutInformation(){
        printMessage("\nAre you sure about this information?");
    }
    public void printerTheInformationOfRace(){printMessage("\n"+colors.GREEN_BACKGROUND+ "INFORMATION FROM THE RACE"+colors.RESET + "\n");}
    public void printTheGeneralInformationOfRace(){printMessage("\n"+colors.CYAN_BACKGROUND+ "INFORMATION GENERAL FROM THE RACE"+colors.RESET + "\n");}
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
                                      String arrivalPoint, int passengerCount, String dateTime){
        return colors.CYAN_BOLD+"\nDRIVER: "+colors.WHITE_BOLD_BRIGHT+nameDriver+
                colors.CYAN_BOLD+ "\nCLIENT: "+colors.WHITE_BOLD_BRIGHT+nameClient+
                colors.CYAN_BOLD+"\nCOST: "+colors.WHITE_BOLD_BRIGHT+costRace+
                colors.CYAN_BOLD+"\nSTARTING LOCATION: "+colors.WHITE_BOLD_BRIGHT+startingPoint+
                colors.CYAN_BOLD+"\nARRIVAL LOCATION: "+colors.WHITE_BOLD_BRIGHT+arrivalPoint+
                colors.CYAN_BOLD+"\nNUMBER OF PASSENGERS: "+colors.WHITE_BOLD_BRIGHT+passengerCount+
                colors.CYAN_BOLD+"\nDATE/TIME OF THE RACE: "+colors.WHITE_BOLD_BRIGHT+dateTime+"\n";
    }

    public void showRaceData(double costRace, String startingPoint, String arrivalPoint, int passengerCount) {
        printer.printMessage(colors.LIGHT_GREEN + "\nCOST: "+colors.WHITE_BOLD_BRIGHT+costRace+
                colors.LIGHT_GREEN + "\nSTARTING LOCATION: "+colors.WHITE_BOLD_BRIGHT+startingPoint+
                colors.LIGHT_GREEN + "\nARRIVAL LOCATION: "+colors.WHITE_BOLD_BRIGHT+arrivalPoint+
                colors.LIGHT_GREEN + "\nNUMBER OF PASSENGERS: "+colors.WHITE_BOLD_BRIGHT+passengerCount+"\n");
    }

}
