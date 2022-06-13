package DB;

import Model.Taxi;
import java.util.ArrayList;

/**
 * This class simulates a data base that contains information about the taxis
 *
 * @author LOS TIRADOS
 */

public class Taxis {
    protected ArrayList<Taxi> taxis;

    /**
     * Constructor method that initializes five taxis drivers and add them to a
     * taxi list
     */
    public Taxis() {
        taxis = new ArrayList<>();
        Taxi taxi1 = new Taxi("1234abc", "ToyotaRaptor-2022","Blue", 5,null);
        Taxi taxi2 = new Taxi("1235abc", "Suzuki-2019","Red", 5,null);
        Taxi taxi3 = new Taxi("1236abc", "ToyosaLight-2022", "Yellow", 5,null);
        Taxi taxi4 = new Taxi("1237abc", "Quantum-2022", "Green", 5,null);
        Taxi taxi5 = new Taxi("1238abc", "SuzukiAlto-2009", "Black", 5,null);

        taxis.add(taxi1);
        taxis.add(taxi2);
        taxis.add(taxi3);
        taxis.add(taxi4);
        taxis.add(taxi5);
    }


    /**
     * This method returns a taxi list
     *
     * @return list of taxis
     */
    public ArrayList<Taxi> getTaxis() {
        return taxis;
    }
}
