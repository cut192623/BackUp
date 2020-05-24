package test.service;

import test.entity.GoodsEntity;

import java.util.List;

/**
 * 商品的业务逻辑接口
 */
public interface IGoodsService {
    List<GoodsEntity> findAll();

    GoodsEntity findById(Long goodsId);

    void add(GoodsEntity goodsEntity);

    void modify(GoodsEntity goodsEntity);

    void remove(Long goodsId);
}
