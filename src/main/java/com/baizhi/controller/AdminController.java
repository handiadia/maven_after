package com.baizhi.controller;

import com.baizhi.entity.Admin;
import com.baizhi.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("admin")
public class AdminController {
    @Autowired
    private AdminService adminService;
    //管理员登录判断
    @RequestMapping("login")
    public String login(Admin admin, HttpServletRequest request,String enCode){
        HttpSession session = request.getSession();
        //取出session中的值获取验证码
        String attribute =(String) session.getAttribute("randomcode_key");
        //判断是否存在该用户
        if(attribute.equals(enCode)){
            if(adminService.login(admin)==null){
                //不存在返回登录页面
                return "login";
            }else{
                //存入管理员信息
                Admin a=adminService.login(admin);
                session.setAttribute("admin",a);

                /*存入值强制登录*/
                session.setAttribute("login","login");
                return "main/main";
            }
        }else{
            return "login";
        }
    }
    @RequestMapping("updatepassword")
    public @ResponseBody
    void  updatepassword(HttpServletRequest request,String password){
        //用户登录后  取出session值
        Admin admin1 = (Admin)request.getSession().getAttribute("admin");
        //将用户修改的密码存入该对象 传值修改
        admin1.setPassword(password);
        adminService.updatepassword(admin1);
    }

    @RequestMapping("stop")
    //退出页面  清空session值
    public String stop(HttpServletRequest request){
        HttpSession session = request.getSession();
        session.invalidate();
        return "login";
    }
}
