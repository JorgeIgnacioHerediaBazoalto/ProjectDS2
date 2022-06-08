package DB;

import Model.Taxi;

import java.util.ArrayList;
import java.util.List;

public class Taxis {
    protected List<Taxi> taxis;
    public Taxis() {
        taxis = new ArrayList<>();
        Taxi taxi1 = new Taxi("1234abc", "ToyotaRaptor-2022", "Blue", 5,null);
        Taxi taxi2 = new Taxi("1235abc", "ToyotaRaptor-2022", "Red", 5,null);
        Taxi taxi3 = new Taxi("1236abc", "ToyotaRaptor-2022", "Yellow", 5,null);
        Taxi taxi4 = new Taxi("1237abc", "ToyotaRaptor-2022", "Green", 5,null);
        Taxi taxi5 = new Taxi("1238abc", "ToyotaRaptor-2022", "Black", 5,null);

        taxis = List.of(taxi1,taxi2,taxi3,taxi4,taxi5);
    }

    public List<Taxi> getTaxis() {
        return taxis;
    }
}
