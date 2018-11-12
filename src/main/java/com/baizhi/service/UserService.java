package com.baizhi.service;

import com.baizhi.entity.User;

import java.util.List;

public interface UserService {
    //注册
    void save(User user);
    //修改密码
    void  updatePassword(String password);
    //登录
    User login(User user);
    //查询所有
    List<User> queryAll(Integer start,Integer rows);
    //修改用户信息
    void updateUser(User user);
    Long queryLength();
}
