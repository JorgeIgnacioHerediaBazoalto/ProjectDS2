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

    public void addTaxi(Taxi taxi) {
        taxis.add(taxi);
    }

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

    public void addIteration() {
        if (taxisWithDriver.size() > 0) {
            for (Taxi taxi: taxisWithDriver) {
                taxi.addIteration();
            }
        }
    }

    public void viewTaxisAvailable() {
        Simulator simulator = new Simulator();
        simulator.makeTaxiAvailable(taxisWithDriver);
    }

    public void asignDriverToTaxi(Driver driver, Taxi taxi) {
        taxi.setTaxiDriver(driver);
        removeDriver(driver);
        removeTaxi(taxi);
        taxisWithDriver.add(taxi);
        viewTaxisAvailable();
    }

    /**
     * Method to put a random driver to a random taxi if our data base has taxis and drivers
     * this method puts a driver into a taxi and searches the available taxis with drivers
     * when all the taxis have their drivers the method just searches the available taxis with drivers
     *
     */
    public void putRandomDriverToTaxi() {
        Random random = new Random();
        if (!drivers.isEmpty() && !taxis.isEmpty()) {
            int randomTaxi = random.nextInt(taxis.size());
            int randomDriver = random.nextInt(drivers.size());
            asignDriverToTaxi(drivers.get(randomDriver), taxis.get(randomTaxi));
        }
        else {
            viewTaxisAvailable();
        }
    }

    public void setTaxisDriversList() {
        setTaxisList();
        setDriversList();
    }

    public void startLookingTaxi() {
        putRandomDriverToTaxi();
        searchTaxiAvailable();
    }

    private void setTaxisList() {
        Taxis taxisDB = new Taxis();
        taxis = taxisDB.getTaxis();
    }

    private void setDriversList() {
        Drivers driverDB = new Drivers();
        drivers = driverDB.getDrivers();
    }

    public ArrayList<Taxi> getTaxisAvailable() {
        return taxisAvailable;
    }

    public void removeDriver(Driver driver){
        drivers.remove(driver);
    }

    public void removeTaxi(Taxi taxi) {
        taxis.remove(taxi);
    }

}
