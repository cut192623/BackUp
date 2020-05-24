package szx.car_shop;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import szx.car_shop.dao.CarMapper;
import szx.car_shop.entity.Car;
import szx.car_shop.entity.User;
import szx.car_shop.service.ICarService;
import szx.car_shop.service.IUserService;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class CarShopApplicationTests {
   // private ICarService carService;
    private IUserService userService;
    @Test
    public void test(){
        List<Car> list=new ArrayList<>();
        User user001 = userService.selectByUser("user001", "123456");
        System.out.println(user001);
//        list=carService.selectAll();
//        for (Car car:list){
//            System.out.println(car);
//
//        }

    }

}
