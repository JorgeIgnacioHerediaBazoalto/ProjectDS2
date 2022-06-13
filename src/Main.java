import Controller.TaxerController;
import Model.Taxer;

public class Main {
    public static void main(String[] args) {
        Taxer taxer = new Taxer();
        TaxerController taxerController = new TaxerController(taxer);
        taxerController.start();
    }
}
