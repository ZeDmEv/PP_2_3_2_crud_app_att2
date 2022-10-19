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
    public List<Car> showCars(List<Car> cars, int carNumber) {
        List <Car> tmp = new ArrayList<>(cars.subList(0, carNumber));
        return new ArrayList<>(tmp);
    }
}
