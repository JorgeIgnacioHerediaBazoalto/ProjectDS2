package Controler;
import Model.Client;
import Utils.ValuesRequester;
import View.ClientView;

/**
 *This class is the controller for the client and clientView classes client.
 * Use class client.
 * Use class clientView.
 *
 * @author Karina Aguirre.
 */
public class ClientController {
    private final Client clientModel;
    private final ClientView clientView;
    protected ValuesRequester valuesRequester;
    private String sureAnswer;
    private boolean isSure;

    /**
     * This is the constructor of the class ClientController.
     *
     * @param clientModel object client.
     * @param clientView print the information of client.
     */
    public ClientController(Client clientModel, ClientView clientView){
        this.clientModel = clientModel;
        this.clientView = clientView;
        this.valuesRequester = new ValuesRequester();
    }

    public void setClientName(String name) {
        clientModel.setName(name);
    }
    public void setClientLocation(String location) {
        clientModel.setLocation(location);
    }
    public void setClientPhone(int phone) {
        clientModel.setPhoneNumber(phone);
    }


    public void askClientName() {
        clientView.printMessage("Enter your name please: ");
        String name = valuesRequester.askStringValue();
        setClientName(name);
    }

    public void askClientLocation() {
        clientView.printMessage("Enter your home location please: ");
        String location = valuesRequester.askStringValue();
        setClientLocation(location);
    }

    public void askClientPhone() {
        clientView.printMessage("Enter your phone number please: ");
        int phone = valuesRequester.askIntValue();
        setClientPhone(phone);
    }

    public void askIfSure() {
        clientView.printMessage("\nAre you sure about your information?");
        sureAnswer = valuesRequester.askTwoOptionString("Yes","No");
    }

    public boolean getIfSure() {
        isSure = (sureAnswer.equalsIgnoreCase("Yes"));
        return isSure;
    }

    public void askClientInfo() {
        while (!isSure) {
            askInfo();
        }
    }

    public void askInfo() {
        askClientName();
        askClientLocation();
        askClientPhone();
        clientGeneralInformation();
        askIfSure();
        getIfSure();
    }


    /**
     * This method pass the parameters of the client to client view so that it can display the general information of client.
     *
     * @see Client
     * @see ClientView
     */
    public void clientGeneralInformation(){
        clientView.printMessage("");
        clientView.printMessage(clientView.showGeneralInformationCLient(clientModel.getName(),
                clientModel.getPhoneNumber(),clientModel.getLocation()));
    }
}
