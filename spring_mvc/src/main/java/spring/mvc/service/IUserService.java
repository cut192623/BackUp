package spring.mvc.service;

import spring.mvc.entity.UserInfo;

import java.util.List;

public interface IUserService {
    UserInfo login( String name,String password);
    List<UserInfo> query();
}
