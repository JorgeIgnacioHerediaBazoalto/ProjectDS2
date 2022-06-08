package DB;

import Model.Driver;

import java.util.ArrayList;
import java.util.List;

public class Drivers {
    protected List<Driver> drivers;

    public Drivers() {
        drivers = new ArrayList<>();
        Driver driver1 = new Driver("Juan Alcachofa", 1234567, 22, 987654, 0);
        Driver driver2 = new Driver("Juan Mamani", 1234568, 22, 987655, 0);
        Driver driver3 = new Driver("Juan Juan", 1234569, 22, 987656, 0);

        drivers = List.of(driver1,driver2,driver3);
    }

    public List<Driver> getDrivers() {
        return drivers;
    }
}
