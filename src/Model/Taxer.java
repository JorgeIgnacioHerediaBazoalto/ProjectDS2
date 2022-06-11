package Model;

import DB.*;

import java.util.ArrayList;
import java.util.Random;

/**
 * This is the class that contains the principial funtions of the app
 *
 * @author Santiago Caballero
 */
public class Taxer {
    ArrayList<Taxi> taxis;
    ArrayList<Driver> drivers;
    ArrayList<Taxi> taxisWithDriver;
    ArrayList<Taxi> taxisAvailable;
    ArrayList<Driver> driversAvailable;
    boolean areTaxisAvailable;
    private String currency;

    /**
     * This is the constructor method of Taxer
     * It initializes lists of taxis, drivers and taxis with drivers
     */
    public Taxer() {
        this.taxis = new ArrayList<>();
        this.drivers = new ArrayList<>();
        this.taxisWithDriver = new ArrayList<>();
        this.taxisAvailable = new ArrayList<>();
        this.driversAvailable = new ArrayList<>();
        this.areTaxisAvailable = false;
        this.setCurrency("BOB");
    }

    public void addTaxi(Taxi taxi) {
        taxis.add(taxi);
    }

    public void addDriver(Driver driver){
        drivers.add(driver);
    }


    public void searchTaxiAvailable() {
        for (Taxi taxiMaybeAvailable: taxisWithDriver) {
            if (taxiMaybeAvailable.isAvailability()){
                taxisAvailable.add(taxiMaybeAvailable);
                System.out.println(taxiMaybeAvailable.getCarColor()+ " a taxi available");
            }
            else {
                taxisAvailable.remove(taxiMaybeAvailable);
                System.out.println(taxiMaybeAvailable.getCarColor()+ " se remueve");
            }
        }
    }

    public void addIteration() {
        if (taxisWithDriver.size() > 0) {
            for (Taxi taxi: taxisWithDriver) {
                taxi.addIteration();
                System.out.println(taxi.getIterations());
            }
        }
    }

    public void viewTaxisAvailable() {
        Simulator simulator = new Simulator();
        simulator.makeTaxiAvailable(taxisWithDriver);
        //for (Taxi taxi: taxisWithDriver) {
        //    taxi.setAvailability(taxi.getIterations() % 5 == 0);
        //}
    }

    public void asignDriverToTaxi(Driver driver, Taxi taxi) {
        taxi.setTaxiDriver(driver);
        removeDriver(driver);
        removeTaxi(taxi);
        taxisWithDriver.add(taxi);
        taxi.getTaxiDriver().getName();
        viewTaxisAvailable();
    }

    public void putRandomDriverToTaxi() {
        Random random = new Random();
        if (!drivers.isEmpty() && !taxis.isEmpty()) {
            int randomTaxi = random.nextInt(taxis.size());
            int randomDriver = random.nextInt(drivers.size());
            asignDriverToTaxi(drivers.get(randomDriver), taxis.get(randomTaxi));
            System.out.println("se asigno un chofer al taxi");
            areTaxisAvailable = true;
        }
        else {
            areTaxisAvailable =false;
            System.out.println("no hay mas chofers o taxis para la lista");
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
        System.out.println("patatas");
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

    /*public void taxiIsNowNotAvailable(Taxi taxi) {
        taxisAvailable.removeIf(taxiAvailable -> taxi.getNumberPlate().equals(taxiAvailable.getNumberPlate()));
    }

    public Taxi useTaxiAvailable() {
        Taxi taxiAvailable = taxisAvailable.get(0);
        taxiIsNowNotAvailable(taxiAvailable);
        return taxiAvailable;
    }*/

    public void removeDriver(Driver driver){
        drivers.remove(driver);
    }

    public void removeTaxi(Taxi taxi) {
        taxis.remove(taxi);
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

   /* public Driver driverFromList(ArrayList<Driver> drivers){
        Driver driver = null;
        int cont = 0;

        if(cont < drivers.size()){
            driver = drivers.get(cont);
            removeDriver(cont);
            cont++;
        }

        return driver;
    }*/


}
