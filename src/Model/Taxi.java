package Model;

import java.util.ArrayList;
import java.util.Random;

/**
 * This class represent taxi with its attributes, for example its descriptive elements; number plate.
 * Also, logics attributes for example availability.
 *
 * @author LOS TIRADOS-developed
 */
public class Taxi {
    private final String numberPlate;
    private final String carModel;
    private final String carColor;
    private final int capacity;
    private boolean availability;
    private Driver taxiDriver;
    protected ArrayList<Race> taxiTrips;
    protected int iterations;

    private Random random;

    /**
     * This is a constructor class of Taxi, we suppose the taxi is available when initialized.
     * <p>
     *      This class have param availability.
     *      availability contain info about if the car is available (Not receive in constructor, but setter in true)
     * </p>
     *
     * @param numberPlate Identifier of car.
     * @param carModel Specification of car design.
     * @param carColor Car primary color, that may change.
     * @param capacity How many people enter.
     *
     */
    public Taxi(String numberPlate, String carModel, String carColor, int capacity, Driver driver) {
        this.numberPlate = numberPlate;
        this.carModel = carModel;
        this.carColor = carColor;
        this.capacity = capacity;
        this.taxiDriver = driver;
        this.availability = false;
        this.taxiTrips = new ArrayList<>();
        this.iterations = 0;
    }

    public void setTaxiDriver(Driver driver) {
        this.taxiDriver = driver;
    }

    /**
     * Method that get the car license plate.
     * @return numberPlate
     */
    public String getNumberPlate() {
        return numberPlate;
    }

    /**
     * Method that get the car model.
     * @return carModel
     */
    public String getCarModel() {
        return carModel;
    }


    /**
     * Method that get the car color primary.
     * @return carColor
     */
    public String getCarColor() {
        return carColor;
    }

    /**
     * Method that get the car capacity.
     * @return capacity
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Method that return car availability.
     * @return availability
     */
    public boolean isAvailability() {
        return availability;
    }

    /**
     * Method that set the car availability.
     * @param availability The car is available? (Not receive in constructor, but setter in true)
     */
    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    /**
     * This method gets driver from taxi.
     * @return taxiDriver
     */
    public Driver getTaxiDriver() {
        return taxiDriver;
    }

    /**
     * This method gets all trips from taxi.
     * @return taxiTrips
     */
    public ArrayList<Race> getTaxiTrips() {
        return taxiTrips;
    }

    /**
     * This method adds a trip to the taxi's trip history.
     * @param race a trip
     */
    public void addTaxiTrip(Race race) {
        taxiTrips.add(race);
    }

    /**
     * When the iteration is added, a random number in the range of 1 to 3 is generated and that number is added in the iteration.
     */
    public void addIteration() {
        random = new Random();
        this.iterations += random.nextInt(2)+1;
    }

    /**
     * This method gets iteration number for use later
     * @return the iterations of the taxi
     */
    public int getIterations() {
        return iterations;
    }

}
