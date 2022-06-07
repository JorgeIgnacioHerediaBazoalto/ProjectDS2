package View;
import Utils.Printer;

/**
 * This class print the information about the client.
 * Use Printer of the Utils package.
 *
 * @author Karina Aguirre.
 */
public class ClientView {
    Printer printer = new Printer();

    /**
     * his method prints in console the message that will be entered in message.
     *
     * @param message client information.
     */
    public void printMessage(String message) {
        printer.printMessage(message);
    }

    /**
     * This method creates a String about the information of client for print.
     *
     * @param name the name of client.
     * @param phoneNumber the phone number of client.
     * @param location the location of client.
     * @param age the age of client.
     * @param identityCard the identity card of client.
     * @return client information.
     */
    public String showGeneralInformationCLient (String name, int phoneNumber, String location, int age, int identityCard){
        return ("Client name: "+name + "\nPhone Number: " + phoneNumber + "\nLocation: " + location +
                "\nAge: " + age + "\n Identity Card: " + identityCard );
    }
}
