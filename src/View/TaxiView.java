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

    public void printRidesInformation(ArrayList<Race> rides) {
        if (!rides.isEmpty()) {
            System.out.println();
            System.out.println("----TAXI RIDES-----");
            System.out.println();
            printEachRaceInfo(rides);
        }
    }

    private void printEachRaceInfo(ArrayList<Race> rides) {
        for (Race race:rides
        ) {
            raceView = new RaceView();
            System.out.println();
            System.out.println("Ride Number "+(rides.indexOf(race)+1));
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
