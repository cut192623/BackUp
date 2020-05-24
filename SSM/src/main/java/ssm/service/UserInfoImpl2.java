package ssm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import ssm.dao.UserInfoMapper;
import ssm.entity.UserInfo;

@Service
public class UserInfoImpl2 implements IUserService2 {

    @Autowired
    private UserInfoMapper userMapper;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void insert1() {
        UserInfo user = new UserInfo();
        user.setName("内部事务");
        user.setAge(20);
        userMapper.insert2(user);
        throw new RuntimeException("异常");
    }
}
