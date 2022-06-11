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

    @Override
    public void title() {
        printMessage("\n"+colors.CYAN_BACKGROUND+ "WE ARE TAXER ;)"+colors.RESET + "\n");
    }
}
