package szx.demo01.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import szx.demo01.dao.CarMapper;
import szx.demo01.entity.Car;

import java.util.List;

@Service
public class CarServiceImpl implements ICarService {
    @Autowired(required = false)
    private CarMapper carMapper;


    @Override
    public void updateById(long Id) {
         carMapper.updateById(Id);
    }

    @Override
    public List<Car> selectAll() {
        return carMapper.selectAll();
    }
}
