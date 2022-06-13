package Controler;

import Model.*;
import View.*;

/**
 * This class is to control the messages to ask if the user needs a ride
 * This class sets and sends the information to its view Class to ask the ride information.
 *
 * @author LOS TIRADOS
 */
public class TaxerRideController {
    protected TaxerView taxerRideView;
    protected Taxer taxerModel;
    protected Race race = new Race();
    protected RaceView raceView = new RaceView();
    protected RaceController raceController;
    protected Client client;
    protected TaxiController taxiController;
    protected TaxiView taxiView;


    /**
     * This is the constructor method it initializes the util classes to set,verify and send information to the printer.
     * It receives the view class of taxer to send the messages to order a taxi.
     *
     * @see TaxerView
     * @see Taxer
     * @see Race
     * @see RaceView
     * @see RaceController
     * @see Client
     *
     * @param taxerRideView received to send the messages and information to print.
     */
    public TaxerRideController(Taxer taxerModel, TaxerView taxerRideView) {
        this.taxerRideView = taxerRideView;
        this.raceController = new RaceController(race, raceView);
        this.taxerModel = taxerModel;
        this.client = null;
        this.taxiView = new TaxiView();
    }

    /**
     * Method show general information of the taxi with your trips.
     * @param taxiModel one taxi object model.
     */
    private void taxiGeneralInformation(Taxi taxiModel) {
        taxiController = new TaxiController(taxiModel, taxiView);
        showInfoGeneralOfThing(taxiController);
    }

    /**
     * Method set attributes from race with a taxi available.
     * @param taxiAvailable a taxi available.
     */
    private void setRaceAttributes(Taxi taxiAvailable) {
        String driverName = taxiAvailable.getTaxiDriver().getName();
        raceController.setDriverName(driverName);
        raceController.setRaceDate();
        taxiAvailable.addTaxiTrip(race);
    }

    /**
     * Generate a new race instance.
     */
    private void newRaceInstance() {
        race = new Race();
        raceController = new RaceController(race,raceView);
    }

    /**
     * If the taxi and driver is available, we start a trip, show info general .
     */
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

    /**
     * Method that set the client in race.
     * @param client a client object assigned a race.
     */
    public void setClientRide(Client client) {
        this.client = client;
    }

    /**
     * This method start application when the user say start.
     */
    public void startApplication() {
        while (taxerRideView.getBoolIfOrder()) {
            startApp();
        }
        taxisGeneralInformation();
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
     * This method allows general information of the taxi and race trip.
     *
     * @param taxiAvailable to show the general information of the ride and taxi
     */
    public void showGeneralInfo(Taxi taxiAvailable){
        showInfoGeneralOfThing(raceController);
        taxiGeneralInformation(taxiAvailable);
    }

    private void taxisGeneralInformation() {
        taxerRideView.racesOfTaxisPrintMessage();
        for (Taxi taxi:taxerModel.getTaxisWithDriver()) {
            taxiController = new TaxiController(taxi,taxiView);
            showInfoGeneralOfThing(taxiController);
            taxiController.ridesGeneralInformation();
        };
    }

    /**
     * This method allows general information of the controllers with information that can be shown
     * <p>
     *     "Thing" refers to any controller that have implemented class Controllable.
     *     Implement Controllable when the controller with its model and view has general information to print
     * </p>
     * @param controllable any class implement Controllable
     */
    public void showInfoGeneralOfThing(Controllable controllable){
        controllable.generalInformation();
    }
}
