package ssm.service;


import ssm.entity.UserInfo;

import java.util.List;

//用户业务逻辑
public interface IUserService {
    void insert (UserInfo info);
    void delete (String name);
    UserInfo selectByName(String name);
    List<UserInfo> selectAll();
    void update(UserInfo info);

    void inserttest ();


    void insert2();

}
