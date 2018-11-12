package com.baizhi.dao;

import com.baizhi.entity.Ganlu;

import java.util.List;

public interface GanluDAO {

   List<Ganlu> queryAll(Integer start,Integer rows);
   List<Ganlu> queryGanluName();
   Long queryLength();
}
