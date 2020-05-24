package com.hopu.springboot_demo.service;

import com.hopu.springboot_demo.entity.Page;
import com.hopu.springboot_demo.entity.User;

import java.util.List;

/**
 * 用户业务逻辑接口
 */
public interface IUserService {
    void insert(User user);
    void delete(long userId);
    void update(User user);
    User selectById(long userId);
    List<User> selectAll();
    Page<User> selectPage(int pageNo);
}
