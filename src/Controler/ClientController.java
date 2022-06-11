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
public class ClientController implements Controlable{
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
        clientView.printAskTheNameClient();
        String name = valuesRequester.askStringValue();
        setClientName(name);
    }

    /**
     * This method ask the location from the client.
     */
    public void askClientLocation() {
        clientView.printAskTheLocationClient();
        String location = valuesRequester.askStringValue();
        setClientLocation(location);
    }

    /**
     * This method ask the number phone from the client.
     */
    public void askClientPhone() {
        clientView.printAskThePhoneClient();
        int phone = valuesRequester.askIntValue();
        setClientPhone(phone);
    }

    /**
     * This method ask if the entered information is sure.
     * The answer is yes or no.
     */
    public void askIfSure() {
        clientView.printIfTheAboutInformation();
        sureAnswer = valuesRequester.askTwoOptionString("Yes","No");
    }

    /**
     * Method that get if sure when the answer is yes.
     *
     * @return isSure
     */
    public boolean getIfSure() {
        isSure = (sureAnswer.equalsIgnoreCase("Yes"));
        return isSure;
    }

    /**
     * This method ask the information again in case the answer is no.
     */
    public void askClientInfo() {
        while (!isSure) {
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
        askIfSure();
        getIfSure();
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
