package web.model;

public class Car {
    private String model;
    private int carNumber;
    private String carColour;

    public Car() {

    }

    public Car(String model, int carNumber, String carColour) {
        this.model = model;
        this.carNumber = carNumber;
        this.carColour = carColour;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(int carNumber) {
        this.carNumber = carNumber;
    }

    public String getCarColour() {
        return carColour;
    }

    public void setCarColour(String carColour) {
        this.carColour = carColour;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", carNumber=" + carNumber +
                ", carColour='" + carColour + '\'' +
                '}';
    }
}
