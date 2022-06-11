package Controler;

import Model.Driver;
import View.DriverView;

/**
 * This class is the controller of Driver that will be in charge of the interaction between
 * the Driver and DriverView
 *
 * @author Sebastian Barra
 */

public class DriverController implements Controlable{

    Driver driverModel;
    DriverView driverView;



    /**
     * This is the constructor that receives the model and the view of driver
     *
     * @param driverModel object Driver
     * @param driverView object DriverView
     */

    public DriverController( Driver driverModel, DriverView driverView) {
        this.driverModel = driverModel;
        this.driverView = driverView;
    }


    /**
     * This method is in charge of printing in console the general informarion of driver
     */
    @Override
    public void generalInformation() {
        driverView.title();
        driverView.printMessage(driverView.ShowGeneralInfoDriver(driverModel.getName(), driverModel.getPhoneNumber(), driverModel.getAgeDriver(),
                driverModel.getLicenseNumber(), driverModel.getRacesAmount()));
    }
}
