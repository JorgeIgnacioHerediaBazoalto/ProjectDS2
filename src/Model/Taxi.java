/**
 * This is Taxi class with params of a taxi real.
 *
 * @author Jorge Heredia
 */
package Model;

public class Taxi {
    private String numberPlate;
    private String carModel;
    private String carColor;
    private int capacity;
    private boolean availability;

    /**
     * This is a constructor class of Taxi, we suppose the taxi is available when initialized.
     * <p>
     *      This class have param availability.
     *      availability contain info about if the car is available (Not receive in constructor, but setter in true)
     * </p>
     *
     * @param numberPlate Identifier of car.
     * @param carModel Specification of car design.
     * @param carColor Car primary color, that may change.
     * @param capacity How many people enter.
     *
     */
    public Taxi(String numberPlate, String carModel, String carColor, int capacity) {
        this.setNumberPlate(numberPlate);
        this.setCarModel(carModel);
        this.setCarColor(carColor);
        this.setCapacity(capacity);
        this.setAvailability(true);
    }

    /**
     * Method that get the car license plate.
     * @return numberPlate
     */
    public String getNumberPlate() {
        return numberPlate;
    }

    /**
     * Method that set the car license plate.
     * @param numberPlate Identifier of car.
     */
    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    /**
     * Method that get the car model.
     * @return carModel
     */
    public String getCarModel() {
        return carModel;
    }

    /**
     * Method that set the car model.
     * @param carModel Specification of car design.
     */
    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    /**
     * Method that get the car color primary.
     * @return carColor
     */
    public String getCarColor() {
        return carColor;
    }

    /**
     * Method that set the car color primary.
     * @param carColor Car primary color, that may change.
     */
    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    /**
     * Method that get the car capacity.
     * @return capacity
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Method that set the car capacity.
     * @param capacity How many people enter.
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Method that return car availability.
     * @return availability
     */
    public boolean isAvailability() {
        return availability;
    }

    /**
     * Method that set the car availability.
     * @param availability The car is available? (Not receive in constructor, but setter in true)
     */
    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}
