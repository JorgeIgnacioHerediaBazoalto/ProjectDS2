package View;
import Utils.Printer;

/**
 * This class has the function of print information about the driver
 *
 * <p>
 *    DriverView uses Printer from utils package
 * </p>
 *
 * @author Sebastian Barra
 */

public class DriverView {

    Printer printer = new Printer();

    /**
     * This method prints in console the message that will be entered in message
     *
     * @param message driver info
     */

    public void printMessage(String message) {
        printer.printMessage(message);
    }

    /**
     * This method creates a String that contains information about the driver.
     *
     * @param name  how the driver is called
     * @param phoneNumber the driver's phone number
     * @param ageDriver how old is the driver
     * @param licenseNumber license identification
     * @param racesAmount total races made by the driver
     *
     * @return driver's information
     */
    public String ShowGeneralInfoDriver(String name, int phoneNumber, int ageDriver, int licenseNumber, int racesAmount){
        return "Driver name: " + name + "\nPhone number: " + phoneNumber + "\nDriver age: " + ageDriver + "\nLicense number: " + licenseNumber + "\nRaces amount: " + racesAmount;
    }


}
