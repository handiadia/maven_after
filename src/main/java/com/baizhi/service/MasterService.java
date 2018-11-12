package com.baizhi.service;

import com.baizhi.entity.Master;

import java.util.List;

public interface MasterService {
    List<Master> queryAll(Integer start,Integer rows);
    void save(Master master);
    Long queryLength();
    void remove(Integer id);
    Master queryOneId(Integer id);
    void update(Master master);
}
