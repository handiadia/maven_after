package com.baizhi.service;

import com.baizhi.entity.Jixiang;

import java.util.List;

public interface JixiangService {
    List<Jixiang> queryAll(Integer start,Integer rows);
    Long queryLength();
    List<Jixiang> queryName();
    void save(Jixiang jixiang);
    List<Jixiang> queryChapter(Integer id);
    Jixiang queryOneId(Integer id);
}
