package szx.demo01.service;

import szx.demo01.entity.Car;

import java.util.List;

public interface ICarService {

    void updateById(long Id);
    List<Car> selectAll();
}
