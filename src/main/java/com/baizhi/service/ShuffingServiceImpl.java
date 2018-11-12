package com.baizhi.service;

import com.baizhi.dao.ShuffingDAO;
import com.baizhi.entity.Shuffing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service("shuffingService")
@Transactional
public class ShuffingServiceImpl implements  ShuffingService {
    @Autowired
    private ShuffingDAO shuffingDAO;
    @Override
    public List<Shuffing> queryAll(Integer start,Integer rows) {
        return shuffingDAO.queryAll(start,rows);
    }

    @Override
    public Shuffing queryOneId(String id) {
        return shuffingDAO.queryOneId(id);
    }

    @Override
    public void remove(String id) {
        shuffingDAO.remove(id);
    }

    @Override
    public void save(Shuffing shuffing) {
        shuffing.setId(UUID.randomUUID().toString());
        shuffingDAO.save(shuffing);
    }

    @Override
    public Long queryLength() {
        return shuffingDAO.queryLength();
    }

    @Override
    public void update(Shuffing shuffing) {
        shuffingDAO.update(shuffing);
    }
}
