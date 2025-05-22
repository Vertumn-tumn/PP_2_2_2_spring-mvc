package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryCarDAO implements CarDao {

    @Override
    public List<Car> geCars(Integer count) {
        List<Car> allCars = getCarList();
        List<Car> carsToShow;

        if (count != null && count > 0 && count < allCars.size()) {
            carsToShow = allCars.subList(0, count);
        } else {
            carsToShow = allCars;
        }
        return carsToShow;
    }

    private ArrayList<Car> getCarList() {
        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new Car("Toyota Camry", 2020, "Silver"));
        cars.add(new Car("Honda Civic", 2021, "Red"));
        cars.add(new Car("BMW X5", 2019, "Black"));
        cars.add(new Car("Tesla Model 3", 2022, "White"));
        cars.add(new Car("Ford Mustang", 2018, "Blue"));

        return cars;
    }
}
