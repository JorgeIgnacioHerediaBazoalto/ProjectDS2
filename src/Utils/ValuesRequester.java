package Utils;
import java.util.Scanner;

/**
 * This class is used to request values to the user.
 * The class has methods to ask the user introduce different methods.
 *
 * @author Santiago Caballero.
 */
public class ValuesRequester {
    private final Scanner input;
    private final Validator validator;
    private final Printer printer;

    /**
     * Class constructor.
     * It will instance the Scanner, Validator and Printer.
     *
     * @see Scanner
     * @see Validator
     * @see Printer
     */
    public ValuesRequester(){
        input = new Scanner(System.in);
        validator = new Validator();
        printer = new Printer();
    }

    /**
     * Method to ask int values to the user.
     * The method will request the user to introduce a number using the method verifyInt to validate that
     * the value is correct.
     *
     * @return the value introduced by the user parsed in an int value.
     */
    public int askIntValue(){
        String numberInString = input.next();
        while (!validator.verifyInt(numberInString)){
            printer.printMessage("Introduce a valid number: ","red");
            numberInString = input.next();
        }
        return Integer.parseInt(numberInString);
    }

    /**
     * method that asks the user for the number of passengers verifying that the value entered is not greater than 5.
     *
     * @param quantity total number of passengers admitted by the client.
     * @return a quantity not exceeding 5.
     */
    public int askIntPassengers(int quantity){
        while(!validator.verifyQuantity(quantity)){
            printer.printMessage("Only up to five passengers are allowed!, try again: ","red");
            quantity = askIntValue();
        }
        return quantity;
    }


    /**
     * Method to ask the user a string value validating it.
     * It will ask the user to introduce a string value.
     *
     * @return the value introduced by the user.
     */
    public String askStringValue(){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            printer.printMessage("Introduce valid letters: ","red");
            scanner = new Scanner(System.in);
            scanner.hasNextInt();
        }
        return scanner.nextLine();
    }

    /**
     * Method where the user enters his name and is validated.
     * 
     * It will validate if the user simply entered letters, which are validated by regular expressions.
     * 
     * @return the name entered
     */

    public String askName(){
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        while (!validator.verifyName(name)) {
            printer.printMessage("Introduce valid letters: ","red");
            scanner = new Scanner(System.in);
            name = scanner.nextLine();
        }
        return name;
    }

    /**
     * Method in which the user enters his location and is validated.
     * 
     * It will only accept letters and numbers, which are validated by regular expressions.
     * 
     * @return
     */

    public String askLocation(){
        Scanner scanner = new Scanner(System.in);
        String location = scanner.nextLine();
        while (!validator.verifyLocation(location)) {
            printer.printMessage("Introduce valid letters and numbers: ","red");
            scanner = new Scanner(System.in);
            location = scanner.nextLine();
        }
        return location;
    }

    /**
     * Method to prompt the user for a string value equal to the expected values.
     * This method is used to ask user to introduce one of two options required.
     *
     * @param expectedOption1 This parameter is used to convert it to an expected value.
     * @param expectedOption2 This parameter is used to convert it to another expected value.
     * @return the value introduced by the user.
     */
    public String askTwoOptionString(String expectedOption1, String expectedOption2){
        String valueIntroduced = input.next();
        while (!validator.validateTwoStrings(expectedOption1, expectedOption2, valueIntroduced)){
            printer.printMessage("Please enter a correct value (Yes/No): ","red");
            valueIntroduced = input.next();
        }

        return valueIntroduced;
    }
}
