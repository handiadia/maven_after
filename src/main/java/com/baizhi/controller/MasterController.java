package com.baizhi.controller;

import com.baizhi.entity.Master;
import com.baizhi.service.MasterService;
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
@RequestMapping("master")
public class MasterController {
    @Autowired
    private MasterService masterService;
    @RequestMapping("queryAll")
    //查询所有并分页
    public @ResponseBody Map<String,Object> queryAll(Integer page,Integer rows){
        Integer start=(page-1)*rows;
        List<Master> list = masterService.queryAll(start,rows);
        Long aLong = masterService.queryLength();
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("total",aLong);
        map.put("rows",list);
        return map;
    }
    @RequestMapping("save")
    public @ResponseBody void save(Master master, MultipartFile upload, HttpServletRequest request) throws Exception{
        //获取上传文件名
        String filenames=upload.getOriginalFilename();
        //动态获取项目名  有则添加 没有则创建文件夹
        /*String url = request.getSession().getServletContext().getRealPath("/main/image");*/
        upload.transferTo(new File("D:\\idea\\code\\maven_after\\src\\main\\webapp\\main\\image",filenames));
        master.setImage(filenames);
        masterService.save(master);
    }
    @RequestMapping("remove")
    //根据单个上师id删除该对应的上师
    public @ResponseBody void remove(Integer id){
        masterService.remove(id);
    }
    @RequestMapping("queryOneId")
    //更具单个上师id查询上师信息
    public @ResponseBody Master queryOneId(Integer id){
        Master master = masterService.queryOneId(id);
        return  master;
    }
    @RequestMapping("update")
    //修改上师信息
    public @ResponseBody void update (Master master, MultipartFile upload, HttpServletRequest request) throws Exception{
        //获取上传文件名
        String filenames=upload.getOriginalFilename();
        //动态获取项目名  有则添加 没有则创建文件夹
        /*String url = request.getSession().getServletContext().getRealPath("/main/image");*/
        upload.transferTo(new File("D:\\idea\\code\\maven_after\\src\\main\\webapp\\main\\image",filenames));
        master.setImage(filenames);
       masterService.update(master);
    }
    @RequestMapping("removeAll")
    //删除多个上师
    public @ResponseBody void removeAll(Integer [] id){
      for (int i=0;i<id.length;i++){
          masterService.remove(id[i]);
      }
    }

}
