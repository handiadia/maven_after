package com.baizhi.service;

import com.baizhi.dao.ChapterDAO;
import com.baizhi.entity.Chapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("chapterService")
@Transactional
public class ChapterServiceImpl implements  ChapterService{
    @Autowired
    private ChapterDAO chapterDAO;
    @Override
    public void save(Chapter chapter) {
        chapterDAO.save(chapter);
    }
}
