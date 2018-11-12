package com.baizhi.controller;

import com.baizhi.entity.Workrecord;
import com.baizhi.service.WorkrecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("workrecord")
public class WorkrecordController {
    @Autowired
    private WorkrecordService workrecordService;
    @RequestMapping("queryAll")
    //查询所有并分页
    public  @ResponseBody
    Map<String,Object> queryAll(Integer page, Integer rows){

        Map<String,Object> map=new HashMap<String,Object>();
        Integer start=(page-1)*rows;
        List<Workrecord> list = workrecordService.queryAll(start,rows);
        Long aLong = workrecordService.queryLength();
        map.put("total",aLong);
        map.put("rows",list);
        return  map;
    }
    @RequestMapping("remove")
    //更根据单个id删除该上师
    public @ResponseBody void remove(Integer id){
        workrecordService.remove(id);
    }
    @RequestMapping("update")
    //修改上师信息
    public @ResponseBody void update(Workrecord workrecord){
        workrecordService.update(workrecord);
    }
    @RequestMapping("save")
    //添加上师信息
    public  @ResponseBody void save(Workrecord workrecord){
        workrecordService.save(workrecord);
    }
    @RequestMapping("removeAll")
    //删除多个上师
    public @ResponseBody void removeAll(Integer [] id){
        for (Integer integer : id) {
            workrecordService.remove(integer);
        }
    }
    @RequestMapping("queryOneId")
    //根据单个id查询当个上师信息
    public @ResponseBody Workrecord queryOneId(Integer id){
        Workrecord workrecord = workrecordService.queryOneId(id);
        return  workrecord;
    }
}
