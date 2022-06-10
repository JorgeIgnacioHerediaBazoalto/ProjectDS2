package View;
import Utils.Printer;

/**
 * This is the TaxiView class, this class has the job of printing info of taxi in console
 *
 * Use printer class of the utils package.
 *
 * @author Jorge Heredia
 */
public class TaxiView {
    Printer printer = new Printer();

    /**
     * This method print message in console.
     * @param message any message.
     */
    public void printMessage(String message) {
        printer.printMessage(message);
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
        return "\nNumber plate: " + numberPlate +
                "\nCar model: " + carModel +
                "\nCar color: " + carColor +
                "\nCapacity: " + capacity+
                "\nTaxi Trips: "+ taxiTrips+"\n";
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
