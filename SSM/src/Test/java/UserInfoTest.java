import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ssm.dao.UserInfoMapper;
import ssm.entity.UserInfo;
import ssm.entity.UserInfoExample;
import ssm.service.IUserService;

import java.util.List;

//配置JUnit版本
@RunWith(SpringJUnit4ClassRunner.class)
//指定配置文件
@ContextConfiguration(locations = "classpath:spring.xml")

public class UserInfoTest {
    //依赖注入
    @Autowired
    private UserInfoMapper userInfoMapper;
    @Autowired
    private IUserService userService;


    @Test
    public  void testUserInfoSelect(){
        UserInfoExample example =new UserInfoExample();
        UserInfoExample.Criteria criteria = example.createCriteria()
                .andAgeEqualTo(18)
                .andNameEqualTo("test03");
        example.or(criteria);
        List<UserInfo> userInfos = userInfoMapper.selectByExample(example);

        for (UserInfo info:userInfos){
            System.out.println(info);
        }


    }

    @Test
    public  void selectbyname(){

        UserInfo info=userService.selectByName("szx");
        System.out.println(info);
    }

    @Test
    public  void selectall(){

        List<UserInfo>info=userService.selectAll();
        for (UserInfo infos:info){
            System.out.println(infos);
        }
    }

    @Test
    public  void update(){
        UserInfo info=new UserInfo();
        info.setAge(66);
        info.setName("szx");
        info.setSex("男");
        userService.update(info);
        selectall();
    }

    @Test
    public  void delete(){
        userService.delete("demo02");
        selectall();
    }

    @Test
    public void inserttest(UserInfo info){

        userInfoMapper.insert1(info);
        userInfoMapper.insert2(info);
    }
}
