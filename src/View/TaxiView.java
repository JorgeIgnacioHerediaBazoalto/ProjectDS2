package View;

import Controller.RaceController;
import Model.Race;
import java.util.ArrayList;

/**
 * This is the TaxiView class, this class has the job of printing info of taxi in console
 *
 * Use printer class of the utils package.
 *
 * @author LOS TIRADOS
 */
public class TaxiView extends Printable {
    private RaceView raceView;

    /**
     * Constructor method call to father class.
     */
    public TaxiView () {
        super();
    }

    /**
     * Overriding method title, because any class have a different title.
     */
    @Override
    public void title() {
        printMessage("\n"+colors.PURPLE_BACKGROUND+"INFORMATION FROM THE TAXI"+colors.RESET+"\n");
    }
    /**
     * This method create the message it contains general information or identification information.
     *
     * This method receive the following parameters:
     * @param numberPlate Identifier of car.
     * @param carModel Specification of car design.
     * @param carColor Car primary color, that may change.
     * @param capacity How many people enter.
     * @return message of general information car.
     */
    public String showGeneralInfoTaxi(String numberPlate, String carModel, String carColor, int capacity, int taxiTrips) {
        return colors.PURPLE_BOLD_BRIGHT+printStyle.PURPLE_UNDERLINED+"\nNumber plate:"+colors.RESET+" "+ colors.WHITE_BOLD_BRIGHT + numberPlate +
                colors.PURPLE_BOLD_BRIGHT+printStyle.PURPLE_UNDERLINED+ "\nCar model:"+colors.RESET+" "+ colors.WHITE_BOLD_BRIGHT + carModel +
                colors.PURPLE_BOLD_BRIGHT+printStyle.PURPLE_UNDERLINED+"\nCar color:"+colors.RESET+" " + colors.WHITE_BOLD_BRIGHT+ carColor +
                colors.PURPLE_BOLD_BRIGHT+printStyle.PURPLE_UNDERLINED+ "\nCapacity:"+colors.RESET+" " + colors.WHITE_BOLD_BRIGHT+ capacity+
                colors.PURPLE_BOLD_BRIGHT+printStyle.PURPLE_UNDERLINED+"\nTaxi Trips:"+colors.RESET+" "+ colors.WHITE_BOLD_BRIGHT+ taxiTrips+"\n";
    }
    /**
     * This method prints the general information of the trips completed if the taxi has trips completed
     * @param rides the list of rides completed by the taxi to send it at printEachRaceInfo
     */
    public void printRidesInformation(ArrayList<Race> rides) {
        if (!rides.isEmpty()) {
            printMessage(colors.BLUE_BOLD_BRIGHT+"\n-------"+
                    colors.WHITE_BOLD_BRIGHT+" TAXI RIDES "+
                    colors.BLUE_BOLD_BRIGHT+"--------\n"+colors.RESET);
            printEachRaceInfo(rides);
        }
    }

    /**
     * This method prints the general information of each trip finished by the taxi
     * @param rides the list of rides completed by the taxi to loop and print each general information
     */
    private void printEachRaceInfo(ArrayList<Race> rides) {
        raceView = new RaceView();
        for (Race race:rides) {
            printMessage(colors.GREEN_BOLD_BRIGHT+"\nRIDE NUMBER: "+
                    colors.WHITE_BOLD_BRIGHT+(rides.indexOf(race)+1)+colors.RESET+"\n");
            RaceController raceController = new RaceController(race,raceView);
            raceController.generalInformation();
        }
    }

    /**
     * This method create the message it contains information about availability of car
     * @param numberPlate Identifier of car.
     * @param availability The car is available?
     * @return message of availability.
     */
    public String showIsAvailable(String numberPlate, boolean availability) {
        String isAvailable = "The taxi with number plate: " + numberPlate;
        isAvailable += "\nIs" + (availability ? " " : " NOT ") + "AVAILABLE";
        return isAvailable;
    }
}
