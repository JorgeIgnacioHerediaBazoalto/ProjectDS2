package Controller;
import Model.Client;
import View.ClientView;

/**
 *This class is the controller for the client and clientView classes client.
 * Use class client.
 * Use class clientView.
 *
 * @author LOS TIRADOS.
 */
public class ClientController implements Controllable {
    private final Client clientModel;
    private final ClientView clientView;

    /**
     * This is the constructor of the class ClientController.
     *
     * @param clientModel object client.
     * @param clientView print the information of client.
     */
    public ClientController(Client clientModel, ClientView clientView){
        this.clientModel = clientModel;
        this.clientView = clientView;
    }

    /**
     * Method that set the name from the client.
     *
     * @param name the name from the client.
     */
    public void setClientName(String name) {
        clientModel.setName(name);
    }

    /**
     * Method that set the location from the client.
     *
     * @param location the location from the client.
     */
    public void setClientLocation(String location) {
        clientModel.setLocation(location);
    }

    /**
     * Method that set the number phone from the client.
     *
     * @param phone the number phone from the client.
     */
    public void setClientPhone(int phone) {
        clientModel.setPhoneNumber(phone);
    }


    /**
     * This method ask the name from the client.
     */
    public void askClientName() {
        String name = clientView.printAskTheNameClient();
        setClientName(name);
    }

    /**
     * This method ask the location from the client.
     */
    public void askClientLocation() {
        String location = clientView.printAskTheLocationClient();
        setClientLocation(location);
    }

    /**
     * This method ask the number phone from the client.
     */
    public void askClientPhone() {
        int phoneNumber = clientView.printAskThePhoneClient();
        setClientPhone(phoneNumber);
    }


    /**
     * This method ask the information again in case the answer is no.
     */
    public void askClientInfo() {
        while (!clientView.getIfSureBool()) {
            askInfo();
        }
    }

    /**
     * This method gets the all information from the client.
     */
    public void askInfo() {
        askClientName();
        askClientLocation();
        askClientPhone();
        generalInformation();
        clientView.askIfSure();
        clientView.getIfSure();
    }


    /**
     * This method pass the parameters of the client to client view so that it can display the general information of client.
     *
     * @see Client
     * @see ClientView
     */
    @Override
    public void generalInformation() {
        clientView.title();
        clientView.printMessage(clientView.showGeneralInformationClient(clientModel.getName(),
                clientModel.getPhoneNumber(),clientModel.getLocation()));
    }
}
