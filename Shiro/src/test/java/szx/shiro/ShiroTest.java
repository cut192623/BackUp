package szx.shiro;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.junit.Test;

public class ShiroTest {
    @Test
    public  void testShiroBase(){
        //创建安全权限控制工厂，参数是ini文件的路径
        Factory factory = new IniSecurityManagerFactory("classpath:shiro-3.ini");
        //获得安全管理器
        SecurityManager mgr = (SecurityManager)factory.getInstance();
        //设置安全管理器
        SecurityUtils.setSecurityManager(mgr);
        //创建Subject对象，用于调用用户的权限信息
        Subject currentUser=SecurityUtils.getSubject();
        //判断用户如果没有进行验证，就进行验证
        if(!currentUser.isAuthenticated()) {
            UsernamePasswordToken token=new UsernamePasswordToken("demo01","123456");
            try {
                //登录失败会出现异常
                currentUser.login(token);
                System.out.println("登录成功");
                //判断用户是否有角色
//                if(currentUser.hasRole("admin")){
//                    //判断用户是否有权限
//                    if(currentUser.isPermitted("select order")){
//                        System.out.println("用户可以查询");
//                    }
//                    if(currentUser.isPermitted("insert order")){
//                        System.out.println("用户可以插入");
//                    }
//                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("登录失败");
            }
        }
        //注销
        currentUser.logout();
    }
}
