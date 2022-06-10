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
        Taxi taxi1 = new Taxi("1234abc", "ToyotaRaptor-2022", colors.BLUE_BOLD_BRIGHT+"Blue", 5,null);
        Taxi taxi2 = new Taxi("1235abc", "ToyotaRaptor-2022", colors.RED_BOLD_BRIGHT+"Red", 5,null);
        Taxi taxi3 = new Taxi("1236abc", "ToyotaRaptor-2022", colors.YELLOW_BOLD_BRIGHT+"Yellow", 5,null);
        Taxi taxi4 = new Taxi("1237abc", "ToyotaRaptor-2022", colors.GREEN_BOLD_BRIGHT+"Green", 5,null);
        Taxi taxi5 = new Taxi("1238abc", "ToyotaRaptor-2022", colors.BLACK_BOLD_BRIGHT+"Black", 5,null);

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
