import DB.Drivers;
import DB.Taxis;
import Model.Taxi;
import Model.Taxer;
import Model.Driver;
import Model.Simulator;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestSimulator {

    Taxer modelTaxer = new Taxer();

    ArrayList<Taxi> taxisWithDriver = new ArrayList<>();

    ArrayList<Driver> drivers;

    ArrayList<Taxi> taxis;

    Drivers driverDB = new Drivers();

    Taxis taxisDB = new Taxis();



    @Test
    public void testMakeTaxiAvailable(){
        drivers = driverDB.getDrivers();
        taxis = taxisDB.getTaxis();

        modelTaxer.assignDriverToTaxi(drivers.get(0), taxis.get(0));
        modelTaxer.assignDriverToTaxi(drivers.get(1), taxis.get(1));
        modelTaxer.assignDriverToTaxi(drivers.get(2), taxis.get(2));

        taxisWithDriver.add(taxis.get(0));
        taxisWithDriver.add(taxis.get(1));
        taxisWithDriver.add(taxis.get(2));

        assertEquals("Juan Alcachofa",taxis.get(0).getTaxiDriver().getName());
    }
}
