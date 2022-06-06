import Model.Taxi;
import View.TaxiView;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestTaxi {
    TaxiView taxiViewTest = new TaxiView();
    Taxi taxi = new Taxi("1234abc", "Hyunda-2022", "Rojo", 5);

    @Test
    public void testTaxiGeneralInfo() {
        assertEquals("Number plate: 1234abc\nCar model: Hyunda-2022\nCar color: Rojo\nCapacity: 5", taxiViewTest.showGeneralInfoTaxi(
                taxi.getNumberPlate(), taxi.getCarModel(), taxi.getCarColor(), taxi.getCapacity()));
    }

    @Test
    public void testIsAvailable() {
        assertEquals("The taxi with number plate: 1234abc\nIs AVAILABLE", taxiViewTest.showIsAvailable(taxi.getNumberPlate(), taxi.isAvailability()));
    }

    @Test
    public void testIsAvailable2() {
        taxi.setAvailability(false);
        assertEquals("The taxi with number plate: 1234abc\nIs NOT AVAILABLE", taxiViewTest.showIsAvailable(taxi.getNumberPlate(), taxi.isAvailability()));
    }
}
