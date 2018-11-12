package com.baizhi.service;

import com.baizhi.entity.Admin;

public interface AdminService {
    //管理员登录
    Admin login(Admin admin);
    //密码修改
    void updatepassword(Admin admin);
}
