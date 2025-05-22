package web.sevice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Service
public class InMemoryCarService implements CarService {
    CarDao carDao;

    @Autowired
    public InMemoryCarService(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getCars(Integer count) {
        return carDao.geCars(count);
    }
}
