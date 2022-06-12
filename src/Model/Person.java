package Model;

/**
 * This class represent a persona, is abstract class because never instance persona, but sometimes inherit.
 */
abstract public class Person {

    protected String name;
    protected int phoneNumber;

    /**
     * Constructor of Persona object,  but never instance
     */
    public Person() {
        this.name = null;
        this.phoneNumber = 0;
    }

    /**
     * This method gets name.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This method set name.
     * @param name name of person.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method gets phone number of persona.
     * @return phoneNumber
     */
    public int getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * This method set phone number of persona.
     * @param phoneNumber contact to persona.
     */
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
