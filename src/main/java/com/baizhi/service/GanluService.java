package com.baizhi.service;

import com.baizhi.entity.Ganlu;

import java.util.List;

public interface GanluService {
    List<Ganlu> queryAll(Integer start,Integer rows);
    List<Ganlu> queryGanluName();
    Long queryLength();
}
