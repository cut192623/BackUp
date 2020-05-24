package spring.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import spring.mvc.dao.IUserDao;
import spring.mvc.entity.UserInfo;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServicempl implements IUserService {
    @Autowired

    private IUserDao dao;
    @Override
    public UserInfo login(String name,String password) {

        return dao.login(name,password);
    }

    @Override
    public List<UserInfo> query() {
        return dao.query();
    }
}
