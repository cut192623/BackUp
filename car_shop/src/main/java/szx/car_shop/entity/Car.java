package szx.car_shop.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("tb_car")
public class Car {
    private Integer carId;

    private String carImg;

    private String carBrand;

    private Integer carPrice;

    private Integer carNum;


}