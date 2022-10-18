package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> createListOfCars();

    List<String> showCars(List<Car> cars,int carNumber);
}
