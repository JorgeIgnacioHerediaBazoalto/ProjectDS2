package Taxer;

import Controler.ClientController;
import Controler.RaceController;
import Model.Client;
import Model.Race;
import View.ClientView;
import View.RaceView;

/**
 * This class controls the controllers of the App
 * This class is set to manage the order of the controllers to display the Menu and
 * the execution of the app
 *
 * @author Santiago Caballero
 */
public class TaxerController {
    protected Taxer taxerModel;
    private final TaxerMenuController taxerMenuController;
    protected TaxerView taxerView = new TaxerView();
    protected ClientController clientController;
    protected ClientView clientView = new ClientView();
    private final TaxerRideController taxerRideController;
    protected Client client = new Client();
    protected Race race = new Race();
    protected RaceView raceView = new RaceView();
    protected RaceController raceController;

    /**
     * This is the constructor method of TaxerController and initialize the other controllers
     * The constructor recieves the other controllers to manage and organize them.
     *
     * @param taxerModel it gets the taxerModel to follow MVC
     */
    public TaxerController(Taxer taxerModel) {
        this.taxerModel = taxerModel;
        this.taxerMenuController = new TaxerMenuController(taxerView);
        this.taxerRideController = new TaxerRideController(taxerView);
        this.raceController = new RaceController(race, raceView);
        this.clientController = new ClientController(client ,clientView);
    }

    /**
     * This method starts the main method of the menu
     */
    public void startTaxerMenu() {
        taxerMenuController.startMenu();
    }

    /**
     * This method is to start the app asking the personal information of the client
     * the method will start just if the user wants to start the app
     *
     */
    public void askClientInformation() {
        if(taxerMenuController.getIfStart()) clientController.askClientInfo();
    }
    /**
     * This method is used to start the main function of the app asking for the ride.
     * the method will start just if the user is sure about his or her information.
     *
     */
    public void startTaxerFuntion() {
        if(clientController.getIfSure()) taxerRideController.startApp();
    }
    /**
     * This method is used to ask the necessary information of the client for the ride
     * the method will start just if the user is sure about his or her information.
     *
     */
    public void askRiceInfo() {
        if(taxerRideController.getIfOrder()) raceController.askRaceInfo();
    }

    /**
     * This is the principal method that starts the app
     */
    public void start() {
        startTaxerMenu();
        askClientInformation();
        startTaxerFuntion();
        askRiceInfo();
    }
}
