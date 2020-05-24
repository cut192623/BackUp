package test.util;

import test.entity.GoodsEntity;

import java.util.ArrayList;
import java.util.List;

public class MockData {
    public  static  final List<GoodsEntity> goodsEntities=new ArrayList<>();

    static {
        goodsEntities.add(new GoodsEntity(1L,"小米手机",2000,"深圳","123.jpg"));
        goodsEntities.add(new GoodsEntity(2L,"华为手机",2500,"深圳","1234.jpg"));
        goodsEntities.add(new GoodsEntity(3L,"oppo手机",3000,"深圳","12345.jpg"));
    }
}
