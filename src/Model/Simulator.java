package Model;

import java.util.ArrayList;

/**
 * This class is a Simulator class to simulate when the taxi is busy to set its availability
 * The class methods need to be out of our principal class Taxer because taxer just has the responsability
 * of asigning taxis to the
 */
public class Simulator {

    /**
     * This is the constructor method of Simulator class
     */
    public Simulator() {}

    /**
     * This class turn a taxi available when the iteration is divisible by 5
     * @param taxisWithDriver the list of taxis with driver to set the availability of them
     */
    public void makeTaxiAvailable(ArrayList<Taxi> taxisWithDriver) {
        for (Taxi taxi: taxisWithDriver) {
            taxi.setAvailability(taxi.getIterations() % 5 == 0);
        }
    }
}
