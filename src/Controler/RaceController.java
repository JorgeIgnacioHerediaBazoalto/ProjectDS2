package Controler;

import Model.Race;
import View.RaceView;
/**
 * This class is responsible for communicating the Race and RaceView classes.
 *
 * @author LOS TIRADOS
 */

public class RaceController implements Controllable {


    private final Race race;
    private final RaceView raceView;

    /**
     * RaceController class constructor method
     *
     * @param race Object of the Race class.
     * @param raceView Class in charge of printing the information.
     */
    public RaceController(Race race, RaceView raceView) {
        this.race = race;
        this.raceView = raceView;
    }

    /**
     * Method that set the name from the client in race.
     *
     * @param clientName name client in race information.
     */
    public void setClientName(String clientName) {
        race.setNameClient(clientName);
    }

    /**
     * Method that set the start point from the race.
     * @param startingPoint start point or the place where the customer will be picked up.
     */
    public void setRaceStartPoint(String startingPoint) {
        race.setStartingPoint(startingPoint);
    }

    /**
     * Method that set the Arrival point from the race.
     *
     * @param arrivalPoint point where dropped off customer
     */
    public void setRaceArrivePoint(String arrivalPoint) {
        race.setArrivalPoint(arrivalPoint);
    }

    /**
     * Method that set the number of passengers from the race.
     *
     * @param passengers number of passengers.
     */
    public void setRacePassengers(int passengers) {
        race.setPassengerCount(passengers);
    }

    /**
     * Method that set the driver name from the race.
     * @param driverName name of the driver assigned to this race.
     */
    public void setDriverName(String driverName) {
        race.setNameDriver(driverName);
    }

    /**
     * Method that set the date and time from the race.
     */
    public void setRaceDate() {
        race.setDateTime();
    }

    /**
     * Method that ask user about the start point.
     */
    public void askStartPoint() {
        String startPoint = raceView.printAskTheStartPoint();
        setRaceStartPoint(startPoint);
    }

    /**
     * Method that ask user about the arrival point.
     */
    public void askArrivePoint() {
        String arrivePoint = raceView.printAskTheArrivalPoint();
        setRaceArrivePoint(arrivePoint);
    }

    /**
     * Method that ask user about number of passengers.
     */
    public void askPassengers() {
        int passengers = raceView.printAskTheNUmberOfPassengers();
        setRacePassengers(passengers);
    }

    /**
     * If user want a race we ask the info, after set order taxi to false.
     *
     * raceView.printLookingTaxi(); print standby message.
     */
    public void askRaceInfo() {
        while (!raceView.getSureOfRide()) {
            askInfo();
        }
        raceView.setOrderRide(false);
        raceView.printLookingTaxi();
    }

    /**
     * Method asked all info from the race.
     */
    public void askInfo() {
        askStartPoint();
        askArrivePoint();
        askPassengers();
        racePartialInformation();
        raceView.askIfSureOfInformation();
        raceView.sureOfInformation();
    }

    /**
     * This method passes you partial trip information to ask if you are sure you are sure.
     */
    public void racePartialInformation() {
        raceView.printerTheInformationOfRace();
        race.setCost();
        raceView.showRaceData(race.getCost(),race.getStartingPoint(),
                race.getArrivalPoint(),race.getPassengerCount(), race.getCurrency());
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
                race.getStartingPoint(), race.getArrivalPoint(), race.getPassengerCount(), race.getDateTime(), race.getCurrency()));
    }
}