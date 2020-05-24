package szx.phone_admin;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import szx.phone_admin.dao.ModuleMapper;
import szx.phone_admin.dao.RoleMapper;
import szx.phone_admin.entity.Module;
import szx.phone_admin.entity.Role;

import java.util.List;
@RunWith(SpringRunner.class)
@SpringBootTest
public class test01 {

    @Autowired(required = false)
    private RoleMapper roleMapper;
    @Test
    public  void selectbyaccount(){
        List<Role> roles = roleMapper.selectRoleByAccount("admin");
        roles.forEach(role -> System.out.println(role.toString()));

    }

    @Autowired(required = false)
    private ModuleMapper moduleMapper;
    @Test
    public void selectmodulebyaccount(){
        List<Module> modules = moduleMapper.selectModuleByAccount("admin");
        modules.forEach(module -> System.out.println(module.toString()));
    }
}
