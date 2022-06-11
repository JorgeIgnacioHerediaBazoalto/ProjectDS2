package Controler;

import Model.Race;
import Utils.ValuesRequester;
import View.RaceView;
/**
 * This class is responsible for communicating the Race and Raceview classes.
 *
 * @author Denis Jorge Gandarillas Delgado
 */

public class RaceController {


    private final Race race;
    private final RaceView raceView;
    protected ValuesRequester valuesRequester;
    protected String orderAnswer;
    protected boolean order;

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
        raceView.printAskTheStartPoint();
        String startPoint = valuesRequester.askLocation();
        setRaceStartPoint(startPoint);
    }

    public void askArrivePoint() {
        raceView.printAskTheArrivetPoint();
        String arrivePoint = valuesRequester.askLocation();
        setRaceArrivePoint(arrivePoint);
    }

    public void askPassangers() {
        raceView.printAskTheNUmberOfPassangers();
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
        raceView.printLoadStyle();
    }

    public void askInfo() {
        askStartPoint();
        askArrivePoint();
        askPassangers();
        raceActualData();
        askIfSureOfInformation();
        sureOfInformation();
    }

    /**
     * Method in charge of printing the information inside the console.
     *
     * @see Race
     * @see RaceView
     */

    public void raceInformation(){
        raceView.printTheGeneralInformationOfRace();
        raceView.printMessage(raceView.showInformationRace(race.getNameDriver(), race.getNameClient(), race.getCost(),
                race.getStartingPoint(), race.getArrivalPoint(), race.getPassengerCount(), race.getDateTime()));
    }

    public void raceActualData() {
        raceView.printerTheInformationOfRace();
        raceView.showRaceData(race.getCost(),race.getStartingPoint(),race.getArrivalPoint(),race.getPassengerCount());
    }
}