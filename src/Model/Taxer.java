package Model;

import java.util.ArrayList;

/**
 * This is the class that contains the principial funtions of the app
 *
 * @author Santiago Caballero
 */
public class Taxer {
    ArrayList<Taxi> taxis;
    ArrayList<Driver> drivers;

    ArrayList<Taxi> taxisAvailable;
    ArrayList<Driver> driversAvailable;

    /**
     * This is the constructor method of Taxer
     * It initializes lists of taxis, drivers and taxis with drivers
     */
    public Taxer() {
        this.taxis = new ArrayList<>();
        this.drivers = new ArrayList<>();
        taxisAvailable = new ArrayList<>();
        driversAvailable = new ArrayList<>();
    }

    public void addTaxi(Taxi taxi) {
        taxis.add(taxi);
    }

    public void addDriver(Driver driver){
        drivers.add(driver);
    }


    public void searchTaxiAvailable() {
        for (Taxi taxiMaybeAvailable: taxis) {
            if (taxiMaybeAvailable.isAvailability()){
                taxisAvailable.add(taxiMaybeAvailable);
            }
        }
    }

    public void taxiIsNowNotAvailable(Taxi taxi) {
        taxisAvailable.removeIf(taxiAvailable -> taxi.getNumberPlate().equals(taxiAvailable.getNumberPlate()));
    }

    public Taxi useTaxiAvailable() {
        Taxi taxiAvailable = taxisAvailable.get(0);
        taxiIsNowNotAvailable(taxiAvailable);
        return taxiAvailable;
    }

    public void removeDriver(int num){
        drivers.remove(num);
    }

    public Driver driverFromList(ArrayList<Driver> drivers){
        Driver driver = null;
        int cont = 0;

        if(cont < drivers.size()){
            driver = drivers.get(cont);
            removeDriver(cont);
            cont++;
        }

        return driver;
    }

}
