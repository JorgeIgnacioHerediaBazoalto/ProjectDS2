package View;

/**
 * This class has the function of print information about the driver
 *
 * <p>
 *    DriverView uses Printer from utils package
 * </p>
 *
 * @author Sebastian Barra
 */

public class DriverView extends Printable{

    @Override
    public void title() {
        printMessage("\n"+colors.BLUE_BACKGROUND+ "INFORMATION FROM THE DRIVER"+colors.RESET + "\n");
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
