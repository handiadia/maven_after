package com.baizhi.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.net.URLEncoder;
/*下载*/
@Controller
@RequestMapping("file")
public class Download {
    @RequestMapping("download")
    public @ResponseBody void Download(String chaptername, HttpSession session, HttpServletResponse response) throws Exception{
        //获取需要下载文件
        byte[] bs=FileUtils.readFileToByteArray(new File("D:\\idea\\code\\maven_after\\src\\main\\webapp\\main\\image"+"/"+chaptername));
        //设置响应头
        response.setHeader("content-disposition","attachment;filename="+URLEncoder.encode(chaptername,"UTF-8"));
        //获取响应输出流
        ServletOutputStream os=response.getOutputStream();
        //使用IOUtils工具类向外打印
        os.write(bs);
        if (os!=null){
            os.flush();

        }
        if (os!=null){
            os.close();

        }
    }
}
