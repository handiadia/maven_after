package com.baizhi.controller;

import com.baizhi.entity.Ganlu;
import com.baizhi.service.GanluService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("ganlu")
public class GanluController {
    @Autowired
    private GanluService ganluService;
    @RequestMapping("queryAll")
    public @ResponseBody
    Map<String,Object> queryAll(Integer page,Integer rows){
        Map<String,Object> map=new HashMap<String,Object>();
        Integer start=(page-1)*rows;
        List<Ganlu> list = ganluService.queryAll(start, rows);
        Long aLong = ganluService.queryLength();
        map.put("total",aLong);
        map.put("rows",list);
        return  map;
    }
    @RequestMapping("queryName")
    public List<Ganlu> queryName(){
        List<Ganlu> list = ganluService.queryGanluName();
        return list;
    }


}