package web.model;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return carNumber == car.carNumber && Objects.equals(model, car.model) && Objects.equals(carColour, car.carColour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, carNumber, carColour);
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
