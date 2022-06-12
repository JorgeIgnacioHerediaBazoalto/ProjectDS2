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

    public void askStartPoint() {
        String startPoint = raceView.printAskTheStartPoint();
        setRaceStartPoint(startPoint);
    }

    public void askArrivePoint() {
        String arrivePoint = raceView.printAskTheArrivalPoint();
        setRaceArrivePoint(arrivePoint);
    }

    public void askPassangers() {
        int passangers = raceView.printAskTheNUmberOfPassengers();
        setRacePassangers(passangers);
    }

    public void askRaceInfo() {
        while (!raceView.getOrderRide()) {
            askInfo();
        }
        raceView.setOrderRide(false);
        raceView.printLookingTaxi();
    }

    public void askInfo() {
        askStartPoint();
        askArrivePoint();
        askPassangers();
        racePartialInformation();
        raceView.askIfSureOfInformation();
        raceView.sureOfInformation();
    }

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