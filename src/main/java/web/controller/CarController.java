package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

import java.util.List;

@Controller
public class CarController {
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String getCars(@RequestParam(required = false) Integer count, Model model) {
        List<Car> cars;
        if (count != null && count < 5) {
            cars = carService.getCarsByCount(count);
        } else {
            cars = carService.getAllCars();
        }
        model.addAttribute("cars", cars);
        return "cars";
    }
}
