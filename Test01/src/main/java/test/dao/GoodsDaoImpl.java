package test.dao;

import test.entity.GoodsEntity;
import org.springframework.stereotype.Repository;
import test.util.MockData;

import java.util.List;
@Repository
public class GoodsDaoImpl implements IGoodsDao {
    @Override
    public List<GoodsEntity> selectall() {
        return MockData.goodsEntities;
    }

    @Override
    public GoodsEntity selectById(Long goodsId) {
        int size=MockData.goodsEntities.size();
        for (int i=0;i<size;i++){
            GoodsEntity goodsEntity=MockData.goodsEntities.get(i);
            if(goodsEntity.getId()==goodsId){

                return goodsEntity;
            }
        }
        return null;
    }

    @Override
    public void insert(GoodsEntity goodsEntity) {

       goodsEntity.setId(MockData.goodsEntities.size()+1L);
       MockData.goodsEntities.add(goodsEntity);
    }

    @Override
    public void update(GoodsEntity goodsEntity) {
        int size=MockData.goodsEntities.size();
        for (int i=0;i<size;i++){
            GoodsEntity goods=MockData.goodsEntities.get(i);
            if(goodsEntity.getId()==goods.getId()){
                MockData.goodsEntities.set(i,goodsEntity);
                break;
            }
        }
    }

    @Override
    public void delete(Long goodsId) {
        int size=MockData.goodsEntities.size();
        for (int i=0;i<size;i++){
            GoodsEntity goods=MockData.goodsEntities.get(i);
            if(goodsId==goods.getId()){
                MockData.goodsEntities.remove(i);
                break;
            }
        }
    }
}
