package com.baizhi.controller;

import com.baizhi.entity.Shuffing;
import com.baizhi.service.ShuffingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("shuffing")
public class ShuffingController {
    @Autowired
    private ShuffingService shuffingService;
    @RequestMapping("queryAll")
    public @ResponseBody Map<String,Object>
    queryAll(Integer page,Integer rows){
        Integer start=(page-1)*rows;
        //返回轮播下所有图片
        List<Shuffing> shuffings = shuffingService.queryAll(start,rows);
        //返回所有长度
        Long aLong = shuffingService.queryLength();
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("total",aLong);
        map.put("rows",shuffings);
        return map;

    }
    @RequestMapping("queryOneId")
    public @ResponseBody Shuffing queryOneId(String id){
        Shuffing list = shuffingService.queryOneId(id);
        return list;
    }
    @RequestMapping("remove")
    public @ResponseBody void  remove(String id){
      shuffingService.remove(id);
    }
    @RequestMapping("save")
    public @ResponseBody void  save(Shuffing shuffing, HttpServletRequest request, MultipartFile upload)throws  Exception{
       //获取上传文件名
        String filenames=upload.getOriginalFilename();
        //动态获取项目名  有则添加 没有则创建文件夹
        /*String url = request.getSession().getServletContext().getRealPath("/main/image");*/
        upload.transferTo(new File("D:\\idea\\code\\maven_after\\src\\main\\webapp\\main\\image",filenames));
        shuffing.setImage(filenames);
        shuffingService.save(shuffing);

    }
    @RequestMapping("removeAll")
    public @ResponseBody void  removeAll(String [] id){
        for (int i=0;i<id.length;i++) {
            shuffingService.remove(id[i]);
        }
    }
    @RequestMapping("update")
    public @ResponseBody void update(Shuffing shuffing,HttpServletRequest request, MultipartFile upload)throws Exception{
        String filenames=upload.getOriginalFilename();
        //动态获取项目名  有则添加 没有则创建文件夹
        String url = request.getSession().getServletContext().getRealPath("/main/image");
        System.out.println(url);
        upload.transferTo(new File(url,filenames));
        shuffing.setImage(filenames);
        shuffingService.update(shuffing);
    }
}
