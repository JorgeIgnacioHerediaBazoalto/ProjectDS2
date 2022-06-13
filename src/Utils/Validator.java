package Utils;


/**
 * This class will be used to validate values
 * It contains two methods which will be called to validate the value in a specific case
 *
 * @author LOS TIRADOS
 */
public class Validator {

    private final RegularExpression regularExpression;

    public Validator(){
        regularExpression = new RegularExpression();
    }

    /**
     * Method to verify an int value introduced by the user.
     * It will verify if the value introduced by the user can be parsed in an int with a try and catch.
     *
     * @param numberInString is a String introduced by the user which will be verified if it's a number.
     * @return true if the String can be parsed in an int value and false if not.
     */
    public boolean verifyInt(String numberInString) {
        boolean isCorrect;
        try {
            Integer.parseInt(numberInString);
            isCorrect = true;
        }
        catch (NumberFormatException e) {
            isCorrect = false;
        }
        return isCorrect;
    }

    /**
     * this method verifies that the number of passengers entering is no more than 5.
     *
     * @param quantity total passangers
     * @return a signal that indicates whether or not the 5 passengers pass or not
     */
    public boolean verifyQuantity(int quantity){
        return (quantity < 5 && quantity > 0);
    }

    /**
     * This method helps to validate the user's response.
     * 
     * Helps to validate if the user did not enter a strange character or number.
     * 
     * @param name Name entered by the user.
     * @return true in case everything is correct and false when you enter a rare character or number.
     */

    public boolean verifyName(String name){
        return !regularExpression.validateNumbers(name) && !regularExpression.validateSymbols(name);

    }

    /**
     * This method helps to validate the user's response.
     * 
     * Helps to validate that the user has not entered any strange characters when entering their location.
     * 
     * @param location The location entered by the user.
     * @return true when the rule is satisfied and false when it has strange characters.
     */

    public boolean verifyLocation(String location){

        return !regularExpression.validateSymbols(location);

    }

    /**
     * Method to validate if a string is equals to one of the required answers.
     * It will validate if the user answer is one of the two required answers.
     *
     * @param correctAnswer1 the first correct option.
     * @param correctAnswer2 the second correct option.
     * @param answer the value introduced by the user.
     * @return true if the user answer is equals to one of the two options.
     */
    public boolean validateTwoStrings(String correctAnswer1, String correctAnswer2, String answer){
        return answer.equalsIgnoreCase(correctAnswer1) || answer.equalsIgnoreCase(correctAnswer2);
    }
}