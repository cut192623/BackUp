package test.service;

import test.dao.IGoodsDao;
import test.entity.GoodsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GoodsServiceImpl implements IGoodsService {

    //注入GoodsDAOImpl
    @Autowired
    private IGoodsDao goodsDao;

    @Override
    public List<GoodsEntity> findAll() {
        return goodsDao.selectall();
    }

    @Override
    public GoodsEntity findById(Long goodsId) {
        return goodsDao.selectById(goodsId);
    }

    @Override
    public void add(GoodsEntity goodsEntity) {
        goodsDao.insert(goodsEntity);
    }

    @Override
    public void modify(GoodsEntity goodsEntity) {
        goodsDao.update(goodsEntity);
    }

    @Override
    public void remove(Long goodsId) {
        goodsDao.delete(goodsId);
    }
}
