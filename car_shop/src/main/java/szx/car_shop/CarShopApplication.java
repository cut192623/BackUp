package szx.car_shop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("szx.car_shop.dao")
public class CarShopApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarShopApplication.class, args);
    }

}
