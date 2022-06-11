package Controler;

import Model.Race;
import Model.Taxer;
import Model.Taxi;
import Utils.*;
import View.*;

/**
 * This class is to control the messages to ask if the user needs a ride
 * This class sets and sends the information to its view Class to ask the ride information.
 *
 * @author Santiago Caballero
 */
public class TaxerRideController {
    private final ValuesRequester valuesRequester;
    private String taxiRequestAnswer;
    protected Colors colors;
    protected TaxerView taxerRideView;
    protected Taxer taxerModel;

    protected Race race = new Race();
    protected RaceView raceView = new RaceView();
    protected RaceController raceController;
    protected boolean ifOrder;

    /**
     * This is the constructor method it initializes the util classes to set,verify and send information to the printer.
     * It recieves the view class of taxer to send the messages to order a taxi.
     *
     * @param taxerRideView received to send the messages and information to print.
     */
    public TaxerRideController(Taxer taxerModel, TaxerView taxerRideView) {
        this.valuesRequester = new ValuesRequester();
        this.colors = new Colors();
        this.taxerRideView = taxerRideView;
        this.raceController = new RaceController(race, raceView);
        this.taxerModel = taxerModel;
        this.ifOrder = true;
        raceController.setCurrency(taxerModel.getCurrency());
    }

    /**
     * Method to set a message at the beginning just to give style to our app
     */
    private void setAppStartMessage() {
        taxerRideView.printLoading();
        taxerRideView.printMessage(colors.BLUE_BOLD_BRIGHT+"\n--------- "+colors.RESET+
                colors.WHITE_BOLD_BRIGHT+"TAXER"+colors.RESET+
                colors.BLUE_BOLD_BRIGHT+" ---------"+colors.RESET+"\n",true);
    }

    /**
     * Method to ask if the user is sure or not to order a taxi
     */
    private void askIfOrder() {
        taxerRideView.printMessage("\nDo you want to order a Taxi?: ", colors.WHITE_BOLD_BRIGHT);
        taxiRequestAnswer = valuesRequester.askTwoOptionString("Yes","No");
    }

    public void lookTaxiAvailable() {
        taxerModel.startLookingTaxi();
    }

    public void taxiAvailable() {
        taxerRideView.printMessage("There are taxis available");
    }

    public void instanceTaxiController(Taxi taxiModel) {
        TaxiView taxiView = new TaxiView();
        TaxiController taxiController = new TaxiController(taxiModel, taxiView);
        showInfoGeneralOfThing(taxiController);
    }

    private void setRaceAttributes(Taxi taxiAvailable) {
        String driverName = taxiAvailable.getTaxiDriver().getName();
        raceController.setDriverName(driverName);
        raceController.setRaceDate();
        taxiAvailable.addTaxiTrip(race);
    }

    private void startTripIfAvailable() {
        if (taxerModel.getTaxisAvailable().size() > 0) {
            Taxi taxiAvailable = taxerModel.getTaxisAvailable().get(0);
            setRaceAttributes(taxiAvailable);
            taxerRideView.printMessage("\n A taxi available is starting the ride \n");
            showInfoGeneralOfThing(raceController);
            instanceTaxiController(taxiAvailable);
        }
        else {
            taxerRideView.printMessage("\nThere aren't taxis available for the moment\n");
        }
    }

    public void setClientNameRide(String clientName) {
        raceController.setClientName(clientName);
    }

    /**
     * this method verify if the answer given is Yes or no
     * If the answer is "no" the program will end showing an end message
     *
     * @return true if the taxiRequestAnswer is yes
     */
    public boolean getIfOrder() {
        if (taxiRequestAnswer.equalsIgnoreCase("Yes")) {
            ifOrder = true;
        }
        else {
            endMessage();
            ifOrder = false;
        }
        return ifOrder;
    }

    public void startApplication() {
        while (ifOrder) {
            taxerModel.addIteration();
            startApp();
        }
        taxerRideView.printMessage("\nThanks for using the app");
    }
    /**
     * This method sets an end message
     */
    private void endMessage() {
        taxerRideView.printMessage(colors.BLUE_BOLD_BRIGHT+"\n ----"+
                colors.WHITE_BOLD_BRIGHT+ "Ok come back when you need a taxi"
                +colors.BLUE_BOLD_BRIGHT+ "----"+colors.RESET);
    }
    /**
     * This is the principal method of the class that start asking for order a taxi.
     */
    private void startApp() {
        setAppStartMessage();
        raceController.askRaceInfo();
        taxerModel.startLookingTaxi();
        startTripIfAvailable();
        askIfOrder();
        getIfOrder();
    }

    /**
     * This method allows general information of the controllers with information that can be shown
     * <p>
     *     "Thing" refers to any controller that have implemented class Controlable.
     *     Implement Controlable when the controller with its model and view has general information to print
     * </p>
     * @param controlable any class implement Controlable
     */
    public void showInfoGeneralOfThing(Controlable controlable){
        controlable.generalInformation();
    }
}
