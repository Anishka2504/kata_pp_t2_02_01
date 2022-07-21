package hiber.service;

import hiber.model.Car;

import java.util.List;

public interface CarService {

    void save(Car car);

    Car findOne(Long id);

    List<Car> findAll();
}
