package com.zhaoxi.Java1;

import javax.servlet.ServletInputStream;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.zhaoxi.Java1.pojo.book;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import sun.management.Agent;

import java.awt.print.Book;
import java.io.IOException;

/**
 * @author shkstart
 * @create2021-01-1610:34
 */
@Controller
public class RequestParameterTest {
    //默认获取参数的方式
    @RequestMapping("/TheDefault")
    public String TheDefault(String username){
        System.out.println("username的值是："+username);
        return "success";
    }
    //注解@requestParam
    @RequestMapping("/requestParam")
    public String requestParam(
            @RequestParam(value = "username",defaultValue = "haha",required = false)String username,
            @RequestHeader(value = "User-Agent",defaultValue = "haha",required = false)String User_Agent,
            @CookieValue(value = "JSESSIONID",defaultValue = "111",required = false)String JSESSIONID
            ){
        System.out.println("username的值是："+username);
        System.out.println("User_Agent："+User_Agent);
        System.out.println("JSESSIONID："+JSESSIONID);
        return "success";
    }


    //请求参数为pojo对象
    @RequestMapping("/addbook")
    public String pojo(book book){
        System.out.println("我要保存的book为"+book);
        return "success";
    }

    //SpringMVC中的原生API
    @RequestMapping("/API")
    public String API(HttpSession session,
                           HttpServletRequest request,HttpServletResponse response) throws IOException {
        request.setAttribute("reqParam", "我是请求域中的");
        session.setAttribute("sessionParam", "额我是Session域中的");

        return "success";
    }
}
