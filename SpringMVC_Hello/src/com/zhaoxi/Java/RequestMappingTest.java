package com.zhaoxi.Java;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author shkstart
 * @create2021-01-1511:01
 */
@Controller
public class RequestMappingTest {
//    //精确匹配
//    @RequestMapping("/antTest01")
//    public String antTest02(){
//        System.out.println("精确匹配");
//        return "success";
//    }
    //?号模糊匹配
    @RequestMapping("/antTest0?")
    public String antTest01(){
        System.out.println("?号模糊匹配");
        return "success";
    }
    //*：匹配一层路径
    @RequestMapping("/a/*/antTest01")
    public String antTest02(){
        System.out.println("*号模糊匹配");
        return "success";
    }
    @RequestMapping("/user/{id}")
    public String antTest03(@PathVariable("id")String id){
        System.out.println("路径上的占位符id:"+id);
        return "success";
    }
}
