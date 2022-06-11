package View;

import Utils.Colors;
import Utils.Printer;


public class TaxerView extends Printable{
    private final Printer printer;
    private final Colors colors;

    public TaxerView() {
        this.printer = new Printer();
        this.colors = new Colors();
    }

    public void printLoading() {
        printer.printLoadMessage("Loading"," .",4);
    }

    public void taxiAvaliableMessage() {
        System.out.println(colors.BLUE_BOLD_BRIGHT+"::::::> "+
                colors.WHITE_BOLD_BRIGHT+"\n A taxi available is starting the ride \n"+
                colors.BLUE_BOLD_BRIGHT+" <::::::"+colors.RESET
        );
    }

    public void taxiNotAvailableMessage() {
        System.out.println(colors.BLUE_BOLD_BRIGHT+"***> "+
                colors.WHITE_BOLD_BRIGHT+"\n There aren't taxis available for the moment :( \n"+
                colors.BLUE_BOLD_BRIGHT+" <***"+colors.RESET);}

    @Override
    public void title() {
        printMessage("\n"+colors.CYAN_BACKGROUND+ "WE ARE TAXER ;)"+colors.RESET + "\n");
    }
}
