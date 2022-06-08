package Model;

/**
 * This class represents the client and get her information.
 *
 * @see Model.Persona .
 * @author Karina Aguirre.
 */
public class Client extends Persona{
    protected String name, location;
    protected int age, phoneNumber;

    /**
     * This is the constructor method that receives information about the client.
     *
     * name the name of client.
     * phoneNumber the client phone number.
     * location location of client.
     * age the age of client.
     * identityCard the identity card of client.
     */
    public Client() {
        super();
        this.location = null;
    }

    /**
     * Method that get the Location.
     *
     * @return location
     */
    public String getLocation() {
        return location;
    }

    /**
     * Method that set the Location.
     *
     * @param location the location of client.
     */
    public void setLocation(String location) {
        this.location = location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }
}
