package szx.shiro;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.junit.Test;

public class SimpleHashTest {
    @Test
    public void simplehashtest(){
        String password="123456";
        SimpleHash simpleHash = new SimpleHash("md5",password);
        System.out.println(simpleHash);
        SimpleHash simpleHash1 = new SimpleHash("md5", password,ByteSource.Util.bytes("a"));
        System.out.println(simpleHash1);
        SimpleHash simpleHash2 = new SimpleHash("md5", password,ByteSource.Util.bytes("a"),1
        );
        System.out.println(simpleHash2);
    }
}
