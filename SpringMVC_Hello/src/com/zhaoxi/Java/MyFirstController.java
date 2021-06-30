package com.zhaoxi.Java;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.ws.RequestWrapper;

/**
 * @author shkstart
 * @create2021-01-1420:29
 */
/*
1.controller告诉springMVC容器这个类是以一个处理器,可以处理请求
@Controller：标识哪个组件是控制器
*/
@Controller
public class MyFirstController {

    /*2.@RequestMappin告诉SpringMVC这个方法是处理什么请求的
        /表示从当前项目开始:处理当前项目的hello请求
    * */
    //创建一个方法来解析跳转成功页
    @RequestMapping("/hello")
    public String myfirstRequest(){
        System.out.println("请求收到....正在处理中");
        return "success";
    }
}
