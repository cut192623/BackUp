import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import test.dao.OrderMapper;
import test.entity.OrderInfo;
import test.util.MyBatisUtil;

import java.util.List;

public class OrderMapperTest {
    @Test
    public  void SelectOrderByName(){
        SqlSession session = MyBatisUtil.getsession();
        OrderMapper mapper = session.getMapper(OrderMapper.class);
        List<OrderInfo> list = mapper.selectbyname("szx");
        System.out.println(list);

//        MyBatisUtil.closesession();
//
//         session = MyBatisUtil.getsession();
//         mapper = session.getMapper(OrderMapper.class);

        List<OrderInfo> list2 = mapper.selectbyname("szx");
        System.out.println(list2);
        System.out.println(list==list2);
        session.commit();

    }

    @Test
    public  void SelectOrderByNameCache(){
        SqlSession getsession = MyBatisUtil.getsession();
        SqlSession session = MyBatisUtil.getsession();
        OrderMapper mapper = session.getMapper(OrderMapper.class);
        List<OrderInfo> list = mapper.selectbyname("szx");
        System.out.println(list);

        MyBatisUtil.closesession();

        session = MyBatisUtil.getsession();
        mapper = session.getMapper(OrderMapper.class);

        List<OrderInfo> list2 = mapper.selectbyname("szx");
        System.out.println(list2);
        System.out.println(list==list2);
        session.commit();

    }

}
