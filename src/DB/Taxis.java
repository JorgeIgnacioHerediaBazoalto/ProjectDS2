package DB;

import Model.Taxi;

import java.util.ArrayList;
import java.util.List;
import Utils.Colors;

public class Taxis {
    protected Colors colors =new Colors();
    protected ArrayList<Taxi> taxis;
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

    public ArrayList<Taxi> getTaxis() {
        return taxis;
    }
}
