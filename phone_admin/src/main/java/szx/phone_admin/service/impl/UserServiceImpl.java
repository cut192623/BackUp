package szx.phone_admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import szx.phone_admin.dao.UserMapper;
import szx.phone_admin.entity.User;
import szx.phone_admin.service.IUserService;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
}
