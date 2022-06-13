import DB.Drivers;
import DB.Taxis;
import Model.Driver;
import Model.Taxi;
import Model.Taxer;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestTaxer {

    Taxer modelTaxer = new Taxer();

    Drivers driverDB = new Drivers();

    Taxis taxisDB = new Taxis();

    ArrayList<Taxi> taxisWithDriver = new ArrayList<>();
    Taxi taxi1 = new Taxi("1234abc", "ToyotaRaptor-2022","Blue", 5,null);
    Driver driver1 = new Driver("Juan Alcachofa", 1234567, 22, 987654, 0);


    @Test
    public void testAssignDriverToTaxi(){

        taxisWithDriver.add(taxi1);
        modelTaxer.assignDriverToTaxi(driver1, taxi1);
        System.out.println(taxisWithDriver.get(0).getTaxiDriver().getName());
        assertEquals("Juan Alcachofa", taxisWithDriver.get(0).getTaxiDriver().getName());


    }
}
