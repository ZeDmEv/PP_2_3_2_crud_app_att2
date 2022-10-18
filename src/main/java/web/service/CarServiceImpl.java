package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService{
    @Override
    public List<Car> createListOfCars() {
        return new ArrayList<Car>();
    }

    @Override
    public List<String> showCars(List<Car> cars, int carNumber) {
        List <String> strings = new ArrayList<>();
        List <Car> tmp = new ArrayList<>(cars.subList(0, carNumber));
        for (Car car : tmp) {
            strings.add(car.toString());
        }
        return strings;
    }
}
