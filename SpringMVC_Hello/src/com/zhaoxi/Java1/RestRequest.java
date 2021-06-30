package com.zhaoxi.Java1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author shkstart
 * @create2021-01-169:55
 */
@Controller
public class RestRequest {
    //添加图书
    @RequestMapping(value = "/book",method = {RequestMethod.POST})
    public String addBook(){
        System.out.println("添加图书");
        return "success";
    }
    //删除图书
    @RequestMapping(value = "/book/{id}",method = {RequestMethod.DELETE})
    public String deleteBook(@PathVariable("id") Integer id){
        System.out.println("删除了"+id+"图书");
        return "success";
    }
    //更新图书
    @RequestMapping(value = "/book/{id}",method = {RequestMethod.PUT})
    public String updateBook(@PathVariable("id") Integer id){
        System.out.println("更新"+id+"图书");
        return "success";
    }
    //查询图书
    @RequestMapping(value = "/book/{id}",method = {RequestMethod.GET})
    public String getBook(@PathVariable("id") Integer id){
        System.out.println("查询"+id+"图书");
        return "success";
    }
}
