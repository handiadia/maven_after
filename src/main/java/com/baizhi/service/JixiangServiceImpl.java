package com.baizhi.service;

import com.baizhi.dao.JixiangDAO;
import com.baizhi.entity.Jixiang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service("jixiangService")
@Transactional
public class JixiangServiceImpl implements JixiangService {
    @Autowired
    private JixiangDAO jixiangDAO;
    @Override
    @Transactional(readOnly = true)
    public List<Jixiang> queryAll(Integer start,Integer rows) {
        return jixiangDAO.queryAll(start,rows);
    }

    @Override
    @Transactional(readOnly = true)
    public Long queryLength() {
        return jixiangDAO.queryLength();
    }

    @Override
    public List<Jixiang> queryName() {
        return jixiangDAO.queryName();
    }

    @Override
    public void save(Jixiang jixiang) {
        jixiangDAO.save(jixiang);
    }

    @Override
    public List<Jixiang> queryChapter(Integer id) {
        return  jixiangDAO.queryChapter(id);
    }

    @Override
    public Jixiang queryOneId(Integer id) {
        return jixiangDAO.queryOneId(id);
    }
}
