package com.baizhi.controller;

import com.baizhi.entity.Chapter;
import com.baizhi.service.ChapterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
/*章节*/
@Controller
@RequestMapping("chapter")
public class ChapterController {
    @Autowired
    private ChapterService chapterService;
    @RequestMapping("save")
    public @ResponseBody void save(Chapter chapter, HttpServletRequest request, MultipartFile upload)throws  Exception{
        //获取上传文件名
        String filenames=upload.getOriginalFilename();

        File file= new File("D:\\idea\\code\\maven_after\\src\\main\\webapp\\main\\image",filenames);
        upload.transferTo(file);

        chapter.setFilesize("" + file.length() / 1024 / 1024.0 + " MB");
        chapter.setFilename(filenames);
        chapterService.save(chapter);
        }
}
