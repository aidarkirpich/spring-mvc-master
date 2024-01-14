package web.controller;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CarService {
    private List<Car> cars;

    public List<Car> getAllCars() {
        List<Car> cars = new ArrayList<>();
        Car car1 = new Car("priora", 200000, 500000);
        Car car2 = new Car("granta", 300000, 400000);
        Car car3 = new Car("kalina", 300000, 300000);
        Car car4 = new Car("chetyrka", 400000, 50000);
        Car car5 = new Car("shoha", 350000, 20000);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        return cars;
    }

    public List<Car> getCarsByCount(int count) {
        return getAllCars().subList(0, Math.min(count, getAllCars().size()));
    }
}
