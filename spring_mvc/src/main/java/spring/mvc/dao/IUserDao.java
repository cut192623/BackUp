package spring.mvc.dao;

import spring.mvc.entity.UserInfo;

import java.util.List;

public interface IUserDao {
    UserInfo login(String name,String password);
    List<UserInfo> query();
}
