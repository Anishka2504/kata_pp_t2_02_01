package hiber.service;

import hiber.dao.CarDao;
import hiber.model.Car;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CarServiceImpl implements CarService{

    @Autowired
    private CarDao carDao;


    @Override
    public void save(Car car) {
        carDao.save(car);
    }

    @Override
    public Car findOne(Long
                                   id) {
        return carDao.findOne(id);
    }

    @Override
    public List<Car> findAll() {
        return null;
    }
}
