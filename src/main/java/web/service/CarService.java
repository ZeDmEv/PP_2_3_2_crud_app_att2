package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> createListOfCars();

    List<Car> showCars(List<Car> cars,int carNumber);
}
