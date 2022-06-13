package Model;

import DB.*;
import java.util.ArrayList;
import java.util.Random;

/**
 * This is the class that contains the principal functions of the app
 * The class TAXER assign drivers to the taxis available, searches the taxis available to take the ride
 *
 * @author LOS TIRADOS
 */
public class Taxer {
    ArrayList<Taxi> taxis;
    ArrayList<Driver> drivers;
    ArrayList<Taxi> taxisWithDriver;
    ArrayList<Taxi> taxisAvailable;

    /**
     * This is the constructor method of Taxer
     * It initializes lists of taxis, drivers, taxis with drivers, and the taxis available
     * the list taxis contains the taxis from our database
     * the list drivers contains drivers from our database
     * the list taxisWithDriver will contain the taxis with a driver given
     * the list taxisAvailable will contain the taxis with driver available for a ride
     *
     */
    public Taxer() {
        this.taxis = new ArrayList<>();
        this.drivers = new ArrayList<>();
        this.taxisWithDriver = new ArrayList<>();
        this.taxisAvailable = new ArrayList<>();
    }

    /**
     * This method searches the available taxis from the list of taxis with driver
     * the method puts the available taxis in a new list in order to start a ride
     * if there are taxis that aren't available the method removes them from the available taxis list
     *
     */
    public void searchTaxiAvailable() {
        for (Taxi taxiMaybeAvailable: taxisWithDriver) {
            if (taxiMaybeAvailable.isAvailability()){
                taxisAvailable.add(taxiMaybeAvailable);
            }
            else {
                taxisAvailable.remove(taxiMaybeAvailable);
            }
        }
    }

    /**
     * Method to add iterations to all the taxis with driver
     */
    public void addIteration() {
        if (taxisWithDriver.size() > 0) {
            for (Taxi taxi: taxisWithDriver) {
                taxi.addIteration();
            }
        }
    }

    /**
     * Method to simulate the availability of the taxi.
     */
    public void taxiAvailabilitySimulation() {
        Simulator simulator = new Simulator();
        simulator.makeTaxiAvailable(taxisWithDriver);
    }

    /**
     * This method assign the driver in the taxi.
     * @param driver any driver available.
     * @param taxi any taxi available.
     */
    public void assignDriverToTaxi(Driver driver, Taxi taxi) {
        taxi.setTaxiDriver(driver);
        removeDriver(driver);
        removeTaxi(taxi);
        taxisWithDriver.add(taxi);
        taxiAvailabilitySimulation();
    }

    /**
     * Method to put a random driver to a random taxi if our database has taxis and drivers
     * this method puts a driver into a taxi and searches the available taxis with drivers
     * when all the taxis have their drivers the method just searches the available taxis with drivers
     *
     */
    public void putRandomDriverToTaxi() {
        Random random = new Random();
        if (!drivers.isEmpty() && !taxis.isEmpty()) {
            int randomTaxi = random.nextInt(taxis.size());
            int randomDriver = random.nextInt(drivers.size());
            assignDriverToTaxi(drivers.get(randomDriver), taxis.get(randomTaxi));
        }
        else {
            taxiAvailabilitySimulation();
        }
    }

    /**
     * This method set taxis and drivers lists, because we need this list to start giving trips.
     */
    public void setTaxisDriversList() {
        setTaxisList();
        setDriversList();
    }

    /**
     * This method assign one random driver to any taxi available found.
     */
    public void startLookingTaxi() {
        putRandomDriverToTaxi();
        searchTaxiAvailable();
    }

    /**
     * This method set taxis with taxis for defect in database.
     */
    private void setTaxisList() {
        Taxis taxisDB = new Taxis();
        taxis = taxisDB.getTaxis();
    }

    /**
     * This method set drivers with drivers for defect in database.
     */
    private void setDriversList() {
        Drivers driverDB = new Drivers();
        drivers = driverDB.getDrivers();
    }

    /**
     * Method gets a taxis available (Array-List).
     * @return taxisAvailable
     */
    public ArrayList<Taxi> getTaxisAvailable() {
        return taxisAvailable;
    }

    /**
     * This method removes driver from driver list.
     * @param driver driver to be removed.
     */
    public void removeDriver(Driver driver){
        drivers.remove(driver);
    }

    /**
     * This method removes taxi from taxis list.
     * @param taxi taxi to be removed.
     */
    public void removeTaxi(Taxi taxi) {
        taxis.remove(taxi);
    }

    /**
     * This method is to get the list of taxis with driver.
     * @return the list of taxis with driver
     */
    public ArrayList<Taxi> getTaxisWithDriver() {
        return taxisWithDriver;
    }
}
