import Controler.TaxerController;
import Model.Taxer;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Taxer taxer = new Taxer();
        TaxerController taxerController = new TaxerController(taxer);
        taxerController.start();
    }
}
