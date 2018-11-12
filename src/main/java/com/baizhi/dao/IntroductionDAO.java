package com.baizhi.dao;

import com.baizhi.entity.Introduction;

public interface IntroductionDAO {
    void remove(Integer id);
    void save(Introduction introduction);
    Introduction queryOneId(Integer id);
    void update(Introduction introduction);
}
