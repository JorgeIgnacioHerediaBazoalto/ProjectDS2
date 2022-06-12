package Controler;

import Model.Taxi;
import View.TaxiView;

/**
 * This is class Taxi Controller in this layer of design develop interaction with view and model layer
 *
 * @author Jorge Heredia
 */
public class TaxiController implements Controlable{
    Taxi taxiModel;
    TaxiView taxiView;

    /**
     * This is constructor class controller, this need a taxiModel and taxiView.
     * @param taxi Object taxi.
     * @param taxiView printers about taxi.
     */
    public TaxiController(Taxi taxi, TaxiView taxiView) {
        this.taxiModel = taxi;
        this.taxiView = taxiView;
    }

    public void ridesGeneralInformation() {
        taxiView.printRidesInformation(taxiModel.getTaxiTrips());
    }

    /**
     * This method pass the parameters of the taxi to taxi View so that it can display the general information of taxi.
     *
     * @see Taxi
     * @see TaxiView
     */
    @Override
    public void generalInformation() {
        taxiView.title();
        taxiView.printMessage(taxiView.showGeneralInfoTaxi(taxiModel.getNumberPlate(), taxiModel.getCarModel(),
                taxiModel.getCarColor(), taxiModel.getCapacity(),taxiModel.getTaxiTrips().size()));
    }
}
