package Controler;

import Model.Race;
import Utils.ValuesRequester;
import View.RaceView;
/**
 * This class is responsible for communicating the Race and Raceview classes.
 *
 * @author Denis Jorge Gandarillas Delgado
 */

public class RaceController implements Controlable{


    private final Race race;
    private final RaceView raceView;
    protected ValuesRequester valuesRequester;
    protected String orderAnswer;
    protected boolean order;
    private String currency;

    /**
     * RaceController class constructor method
     *
     * @param race Object of the Race class.
     * @param raceView Class in charge of printing the information.
     */

    public RaceController(Race race, RaceView raceView) {
        this.race = race;
        this.raceView = raceView;
        this.valuesRequester = new ValuesRequester();
        this.currency = null;
    }

    public void setClientName(String clientName) {
        race.setNameClient(clientName);
    }
    public void setRaceStartPoint(String startingPoint) {
        race.setStartingPoint(startingPoint);
    }
    public void setRaceArrivePoint(String arrivalPoint) {
        race.setArrivalPoint(arrivalPoint);
    }
    public void setRacePassangers(int passangers) {
        race.setPassengerCount(passangers);
    }

    public void setDriverName(String driverName) {
        race.setNameDriver(driverName);
    }

    public void setRaceDate() {
        race.setDateTime();
    }

    public void setCurrency(String currency) { this.currency = currency;}

    public void askStartPoint() {
        raceView.printAskTheStartPoint();
        String startPoint = valuesRequester.askLocation();
        setRaceStartPoint(startPoint);
    }

    public void askArrivePoint() {
        raceView.printAskTheArrivalPoint();
        String arrivePoint = valuesRequester.askLocation();
        setRaceArrivePoint(arrivePoint);
    }

    public void askPassangers() {
        raceView.printAskTheNUmberOfPassengers();
        int passangers = valuesRequester.askIntValue();
        setRacePassangers(passangers);
    }


    public void askIfSureOfInformation() {
        raceView.printIfTheAboutInformation();
        orderAnswer = valuesRequester.askTwoOptionString("Yes","No");
    }

    public boolean sureOfInformation() {
        order = (orderAnswer.equalsIgnoreCase("Yes"));
        return order;
    }

    public void askRaceInfo() {
        while (!order) {
            askInfo();
        }
        order = false;
        raceView.printLookingTaxi();
    }

    public void askInfo() {
        askStartPoint();
        askArrivePoint();
        askPassangers();
        racePartialInformation();
        askIfSureOfInformation();
        sureOfInformation();
    }

    public void racePartialInformation() {
        raceView.printerTheInformationOfRace();
        race.setCost();
        raceView.showRaceData(race.getCost(),race.getStartingPoint(),race.getArrivalPoint(),race.getPassengerCount(), currency);
    }

    /**
     * Method in charge of printing the information inside the console.
     *
     * @see Race
     * @see RaceView
     */
    @Override
    public void generalInformation() {
        raceView.title();
        raceView.printMessage(raceView.showInformationRace(race.getNameDriver(), race.getNameClient(), race.getCost(),
                race.getStartingPoint(), race.getArrivalPoint(), race.getPassengerCount(), race.getDateTime(), currency));
    }
}