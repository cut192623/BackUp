package ssm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import ssm.dao.UserInfoMapper;
import ssm.entity.UserInfo;
import ssm.entity.UserInfoExample;

import java.util.List;
@Service
public class UserInfoImpl implements IUserService {
    @Autowired
    private UserInfoMapper userInfoMapper;
    @Override
    public void insert(UserInfo info) {
        userInfoMapper.insertSelective(info);
    }

    @Override
    public void delete(String name) {
        UserInfoExample userInfoExample=new UserInfoExample();
        UserInfoExample.Criteria criteria=userInfoExample.createCriteria();
        criteria.andNameEqualTo(name);
        userInfoExample.or(criteria);
        userInfoMapper.deleteByExample(userInfoExample);
    }

    @Override
    public UserInfo selectByName(String name) {
        UserInfoExample userInfoExample=new UserInfoExample();
        UserInfoExample.Criteria criteria=userInfoExample.createCriteria();
        criteria.andNameEqualTo(name);
        userInfoExample.or(criteria);
        List<UserInfo> userInfos = userInfoMapper.selectByExample(userInfoExample);
        UserInfo info=userInfos.get(0);
        return info;
    }

    @Override
    public List<UserInfo> selectAll() {
        return userInfoMapper.selectByExample(null);
    }

    @Override
    public void update(UserInfo info) {
        UserInfoExample userInfoExample=new UserInfoExample();
        UserInfoExample.Criteria criteria=userInfoExample.createCriteria();
        criteria.andNameEqualTo(info.getName());
        userInfoExample.or(criteria);
        userInfoMapper.updateByExample(info,userInfoExample);
    }

    @Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED)
    public void inserttest(){
        UserInfo info=new UserInfo();
        info.setName("success");
        info.setAge(20);
        userInfoMapper.insert1(info);
        info.setName("fail");
        info.setAge(20);

        userInfoMapper.insert2(info);
    }

    @Autowired
    private IUserService2 userService2;

    @Override
//    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void insert2() {
        UserInfo user = new UserInfo();
        user.setName("外部事务");
        user.setAge(20);
        userInfoMapper.insert2(user);
        userService2.insert1();

    }
}
