package com.baizhi.service;

import com.baizhi.dao.IntroductionDAO;
import com.baizhi.entity.Introduction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class IntroductionServiceImpl implements IntroductionService {
    @Autowired
    private IntroductionDAO introductionDAO;
    @Override
    public void remove(Integer id) {
        introductionDAO.remove(id);
    }

    @Override
    public void save(Introduction introduction) {
        introductionDAO.save(introduction);
    }

    @Override
    @Transactional(readOnly = true)
    public Introduction queryOneId(Integer id) {
        Introduction introduction = introductionDAO.queryOneId(id);
        return introduction;
    }

    @Override
    public void update(Introduction introduction) {
            introductionDAO.update(introduction);
    }
}
