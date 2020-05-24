package szx.car_shop.service;

import szx.car_shop.entity.Car;

import java.util.List;

public interface ICarService {
    List<Car> selectAll();
    Car selectById(Integer carId);
    void updateById(Car car);
}
