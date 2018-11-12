package com.baizhi.dao;

import com.baizhi.entity.Jixiang;

import java.util.List;

public interface JixiangDAO {
    List<Jixiang> queryAll(Integer start,Integer rows);
    Long queryLength();
    List<Jixiang> queryName();
    void save(Jixiang jixiang);
    List<Jixiang> queryChapter(Integer id);
    Jixiang queryOneId(Integer id);

}
