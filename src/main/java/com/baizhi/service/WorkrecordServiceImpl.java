package com.baizhi.service;

import com.baizhi.dao.WorkrecordDAO;
import com.baizhi.entity.Workrecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("workrecordService")
public class WorkrecordServiceImpl implements WorkrecordService {
    @Autowired
    private WorkrecordDAO workrecordDAO;
    @Override
    public List<Workrecord> queryAll(Integer start,Integer rows) {
        return workrecordDAO.queryAll(start,rows);
    }

    @Override
    public Long queryLength() {
        return workrecordDAO.queryLength();
    }

    @Override
    public void save(Workrecord workrecord) {
        workrecordDAO.save(workrecord);
    }

    @Override
    public void remove(Integer id) {
            workrecordDAO.remove(id);
    }

    @Override
    public void update(Workrecord workrecord) {
            workrecordDAO.update(workrecord);
    }

    @Override
    public Workrecord queryOneId(Integer id) {
        return workrecordDAO.queryOneId(id);
    }
}
