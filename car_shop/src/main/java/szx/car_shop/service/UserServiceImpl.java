package szx.car_shop.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import szx.car_shop.dao.UserMapper;
import szx.car_shop.entity.User;
import szx.car_shop.entity.UserExample;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired(required = false)
    private UserMapper userMapper;

    @Override
    public User selectByUser(String name,String Password) {

        User info = userMapper.selectByUser(name,Password);

        return info;
    }


}
