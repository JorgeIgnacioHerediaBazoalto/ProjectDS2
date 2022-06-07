package Model;

/**
 * This class represents the client and get her information.
 *
 * @see Model.Persona .
 * @author Karina Aguirre.
 */
public class Client extends Persona{
    private String location;
    private int age;
    private int identityCard;

    /**
     * This is the constructor method that receives information about the client.
     *
     * @param name the name of client.
     * @param phoneNumber the client phone number.
     * @param location location of client.
     * @param age the age of client.
     * @param identityCard the identity card of client.
     */
    public Client(String name, int phoneNumber, String location, int age, int identityCard) {
        super(name, phoneNumber);
        this.location = location;
        this.age=age;
        this.identityCard=identityCard;
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

    /**
     * Method that get the Age.
     *
     * @return age.
     */
    public int getAge() {
        return age;
    }

    /**
     * Method that set the Age.
     *
     * @param age the age of client.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Method that get the Identity Card.
     *
     * @return  identityCard.
     */
    public int getIdentityCard() {
        return identityCard;
    }

    /**
     * Method that set the Identity Card.
     *
     * @param identityCard the identity card of client.
     */
    public void setIdentityCard(int identityCard) {
        this.identityCard = identityCard;
    }
}
