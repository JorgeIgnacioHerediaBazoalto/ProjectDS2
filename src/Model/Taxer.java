package Model;

import java.util.ArrayList;

/**
 * This is the class that contains the principial funtions of the app
 *
 * @author Santiago Caballero
 */
public class Taxer {
    ArrayList<Persona> taxiDrivers;
    ArrayList<Taxi> taxis;
    ArrayList<Driver> drivers;

    /**
     * This is the constructor method of Taxer
     * It initializes lists of taxis, drivers and taxis with drivers
     */
    public Taxer() {
        this.taxiDrivers = new ArrayList<>();
        this.taxis = new ArrayList<>();
        this.drivers = new ArrayList<>();
    }




}
