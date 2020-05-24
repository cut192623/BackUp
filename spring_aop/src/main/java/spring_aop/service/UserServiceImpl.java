package spring_aop.service;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
    @Override
    public void add() {
        System.out.println("add......");
        throw  new RuntimeException("测试") ;
    }

    @Override
    public void query() {
        System.out.println("query......");
    }

    @Override
    public void update() {
        System.out.println("update......");
    }

    @Override
    public void delete() {
        System.out.println("delete......");
    }
}
