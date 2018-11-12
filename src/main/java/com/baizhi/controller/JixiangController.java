package com.baizhi.controller;

import com.baizhi.entity.Jixiang;
import com.baizhi.service.ChapterService;
import com.baizhi.service.JixiangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("jixiang")
public class JixiangController {
    @Autowired
    private JixiangService jixiangService;
    @Autowired
    private ChapterService chapterService;
    @RequestMapping("queryAll")
    public @ResponseBody
    //查询所有并分页
    Map<String,Object> queryAll(Integer page, Integer rows){
        Integer start=(page-1)*rows;
        List<Jixiang> jixiangs = jixiangService.queryAll(start,rows);
        Long aLong = jixiangService.queryLength();
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("rows",jixiangs);
        map.put("total",aLong);
        return  map;
    }
    @RequestMapping("queryName")
    //查询所有专辑表中的专辑名
    public @ResponseBody List<Jixiang> queryName(){
        List<Jixiang> list = jixiangService.queryName();
        return list;
    }
    @RequestMapping("save")
    //存入专辑
    public @ResponseBody  void save(Jixiang jixiang, MultipartFile upload)throws Exception{
        String filenames=upload.getOriginalFilename();
        //动态获取项目名  有则添加 没有则创建文件夹
        /*String url = request.getSession().getServletContext().getRealPath("/main/image");*/
        upload.transferTo(new File("D:\\idea\\code\\maven_after\\src\\main\\webapp\\main\\image",filenames));
        jixiang.setImage(filenames);//将上传文件名 赋值为文章表中fileanme
        jixiangService.save(jixiang);
    }
    @RequestMapping("queryChapter")
    //根据专辑id查询该专辑下的章节
    public @ResponseBody List<Jixiang> queryName(Integer id){
        List<Jixiang> list = jixiangService.queryChapter(id);
        return list;
    }
    @RequestMapping("queryOneId")
    //根据单个专辑id查询该专辑对象
    public @ResponseBody Jixiang queryOneId(Integer id){
        Jixiang list = jixiangService.queryOneId(id);
        return list;
    }
}
