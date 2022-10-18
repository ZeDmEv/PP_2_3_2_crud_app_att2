package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam (defaultValue = "5") int count, ModelMap model) {
        CarService carService = new CarServiceImpl();
        List <Car> carList = carService.createListOfCars();
        carList.add(new Car("Ford", 123,"white"));
        carList.add(new Car("Kia", 132,"black"));
        carList.add(new Car("Renalut", 666,"red"));
        carList.add(new Car("Hyndai", 777,"blue"));
        carList.add(new Car("Bmw", 322,"green"));
        if (count > 5 || count < 0) count = 5;
        model.addAttribute("carlist", carService.showCars(carList, count));
        return "car";
    }
}
