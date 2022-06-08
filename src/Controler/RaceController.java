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
    public void setRaceStartPoint(String startingPoint) {
        race.setStartingPoint(startingPoint);
    }
    public void setRaceArrivePoint(String arrivalPoint) {
        race.setArrivalPoint(arrivalPoint);
    }
    public void setRacePassangers(int passangers) {
        race.setPassengerCount(passangers);
    }

    public void askStartPoint() {
        raceView.printMessage("Enter your start point please: ");
        String startPoint = valuesRequester.askStringValue();
        setRaceStartPoint(startPoint);
    }

    public void askArrivePoint() {
        raceView.printMessage("Enter your arrive point please: ");
        String arrivePoint = valuesRequester.askStringValue();
        setRaceArrivePoint(arrivePoint);
    }

    public void askPassangers() {
        raceView.printMessage("Enter the number of passangers please: ");
        int passangers = valuesRequester.askIntValue();
        setRacePassangers(passangers);
    }


    public void askIfOrder() {
        raceView.printMessage("\nAre you sure about this information?");
        orderAnswer = valuesRequester.askTwoOptionString("Yes","No");
    }

    public boolean getIfOrder() {
        order = (orderAnswer.equalsIgnoreCase("Yes"));
        return order;
    }

    public void askRaceInfo() {
        while (!order) {
            askInfo();
        }
    }

    public void askInfo() {
        askStartPoint();
        askArrivePoint();
        askPassangers();
        askIfOrder();
        getIfOrder();
    }

    /**
     * Method in charge of printing the information inside the console.
     *
     * @see Race
     * @see RaceView
     */

    public void raceInformation(){
        raceView.printMessage(raceView.showInformationRace(race.getNameDriver(), race.getNameClient(), race.getCost(), race.getStartingPoint(), race.getArrivalPoint(), race.getPassengerCount(), race.getDateTime()));
    }
}