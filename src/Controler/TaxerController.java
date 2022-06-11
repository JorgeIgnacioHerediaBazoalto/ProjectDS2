package Controler;

import Model.*;
import View.*;

/**
 * This class controls the controllers of the App
 * This class is set to manage the order of the controllers to display the Menu and
 * the execution of the app
 *
 * @author Santiago Caballero
 */
public class TaxerController {
    protected Taxer taxerModel;
    private final TaxerMenuView taxerMenuView;
    protected TaxerView taxerView = new TaxerView();
    protected ClientController clientController;
    protected ClientView clientView = new ClientView();
    private final TaxerRideController taxerRideController;
    protected Client client = new Client();

    /**
     * This is the constructor method of TaxerController and initialize the other controllers
     * The constructor recieves the other controllers to manage and organize them.
     *
     * @param taxerModel it gets the taxerModel to follow MVC
     */
    public TaxerController(Taxer taxerModel) {
        this.taxerModel = taxerModel;
        this.taxerMenuView = new TaxerMenuView();
        this.taxerRideController = new TaxerRideController(taxerModel, taxerView);
        this.clientController = new ClientController(client ,clientView);
    }

    /**
     * This method starts the main method of the menu
     */
    public void startTaxerMenu() {
        taxerModel.setTaxisDriversList();
        taxerMenuView.startMenu();
    }

    /**
     * This method is to start the app asking the personal information of the client
     * the method will start just if the user wants to start the app
     *
     */
    public void askClientInformation() {
        if(taxerMenuView.getIfStart()) {
            clientController.askClientInfo();
            taxerRideController.setClientNameRide(client.getName());
        }
    }
    /**
     * This method is used to start the main function of the app asking for the ride.
     * the method will start just if the user is sure about his or her information.
     *
     */
    public void startTaxerFuntion() {
        if(taxerMenuView.getIfStart() && clientController.getIfSure()) taxerRideController.startApplication();
        //else taxerMenuView.offMessage();
    }

    /**
     * This method is used to ask the necessary information of the client for the ride
     * the method will start just if the user is sure about his or her information.
     *
     */
    /*public void askRiceInfo() {
        if(taxerRideController.getIfOrder()) raceController.askRaceInfo();
    }*/

    /**
     * This is the principal method that starts the app
     */
    public void start() {
        startTaxerMenu();
        askClientInformation();
        startTaxerFuntion();
    }
}
