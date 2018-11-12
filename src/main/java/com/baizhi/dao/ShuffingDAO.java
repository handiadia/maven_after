package com.baizhi.dao;

import com.baizhi.entity.Shuffing;

import java.util.List;

public interface ShuffingDAO {
    //查询轮播图下面所有图片
    List<Shuffing> queryAll(Integer start,Integer rows);
    Shuffing queryOneId(String id);
    void remove(String id);
    void save(Shuffing shuffing);
    Long queryLength();
    void update(Shuffing shuffing);
}
