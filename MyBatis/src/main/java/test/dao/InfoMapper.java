package test.dao;


import org.apache.ibatis.annotations.*;
import test.entity.Info;
import test.entity.OrderInfo;

import java.util.List;

public interface InfoMapper  {


//    @Insert("insert into info(name,age)values(#{name},#{age})")
//
    void add(Info szx);
    //@Update("update info set age=#{age} where name=#{name}")
    void update(Info szx);
//    @Delete("delete from info  where name=#{name}")
    void delete(String name);
//    @Select(" select * from info")
    List<Info> selectall();

    Info selectbyname(@Param("name")String name);
    List<Info> selectbyAge(@Param("age") List<Long> ages);
}
