package com.baizhi.controller;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("register")
    //注册
    public String save(User user){
        userService.save(user);
        return "login";
    }
    @RequestMapping("login")
    //登录
    public String login(User user){
        if(userService.login(user)==null){
            return "register";
        }else{
            return "展示";
        }
    }
    @RequestMapping("queryAll")
    public @ResponseBody
    Map<String,Object> queryAll(Integer page,Integer rows){
        Map<String,Object> map=new HashMap<String,Object>();
        Integer start=(page-1)*rows;
        List<User> list = userService.queryAll(start,rows);
        Long aLong = userService.queryLength();
        map.put("total",aLong);
        map.put("rows",list);
        return map;
    }
    //修改用户信息
    @RequestMapping("updateUser")
    public @ResponseBody void updateUser(User user){
        userService.updateUser(user);
    }

}
