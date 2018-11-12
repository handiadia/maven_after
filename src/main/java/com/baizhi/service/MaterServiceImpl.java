package com.baizhi.service;

import com.baizhi.dao.MasterDAO;
import com.baizhi.entity.Master;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("masterService")
public class MaterServiceImpl implements MasterService {
    @Autowired
    private MasterDAO masterDAO;
    @Override
    public List<Master> queryAll(Integer start,Integer rows) {
        return masterDAO.queryAll(start,rows);
    }

    @Override
    public void save(Master master) {
        masterDAO.save(master);
    }

    @Override
    public Long queryLength() {
        return masterDAO.queryLength();
    }

    @Override
    public void remove(Integer id) {
        masterDAO.remove(id);
    }

    @Override
    public Master queryOneId(Integer id) {
        return masterDAO.queryOneId(id);
    }

    @Override
    public void update(Master master) {
        masterDAO.update(master);
    }
}
