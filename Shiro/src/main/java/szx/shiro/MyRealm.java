package szx.shiro;

import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

import java.util.HashSet;
import java.util.Set;

public class MyRealm extends AuthorizingRealm {
    /*
    * 返回授权信息用户登录后具有哪些角色和权限
    *
    * */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        String username = principalCollection.getPrimaryPrincipal().toString();
        System.out.println("current user is :"+username);
        //授权用户角色
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        Set<String>roles=new HashSet<>();
       // roles.add("user");
        roles.add("admin");
        info.setRoles(roles);
        //授权用户权限
        Set<String>permissions=new HashSet<>();
        permissions.add("select order");
      //  permissions.add("delete order");
        permissions.add("insert order");
        permissions.add("update order");
        info.setStringPermissions(permissions);
        return info;
    }
    /*
    * 返回验证信息，指定用户进行登录验证
    * */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
       //获得用户输入的账号和密码
        UsernamePasswordToken token=(UsernamePasswordToken) authenticationToken;
        String username = token.getUsername();
        String password = new String(token.getPassword());
        System.out.println("username: "+username+"\t"+"password: "+password);
        //返回验证信息，包含正确的账号密码，由Shiro框架验证
        SimpleHash simpleHash = new SimpleHash("md5", "123456", ByteSource.Util.bytes("hello"), 1);
        System.out.println("salted:"+simpleHash);
        SimpleHash simpleHash1 = new SimpleHash("md5", password, ByteSource.Util.bytes("hello"), 1);
        System.out.println("salted:"+simpleHash1);
        //四个参数：1:账号名  2:密码 (没加密之前的密码)  3:盐  4:realm的名字
        return new SimpleAuthenticationInfo(username,password,ByteSource.Util.bytes("hello"),getName());
    }
}
