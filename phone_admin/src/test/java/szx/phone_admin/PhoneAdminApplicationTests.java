package szx.phone_admin;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import szx.phone_admin.dao.RoleMapper;
import szx.phone_admin.dao.UserMapper;
import szx.phone_admin.entity.Role;
import szx.phone_admin.entity.User;
import szx.phone_admin.service.IUserService;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PhoneAdminApplicationTests {
    @Autowired(required = false)
    private UserMapper userMapper;

    @Autowired(required = false)
    private RoleMapper roleMapper;

    @Autowired(required = false)
    private IUserService userService;
    @Test
   public void testSelect() {
        List<User> users = userMapper.selectList(null);
        users.forEach((user)-> System.out.println(user));

        List<User> list=userService.list();
        for (User user:list){

            System.out.println(user);
        }
    }

    @Test
    public void selectbyaccount(){
        List<Role> roles = roleMapper.selectRoleByAccount("admin");
        roles.forEach((role -> System.out.println(role.toString())));
    }

}
