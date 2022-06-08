package Taxer;

import Utils.Colors;
import Utils.Printer;


public class TaxerView {
    private final Printer printer;
    private final Colors colors;

    public TaxerView() {
        this.printer = new Printer();
        this.colors = new Colors();
    }

    public void printMessage(String message) {
        printer.printMessage(message);
    }

    public void printMessage(String message, String color) {
        printer.printMessage(color+message+colors.RESET);
    }

    public void printMessage(String message, boolean delay) {
        printer.printMessage(message,delay);
    }
}
