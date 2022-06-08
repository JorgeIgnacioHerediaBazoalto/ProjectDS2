package Model;

public class Persona {

    protected String name;
    protected int phoneNumber;

    public Persona() {
        this.name = null;
        this.phoneNumber = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
