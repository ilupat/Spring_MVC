package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    List<Car> listCar = new ArrayList<>();

    {
        listCar.add(new Car("BMW", "Черный", 2999));
        listCar.add(new Car("Mercedes", "Красный",3999));
        listCar.add(new Car("Жига", "Белый",1));
        listCar.add(new Car("Lexus", "Зеленый",1999));
        listCar.add(new Car("Нива", "Синий",9999));

    }

    public CarServiceImpl() {
    }

    @Override
    public List<Car> readCar(int n) {
        List<Car> newListCar = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            newListCar.add(listCar.get(i));
        }
        return newListCar;
    }
}

