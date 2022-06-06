package Controler;

import Model.Taxi;
import View.TaxiView;

/**
 * This is class Taxi Controller in this layer of design develop interaction with view and model layer
 *
 * @author Jorge Heredia
 */
public class TaxiController {
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

    /**
     * This method pass the parameters of the taxi to taxi View so that it can display the general information of taxi.
     *
     * @see Taxi
     * @see TaxiView
     */
    public void taxiGeneralInfo() {
        taxiView.printMessage(taxiView.showGeneralInfoTaxi(taxiModel.getNumberPlate(), taxiModel.getCarColor(), taxiModel.getCarModel(), taxiModel.getCapacity()));
    }

    /**
     * This method pass the parameters of the taxi to taxi View so that it can display the availability information of car.
     *
     * @see Taxi
     * @see TaxiView
     */
    public void taxiIsDisponible() {
        taxiView.printMessage(taxiView.showIsAvailable(taxiModel.getNumberPlate(), taxiModel.isAvailability()));
    }
}
