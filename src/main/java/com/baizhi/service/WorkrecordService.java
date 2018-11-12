package com.baizhi.service;

import com.baizhi.entity.Workrecord;

import java.util.List;

public interface WorkrecordService {
    List<Workrecord> queryAll(Integer start,Integer rows);
    Long queryLength();
    void save(Workrecord workrecord);
    void  remove(Integer id);
    void update(Workrecord workrecord);
    Workrecord queryOneId(Integer id);
}
