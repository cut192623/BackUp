package test.dao;

import test.entity.GoodsEntity;

import java.util.List;

public interface IGoodsDao {
    List<GoodsEntity> selectall();
    GoodsEntity selectById(Long goodsId);
    void insert(GoodsEntity goodsEntity);
    void update(GoodsEntity goodsEntity);
    void delete(Long goodsId);
}
