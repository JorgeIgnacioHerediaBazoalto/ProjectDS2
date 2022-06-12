package Controler;

import Model.*;
import View.*;

/**
 * This class is to control the messages to ask if the user needs a ride
 * This class sets and sends the information to its view Class to ask the ride information.
 *
 * @author Santiago Caballero
 */
public class TaxerRideController {
    protected TaxerView taxerRideView;
    protected Taxer taxerModel;
    protected Race race = new Race();
    protected RaceView raceView = new RaceView();
    protected RaceController raceController;
    protected Client client;

    /**
     * This is the constructor method it initializes the util classes to set,verify and send information to the printer.
     * It recieves the view class of taxer to send the messages to order a taxi.
     *
     * @param taxerRideView received to send the messages and information to print.
     */
    public TaxerRideController(Taxer taxerModel, TaxerView taxerRideView) {
        this.taxerRideView = taxerRideView;
        this.raceController = new RaceController(race, raceView);
        this.taxerModel = taxerModel;
        this.client = null;
    }


    private void taxiGeneralInformation(Taxi taxiModel) {
        TaxiView taxiView = new TaxiView();
        TaxiController taxiController = new TaxiController(taxiModel, taxiView);
        taxiController.generalInformation();
        taxiController.ridesGeneralInformation();
    }

    private void setRaceAttributes(Taxi taxiAvailable) {
        String driverName = taxiAvailable.getTaxiDriver().getName();
        raceController.setDriverName(driverName);
        raceController.setRaceDate();
        taxiAvailable.addTaxiTrip(race);;
    }

    private void newRaceInstance() {
        race = new Race();
        raceController = new RaceController(race,raceView);
    }

    private void startTripIfAvailable() {
        if (taxerModel.getTaxisAvailable().size() > 0) {
            Taxi taxiAvailable = taxerModel.getTaxisAvailable().get(taxerModel.getTaxisAvailable().size()-1);
            setRaceAttributes(taxiAvailable);
            taxerRideView.taxiAvaliableMessage();
            showGeneralInfo(taxiAvailable);
            newRaceInstance();
        }
        else {
            taxerRideView.taxiNotAvailableMessage();
        }
    }

    public void setClientNameRide(Client client) {
        this.client = client;
    }

    public void startApplication() {
        while (taxerRideView.getBoolIfOrder()) {
            startApp();
        }
        taxerRideView.thanksMessage();
    }
    /**
     * This is the principal method of the class that start asking for order a taxi.
     */
    private void startApp() {
        taxerRideView.title();
        taxerModel.addIteration();
        raceController.setClientName(client.getName());
        raceController.askRaceInfo();
        taxerModel.startLookingTaxi();
        startTripIfAvailable();
        taxerRideView.askIfOrder();
        taxerRideView.getIfOrder();
    }

    /**
     * This method allows general information of the controllers with information that can be shown
     * <p>
     *     Implement Controlable when the controller with its model and view has general information to print
     * </p>
     * @param taxiAvailable to show the general information of the ride and taxi
     */
    public void showGeneralInfo(Taxi taxiAvailable){
        raceController.generalInformation();
        taxiGeneralInformation(taxiAvailable);
    }
}
