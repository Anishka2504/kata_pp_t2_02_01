package hiber.dao;

import hiber.model.Car;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CarDaoImpl implements CarDao{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Car findOne(Long id) {
        return null;
    }

    @Override
    public List<Car> getAll() {
        return null;
    }

    @Override
    public void save(Car car) {

    }
}
