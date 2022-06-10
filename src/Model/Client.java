package Model;

/**
 * This class represents the client and get her information.
 *
 * @see Model.Persona
 * @author Karina Aguirre.
 */
public class Client extends Persona{
    protected String location;
    /**
     * This is the constructor method that receives information about the client.
     *
     * location of client.
     */
    public Client() {
        super();
        this.location = null;
    }

    /**
     * Method that get the Location from the client.
     *
     * @return location
     */
    public String getLocation() {
        return location;
    }

    /**
     * Method that set the Location from the client.
     *
     * @param location the location from the client.
     */
    public void setLocation(String location) {
        this.location = location;
    }
}
