package test.dao;

import org.apache.ibatis.annotations.Param;
import test.entity.OrderInfo;

import java.util.List;

/*
* 订单映射接口
* */
public interface OrderMapper {
    //通过用户名查看订单
    List<OrderInfo> selectbyname(@Param("name") String name);

}
