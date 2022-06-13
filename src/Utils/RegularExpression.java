package Utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class that helps to validate if any unwanted character or digit is entered.
 * 
 * @author LOS TIRADOS
 */

public class RegularExpression{

    private final Pattern regularExpressionLetters;
    private final Pattern regularExpressionNumbers;
    private final Pattern regularExpressionSymbols;
    private Matcher matcher;

    /**
     * Construction method
     * 
     * The patterns necessary to validate the answers are initialized.
     */

    public RegularExpression(){
        regularExpressionLetters = Pattern.compile("[a-zA-Z]");
        regularExpressionNumbers = Pattern.compile("\\d");
        regularExpressionSymbols = Pattern.compile("[\\p{Punct}]");
    }

    /**
     * Helps to verify if there are letters in the entered answer.
     * 
     * Checks if the user entered letters in those fields where they should not be entered.
     * 
     * @param answer User entered answer
     * @return false if it contains no letters and true if it contains 1 or more letters.
     */

    public boolean validateLetters(String answer){

        matcher = regularExpressionLetters.matcher(answer);

        int countErrors = 0;

        boolean result = false;

        for (int i = 0; i <= answer.length(); i++) {
            if (matcher.find()) {
                countErrors++;
            }
        }
        
        if (countErrors > 0) {
            result = true;
        }

        return result;
    }

    /**
     * Helps to verify if there are numbers in the entered answer.
     * 
     * Checks if the user entered numbers in those fields where they should not be entered.
     * 
     * @param answer User entered answer
     * @return false if it contains no numbers and true if it contains 1 or more numbers.
     */

    public boolean validateNumbers(String answer){

        matcher = regularExpressionNumbers.matcher(answer);

        int countErrors = 0;

        boolean result = false;

        for (int i = 0; i <= answer.length(); i++) {
            if (matcher.find()) {
                countErrors++;
            }
        }
        
        if (countErrors > 0) {
            result = true;
        }

        return result;
    }

    /**
     * Helps to verify if there are symbols in the entered answer.
     * 
     * Checks if the user entered symbols in those fields where they should not be entered.
     * 
     * @param answer User entered answer
     * @return false if it contains no symbols and true if it contains 1 or more symbols.
     */

    public boolean validateSymbols(String answer){

        matcher = regularExpressionSymbols.matcher(answer);

        int countErrors = 0;

        boolean result = false;

        for (int i = 0; i <= answer.length(); i++) {
            if (matcher.find()) {
                countErrors++;
            }
        }
        
        if (countErrors > 0) {
            result = true;
        }

        return result;
    }

}