package szx.car_shop.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Param;
import szx.car_shop.entity.User;

import java.util.List;

public interface IUserService  {

 User selectByUser( String name,String Password);
}
