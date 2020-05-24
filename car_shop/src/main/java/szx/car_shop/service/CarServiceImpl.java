package szx.car_shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import szx.car_shop.dao.CarMapper;
import szx.car_shop.entity.Car;

import java.util.ArrayList;
import java.util.List;
@Service
public class CarServiceImpl implements ICarService {
    @Autowired(required = false)
    private CarMapper carMapper;

    @Override
    public List<Car> selectAll() {

        return carMapper.selectByExample(null);
    }

    @Override
    public Car selectById(Integer carId) {
        Car car=carMapper.selectByPrimaryKey(carId);
        return car;
    }

    @Override
    public void updateById(Car car) {
        carMapper.updateById(car);
    }
}
