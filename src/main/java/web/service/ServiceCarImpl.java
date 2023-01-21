package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ServiceCarImpl implements ServiceCar {

    private final List<Car>  car ;
    {
        car = new ArrayList<>();

        car.add(new Car("BMW", "M5",1534));
        car.add(new Car("Audi", "A6",565));
        car.add(new Car("Mazda", "RX-7",749));
        car.add(new Car("Lada", "vesta",657));
        car.add(new Car("Volvo", "x90",3654));
    }
    

    @Override
    public List<Car> getCarList(int count) {
        return car.stream().limit(count).collect(Collectors.toList());
    }
}

