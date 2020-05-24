package test.dao;


import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import test.entity.Info;
import test.entity.OrderInfo;
import test.util.MyBatisUtil;

import java.util.List;


public class InfoMapperImpl implements InfoMapper {
    private InfoMapper infoMapper=MyBatisUtil.getsession().getMapper(InfoMapper.class);

    @Override
    public void add(Info szx) {

    }

    @Override
    public void update(Info szx) {

    }

    @Override
    public void delete(String name) {

    }

    @Override
    public List<Info> selectall() {
        return infoMapper.selectall();
    }

    @Override
    public Info selectbyname( @Param("name")String name) {


        return infoMapper.selectbyname(name);
    }

    @Override
    public List<Info> selectbyAge(List<Long> ages) {
        return infoMapper.selectbyAge(ages);
    }

}
