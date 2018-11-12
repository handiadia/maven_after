package com.baizhi.service;

import com.baizhi.dao.AdminDAO;
import com.baizhi.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service("adminService")
@Transactional
public class AdminServiceImpl implements  AdminService {
    @Autowired
    private AdminDAO adminDAO;
    @Override
    public Admin login(Admin admin) {
        return adminDAO.login(admin);
    }

    @Override
    public void updatepassword(Admin admin) {
        adminDAO.updatepassword(admin);
    }
}
