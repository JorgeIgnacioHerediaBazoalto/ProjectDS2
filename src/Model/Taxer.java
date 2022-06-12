package Model;

import DB.*;

import java.util.ArrayList;
import java.util.Random;

/**
 * This is the class that contains the principal functions of the app
 *
 * @author Santiago Caballero
 */
public class Taxer {
    ArrayList<Taxi> taxis;
    ArrayList<Driver> drivers;
    ArrayList<Taxi> taxisWithDriver;
    ArrayList<Taxi> taxisAvailable;

    /**
     * This is the constructor method of Taxer
     * It initializes lists of taxis, drivers and taxis with drivers
     */
    public Taxer() {
        this.taxis = new ArrayList<>();
        this.drivers = new ArrayList<>();
        this.taxisWithDriver = new ArrayList<>();
        this.taxisAvailable = new ArrayList<>();
    }

    /**
     * This method add a taxi in taxis list.
     * @param taxi any taxi.
     */
    public void addTaxi(Taxi taxi) {
        taxis.add(taxi);
    }

    /**
     * This method add a driver in drivers list.
     * @param driver any driver.
     */
    public void addDriver(Driver driver){
        drivers.add(driver);
    }

    /**
     * This method searches the available taxis from the list of taxis with driver
     * the method puts the available taxis in a new list in order to start a ride
     * in the case of being taxis that are not available the method removes them from the available taxis list
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
     * ?
     */
    public void addIteration() {
        if (taxisWithDriver.size() > 0) {
            for (Taxi taxi: taxisWithDriver) {
                taxi.addIteration();
            }
        }
    }

    /**
     * ?
     */
    public void viewTaxisAvailable() {
        Simulator simulator = new Simulator();
        simulator.makeTaxiAvailable(taxisWithDriver);
    }

    /**
     * This method set the driver in taxi.
     * @param driver any driver available.
     * @param taxi any taxi available.
     */
    public void assignDriverToTaxi(Driver driver, Taxi taxi) {
        taxi.setTaxiDriver(driver);
        removeDriver(driver);
        removeTaxi(taxi);
        taxisWithDriver.add(taxi);
        viewTaxisAvailable();
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
            viewTaxisAvailable();
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
        searchTaxiAvailable();
        putRandomDriverToTaxi();
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
}
