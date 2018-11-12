package com.baizhi.service;

import com.baizhi.dao.GanluDAO;
import com.baizhi.entity.Ganlu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("ganluService")
public class GanluServiceImpl implements  GanluService{
    @Autowired
    private GanluDAO ganluDAO;

    @Override
    public List<Ganlu> queryAll(Integer start, Integer rows) {
        return ganluDAO.queryAll(start,rows);
    }

    @Override
    public List<Ganlu> queryGanluName() {
        return ganluDAO.queryGanluName();
    }

    @Override
    public Long queryLength() {
        return ganluDAO.queryLength();
    }
}
