package szx.pet_info.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import szx.pet_info.dao.UserMapper;
import szx.pet_info.entity.User;
import szx.pet_info.service.IUserService;
@Service
public class UserServiceImpl implements IUserService {
    @Autowired(required = false)
    private UserMapper userMapper;
    @Override
    public User login(String username, String password) {

        return userMapper.login(username,password);
    }
}
