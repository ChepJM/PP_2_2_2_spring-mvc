package web.Service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService{
    private List<Car> carsList = new ArrayList<Car>() {
        {
            add(new Car("BMW", 200, 1991));
            add(new Car("Audi", 110, 1992));
            add(new Car("Nissan", 220, 1993));
            add(new Car("Audi", 280, 1994));
            add(new Car("Toyota", 360, 1995));
        }
    };

    @Override
    public List<Car> getCarList(int count) {
        List<Car> resultList = (count < 5) ? carsList.subList(0, count) : carsList;
        return resultList;
    }
}
