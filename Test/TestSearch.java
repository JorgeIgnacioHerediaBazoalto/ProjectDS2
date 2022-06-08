import Model.Driver;
import Model.Taxer;
import Model.Taxi;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSearch {
    Taxer taxer = new Taxer();
    Taxi taxi1 = new Taxi("1234abc", "ToyotaRaptor-2022", "Blue", 5);
    Taxi taxi2 = new Taxi("1235abc", "ToyotaRaptor-2022", "Red", 5);
    Taxi taxi3 = new Taxi("1236abc", "ToyotaRaptor-2022", "Yellow", 5);
    Taxi taxi4 = new Taxi("1237abc", "ToyotaRaptor-2022", "Green", 5);
    Taxi taxi5 = new Taxi("1238abc", "ToyotaRaptor-2022", "Black", 5);

    Driver driver1 = new Driver("Juan Alcachofa", 1234567, 22, 987654, 0);
    Driver driver2 = new Driver("Juan Mamani", 1234568, 22, 987655, 0);
    Driver driver3 = new Driver("Juan Juan", 1234569, 22, 987656, 0);

    @Test
    public void testSearchTaxi() {
        taxi1.setAvailability(false);
        taxi2.setAvailability(false);

        taxer.addTaxi(taxi1);
        taxer.addTaxi(taxi2);
        taxer.addTaxi(taxi3);
        taxer.addTaxi(taxi4);
        taxer.addTaxi(taxi5);
        taxer.addDriver(driver1);
        taxer.addDriver(driver2);
        taxer.addDriver(driver3);

        taxer.searchTaxiAvailable();
        assertEquals(taxi3.getNumberPlate(), taxer.useTaxiAvailable().getNumberPlate());
    }
}
