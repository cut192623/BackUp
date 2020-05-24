import org.apache.ibatis.annotations.Param;
import test.dao.InfoMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import test.dao.InfoMapperImpl;
import test.dao.OrderMapper;
import test.entity.Info;
import test.entity.OrderInfo;
import test.util.MyBatisUtil;

import java.util.ArrayList;
import java.util.List;

public class InfoMapperTest {
@Test
    public void testselectbyname(){

    SqlSession getsession = MyBatisUtil.getsession();
    InfoMapper mapper1 = getsession.getMapper(InfoMapper.class);
    OrderMapper mapper2 = getsession.getMapper(OrderMapper.class);
    Info info=mapper1.selectbyname("szx");
    System.out.println(info);
    List<OrderInfo>infos =info.getOrders();
    for(OrderInfo list:infos){
        System.out.println(list);
      }
    getsession.commit();

}
    @Test
    public void testselectbyAge(){

        SqlSession getsession = MyBatisUtil.getsession();
        InfoMapper mapper = getsession.getMapper(InfoMapper.class);
        List<Long> list =new ArrayList<>();
        list.add((long) 18);
        list.add((long) 30);

        System.out.println(mapper.selectbyAge(list));
        getsession.commit();

    }
    @Test
    public void testselectbyName(){

        SqlSession getsession = MyBatisUtil.getsession();
        InfoMapper mapper = getsession.getMapper(InfoMapper.class);
        List<Long> list =new ArrayList<>();
        list.add((long) 18);
        list.add((long) 30);

        System.out.println(mapper.selectbyAge(list));
        getsession.commit();

    }


//
//    @Test
//    public  void testAdd(){
////        //创建会话工厂的构建器
////        SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
////        //构建会话工厂
////        SqlSessionFactory factory=builder.build(InfoMapperTest.class.getClassLoader().getResourceAsStream("mybatis.xml"));
////        //创建会话
////       SqlSession session=factory.openSession();
//        SqlSession sqlSession = MyBatisUtil.getsession();
//        //通过会话得到接口的实现
//        InfoMapper mapper = sqlSession.getMapper(InfoMapper.class);
//        //使用接口
//       mapper.add(new Info("test06",18));
//        System.out.println(mapper.selectall());
//        //提交事务
//        sqlSession.commit();
//        //关闭会话
//       // MyBatisUtil.closesession();
//
//
//    }
//    @Test
//    public  void testselectall(){
//
//        SqlSession sqlSession = MyBatisUtil.getsession();
//        //通过会话得到接口的实现
//        InfoMapper mapper = sqlSession.getMapper(InfoMapper.class);
//        //使用接口
//
//        System.out.println(mapper.selectall());
//        //提交事务
//        sqlSession.commit();
//        //关闭会话
//       // MyBatisUtil.closesession();
// }
//    @Test
//    public  void testdelete(){
//
//        SqlSession sqlSession = MyBatisUtil.getsession();
//        //通过会话得到接口的实现
//        InfoMapper mapper = sqlSession.getMapper(InfoMapper.class);
//        //使用接口
//        mapper.delete("test01");
//        System.out.println(mapper.selectall());
//        //提交事务
//        sqlSession.commit();
//        //关闭会话
//        // MyBatisUtil.closesession();
//    }
//    @Test
//    public  void testupdate(){
//
//        SqlSession sqlSession = MyBatisUtil.getsession();
//        //通过会话得到接口的实现
//        InfoMapper mapper = sqlSession.getMapper(InfoMapper.class);
//        //使用接口
//       mapper.update(new Info("test02",99));
//        System.out.println(mapper.selectall());
//        //提交事务
//        sqlSession.commit();
//        //关闭会话
//        // MyBatisUtil.closesession();
//    }
}
