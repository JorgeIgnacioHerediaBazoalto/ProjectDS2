package View;

import Utils.*;

/**
 * This is abstract class, printable inherit when one Viewer need print about thing.
 */
public abstract class Printable extends Printer {
    protected PrintStyle printStyle = new PrintStyle();
    protected Colors colors = new Colors();
    protected ValuesRequester valuesRequester = new ValuesRequester();

    /**
     * This method has a title. title of any class viewer.
     */
    abstract public void title();
}
