package com.baizhi.service;

import com.baizhi.dao.UserDAO;
import com.baizhi.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDAO userDAO;
    @Override
    public void save(User user) {
        userDAO.save(user);
    }

    @Override
    public void updatePassword(String password) {
        userDAO.updatePassword(password);
    }

    @Override
    @Transactional(readOnly = true)
    public User login(User user) {
        return userDAO.login(user);
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> queryAll(Integer start,Integer rows) {
        return userDAO.queryAll(start,rows);
    }

    @Override
    public void updateUser(User user) {
        userDAO.updateUser(user);
    }

    @Override
    public Long queryLength() {
        return userDAO.queryLength();
    }
}
