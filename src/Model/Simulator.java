package Model;

import Model.Taxi;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * This class is a Simulator class to simulate when the taxi is busy to set its availability
 * The class methods need to be out of our principal class Taxer because taxer just has the responsability
 * of asigning taxis to the
 */
public class Simulator {
    // protected Calendar calendary = new GregorianCalendar();

    public Simulator() {}

    /**
     * This class turn a taxi available when the iteration is divisible by 5
     * @param taxisWithDriver
     */
    public void makeTaxiAvailable(ArrayList<Taxi> taxisWithDriver) {
        for (Taxi taxi: taxisWithDriver) {
            taxi.setAvailability(taxi.getIterations() % 5 == 0);
        }
    }
    /*
    public void makeTaxiAvailable(ArrayList<Taxi> taxisWithDriver) {
        for (Taxi taxi: taxisWithDriver
        ) {
            taxi.setAvailability(calendary.get(Calendar.SECOND) >= 40 || taxi.getIterations() == 0);
            System.out.print(calendary.get(Calendar.SECOND));
        }
    }*/
}
