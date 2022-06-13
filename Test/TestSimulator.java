import Model.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestSimulator {

    Taxer modelTaxer = new Taxer();


    @Test
    public void makeTaxiAvailable() {
        modelTaxer.setTaxisDriversList();
        modelTaxer.putRandomDriverToTaxi();
        Simulator simulator = new Simulator();
        simulator.makeTaxiAvailable(modelTaxer.getTaxisWithDriver());
        modelTaxer.searchTaxiAvailable();
        assertEquals(1,modelTaxer.getTaxisAvailable().size());
    }
}
