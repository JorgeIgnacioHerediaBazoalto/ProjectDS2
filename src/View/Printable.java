package View;

import Utils.Colors;
import Utils.PrintStyle;
import Utils.Printer;
import Utils.ValuesRequester;

public abstract class Printable extends Printer {
    protected PrintStyle printStyle = new PrintStyle();
    protected Colors colors = new Colors();
    protected ValuesRequester valuesRequester = new ValuesRequester();

    abstract public void title();
}
