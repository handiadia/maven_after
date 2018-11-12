package com.baizhi.dao;

import com.baizhi.entity.Master;

import java.util.List;

public interface MasterDAO {
    List<Master> queryAll(Integer start,Integer rows);
    void save(Master master);
    Long queryLength();
    void remove(Integer id);
    Master queryOneId(Integer id);
    void update(Master master);
}
