package Controler;
import Model.Client;
import View.ClientView;

/**
 *This class is the controller for the client and clientView classes client.
 * Use class client.
 * Use class clientView.
 *
 * @author Karina Aguirre.
 */
public class ClientController {
    Client clientModel;
    ClientView clientView;

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
     * This method pass the parameters of the client to client view so that it can display the general information of client.
     *
     * @see Client
     * @see ClientView
     */
    public void clientGeneralInformation(){
        clientView.printMessage(clientView.showGeneralInformationCLient(clientModel.getName(),clientModel.getPhoneNumber(),clientModel.getLocation(),
                clientModel.getAge(),clientModel.getIdentityCard()));
    }
}
