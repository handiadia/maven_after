package com.baizhi.dao;

import com.baizhi.entity.Admin;

public interface AdminDAO {
    //管理员登录
    Admin login(Admin admin);
    void updatepassword(Admin admin);
}
