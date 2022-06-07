package Controler;

import Model.Race;
import View.RaceView;
/**
 * This class is responsible for communicating the Race and Raceview classes.
 *
 * @author Denis Jorge Gandarillas Delgado
 */

public class RaceController {

    Race race;
    RaceView raceView;

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
     * Method in charge of printing the information inside the console.
     *
     * @see Race
     * @see RaceView
     */

    public void raceInformation(){
        raceView.printMessage(raceView.showInformationRace(race.getNameDriver(), race.getNameClient(), race.getCost(), race.getStartingPoint(), race.getArrivalPoint(), race.getPassengerCount(), race.getDateTime()));
    }

}