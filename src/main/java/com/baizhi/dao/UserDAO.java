package com.baizhi.dao;

import com.baizhi.entity.User;

import java.util.List;

public interface UserDAO {
    //注册
    void save(User user);
    //修改密码
    void  updatePassword(String password);
    //登录
    User login(User user);
    //查询所有用户
    List<User> queryAll(Integer start,Integer rows);
    //用户修改信息
    void updateUser(User user);
    Long queryLength();

}
