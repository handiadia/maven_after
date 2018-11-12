package com.baizhi.service;

import com.baizhi.entity.Shuffing;

import java.util.List;

public interface ShuffingService {
    List<Shuffing> queryAll(Integer start,Integer rows);
    Shuffing queryOneId(String id);
    void remove(String id);
    void save(Shuffing shuffing);
    Long queryLength();
    void update(Shuffing shuffing);
}
