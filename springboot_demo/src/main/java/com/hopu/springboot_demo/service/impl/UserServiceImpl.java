package com.hopu.springboot_demo.service.impl;

import com.hopu.springboot_demo.dao.UserMapper;
import com.hopu.springboot_demo.entity.Page;
import com.hopu.springboot_demo.entity.User;
import com.hopu.springboot_demo.entity.UserExample;
import com.hopu.springboot_demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * User业务逻辑实现
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired(required=false)
    private UserMapper userMapper;

    @Override
    public void insert(User user) {
        userMapper.insertSelective(user);
    }

    @Override
    public void delete(long userId) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo((int)userId);
        example.or(criteria);
        userMapper.deleteByExample(example);
    }

    @Override
    public void update(User user) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(user.getUserId());
        example.or(criteria);
        userMapper.updateByExample(user,example);
    }

    @Override
    public User selectById(long userId) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo((int)userId);
        example.or(criteria);
        List<User> users = userMapper.selectByExample(example);
        if (users.size() > 0)
            return users.get(0);
        return null;
    }

    @Override
    public List<User> selectAll() {
        return userMapper.selectByExample(null);
    }


    @Override
    public Page<User> selectPage(int pageNo) {
        //查询表的行数(多少条数据),为分页做准备
        long count = userMapper.countByExample(null);
        //计算页数
        long pageCount =count % Page.PAGE_SIZE==0?count/Page.PAGE_SIZE : count/Page.PAGE_SIZE+1;
        //分页查询
        List<User> users = userMapper.selectLimit((pageNo - 1) * Page.PAGE_SIZE, Page.PAGE_SIZE);
        Page<User> page =new Page<>();
        page.setData(users);
        page.setPageCount((int) pageCount);
        page.setPageNo(pageNo);
        return page;
    }
}
