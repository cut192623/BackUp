package spring_aop.service;

import org.springframework.stereotype.Service;

@Service
public class GoodsServiceImpl implements IGoodsService {
    @Override
    public void add() {
        System.out.println("add goods......");
    }

    @Override
    public void query() {
        System.out.println("query goods......");
    }

    @Override
    public void update() {
        System.out.println("update goods......");
    }

    @Override
    public void delete() {
        System.out.println("delete goods......");
    }
}
