package Utils;


/**
 * This class will be used to validate values
 * It contains two methods which will be called to validate the value in a specific case
 *
 * @author Santiago Caballero
 */
public class Validator {

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