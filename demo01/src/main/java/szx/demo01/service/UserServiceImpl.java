package szx.demo01.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import szx.demo01.dao.UserMapper;
import szx.demo01.entity.User;
@Service
public class UserServiceImpl implements IUSerService {
    @Autowired(required = false)
    private UserMapper userMapper;
    @Override
    public User login(String username, String passowrd) {
        return userMapper.login(username,passowrd);
    }
}
