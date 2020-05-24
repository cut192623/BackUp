package spring.mvc.dao;

import org.springframework.stereotype.Repository;
import spring.mvc.entity.UserInfo;

import java.util.ArrayList;
import java.util.List;
@Repository
public class UserDaoImpl implements IUserDao {
    private List<UserInfo> users=new ArrayList<>();

    {
        users.add(new UserInfo("szx", "123456"));
        users.add(new UserInfo("admin", "123456"));
        users.add(new UserInfo("admin2", "123456"));
        users.add(new UserInfo("admin3", "123456"));
        users.add(new UserInfo("admin4", "123456"));

    }

    @Override
    public UserInfo login(String name,String password) {
        for (UserInfo user:users){
            if(user.getName().equals(name)&&user.getPassword().equals(password))
            return user;
        }
        return null;
    }

    @Override
    public List<UserInfo> query() {
        return users;
    }
}
