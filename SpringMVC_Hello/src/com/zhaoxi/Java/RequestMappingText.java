package com.zhaoxi.Java;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author shkstart
 * @create2021-01-1510:01
 */
@Controller
@RequestMapping("/haha")
public class RequestMappingText {
    //处理请求的方法
    @RequestMapping(value = "/handle01",method = RequestMethod.POST)
    public String RequestMappingText(){
        System.out.println("标注在类上的RequestMapping已经执行");
        return "success";
    }

    @RequestMapping(value = "/handle02",params = {"username"})
    public String param1(){
        System.out.println("指定参数username已经执行");
        return "success";
    }
    @RequestMapping(value = "/handle03",headers = {"User-Agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.36"})
    public String header(){
        System.out.println("指定参数header已经执行");
        return "success";
    }
}
