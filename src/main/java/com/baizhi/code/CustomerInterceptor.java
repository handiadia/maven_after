package com.baizhi.code;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/*拦截器*/
/*
*  请求会先经过preHandle方法，此方法返回值为false 请求中断 返回值为true放行
*  controller方法执行之后会进入postHadle方法
*  最后会执行afterCompletion方法
*
* */
public class CustomerInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        System.out.println("-----------------1-------------------------");
        HttpSession session = httpServletRequest.getSession();
        String login = (String)session.getAttribute("login");
        if("login".equals(login)){
            return true;
        }else{
            return false;
        }

    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        System.out.println("-----------------2-------------------------");
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        System.out.println("-----------------3-------------------------");
    }
}
