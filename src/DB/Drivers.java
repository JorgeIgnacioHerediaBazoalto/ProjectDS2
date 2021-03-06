package DB;

import Model.Driver;
import java.util.ArrayList;

/**
 * This class simulates a data base that contains information about the drivers
 *
 * @author LOS TIRADOS
 */

public class Drivers {
    protected ArrayList<Driver> drivers;

    /**
     * Constructor method that initializes three drivers and add them to a
     * driver list
     */

    public Drivers() {
        drivers = new ArrayList<>();
        Driver driver1 = new Driver("Juan Alcachofa", 1234567, 22, 987654, 0);
        Driver driver2 = new Driver("Rosco Mamani", 1234568, 22, 987655, 0);
        Driver driver3 = new Driver("Pomelancio Mendoza", 1234569, 22, 987656, 0);
        drivers.add(driver1);
        drivers.add(driver2);
        drivers.add(driver3);
    }


    /**
     * This method returns a drivers list
     *
     * @return list of drivers
     */
    public ArrayList<Driver> getDrivers() {
        return drivers;
    }
}
