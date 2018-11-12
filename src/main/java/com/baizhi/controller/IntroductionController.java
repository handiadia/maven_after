package com.baizhi.controller;

import com.baizhi.entity.Introduction;
import com.baizhi.service.IntroductionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("introduction")
public class IntroductionController {
    @Autowired
    private IntroductionService introductionService;
    @RequestMapping("remove")
    public @ResponseBody
    void remove(Integer id){
        introductionService.remove(id);
    }
    @RequestMapping("queryOneId")
    public @ResponseBody Introduction  queryOneId(Integer id){
        Introduction introduction = introductionService.queryOneId(id);
        return introduction;
    }
    @RequestMapping("update")
    public @ResponseBody void  update (Introduction introduction){
        introductionService.update(introduction);
    }
    @RequestMapping("save")
    public @ResponseBody void save(Introduction introduction){
        introductionService.save(introduction);
    }
}
