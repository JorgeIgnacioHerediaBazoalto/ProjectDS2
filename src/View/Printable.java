package View;

import Utils.Colors;
import Utils.PrintStyle;
import Utils.Printer;

public abstract class Printable extends Printer {
    protected PrintStyle printStyle = new PrintStyle();
    protected Colors colors = new Colors();

    abstract public void title();
}
