package szx.demo01.dao;

import org.apache.ibatis.annotations.Param;
import szx.demo01.entity.Car;

import java.util.List;

public interface CarMapper {

    void updateById(@Param("carId") long Id);
    List<Car> selectAll();
}
