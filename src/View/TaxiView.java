package View;

import Controler.RaceController;
import Model.Race;

import java.util.ArrayList;

/**
 * This is the TaxiView class, this class has the job of printing info of taxi in console
 *
 * Use printer class of the utils package.
 *
 * @author Jorge Heredia
 */
public class TaxiView extends Printable {
    private RaceView raceView;

    public TaxiView () {
        super();
    }

    @Override
    public void title() {
        printMessage("\n"+colors.PURPLE_BACKGROUND+"INFORMATION FROM THE TAXI"+colors.RESET+"\n");
    }

//    public void titleInformationOfTaxi(){printMessage("\n"+colors.PURPLE_BACKGROUND+"INFORMATION FROM THE TAXI"+colors.RESET+"\n");}

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
            System.out.println();
            System.out.println("----TAXI RIDES-----");
            System.out.println();
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
            System.out.println();
            System.out.println(colors.GREEN_BOLD_BRIGHT+"RIDE NUMBER: "+
                    colors.WHITE_BOLD_BRIGHT+(rides.indexOf(race)+1)+colors.RESET);
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
