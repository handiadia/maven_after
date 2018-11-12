package com.baizhi.service;

import com.baizhi.entity.Introduction;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


public interface IntroductionService {
    void remove(Integer id);
    void save(Introduction introduction);
    Introduction queryOneId(Integer id);
    void update(Introduction introduction);
}
