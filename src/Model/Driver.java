package Model;

/**
 * This class represents the driver of the taxis.
 *
 * @author LOS TIRADOS
 */
public class Driver extends Person {


    private int AgeDriver;
    private int licenseNumber;
    private int racesAmount;


    /**
     * This is the constructor method that receives information about the driver.
     *
     * @param name  how the driver is called
     * @param phoneNumber the driver's phone number
     * @param ageDriver how old is the driver
     * @param licenseNumber license identification
     * @param racesAmount total races made by the driver
     */
    public Driver(String name, int phoneNumber, int ageDriver, int licenseNumber, int racesAmount) {
        super();
        this.name = name;
        this.phoneNumber = phoneNumber;
        AgeDriver = ageDriver;
        this.licenseNumber = licenseNumber;
        this.racesAmount = racesAmount;
    }


    /**
     * This method gets the driver's age.
     *
     * @return AgeDriver
     */
    public int getAgeDriver() {
        return AgeDriver;
    }

    /**
     * This method returns the driver's license number.
     *
     * @return licenseNumber
     */
    public int getLicenseNumber() {
        return licenseNumber;
    }


    /**
     * This method returns the total number of runs the driver made.
     * @return racesAmount
     */
    public int getRacesAmount() {
        return racesAmount;
    }


    /**
     * This method sets an age to the driver.
     *
     * @param ageDriver how old is the driver
     */
    public void setAgeDriver(int ageDriver) {
        AgeDriver = ageDriver;
    }


    /**
     * This method saves the license number.
     *
     * @param licenseNumber license identification
     */
    public void setLicenseNumber(int licenseNumber) {
        this.licenseNumber = licenseNumber;
    }


    /**
     * This method set the amount of races that the driver has.
     *
     * @param racesAmount total races made by the driver
     */
    public void setRacesAmount(int racesAmount) {
        this.racesAmount = racesAmount;
    }
}
