import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ssm.service.IUserService;

//配置JUnit版本
@RunWith(SpringJUnit4ClassRunner.class)
//指定配置文件
@ContextConfiguration(locations = "classpath:spring.xml")
public class UserServiceTest {
    @Autowired
    private IUserService userService;

    @Test
    public  void s(){

        userService.insert2();
    }
}
