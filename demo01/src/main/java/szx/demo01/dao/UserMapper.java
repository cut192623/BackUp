package szx.demo01.dao;


import org.apache.ibatis.annotations.Param;
import szx.demo01.entity.User;

public interface UserMapper {
    User login(@Param("username") String username, @Param("Password") String password);
}
