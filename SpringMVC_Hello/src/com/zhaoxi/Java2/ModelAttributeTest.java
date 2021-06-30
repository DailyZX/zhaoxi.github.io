package com.zhaoxi.Java2;

import com.zhaoxi.Java2.pojo.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @author shkstart
 * @create2021-01-1717:38
 */
@Controller
public class ModelAttributeTest {
    //业务逻辑方法
    @RequestMapping("/updateBook")
    public String updateBook(@RequestParam(value="author")String author,
                             Map<String, Object> model,
                             HttpServletRequest request,
                             @ModelAttribute("haha")Book book
    ){
        Object haha = model.get("haha");
        //System.out.println("传入的model："+model.getClass());

        System.out.println("页面要提交过来的图书信息："+book);
        return "success";
    }


    //创建查询数据方法
    @ModelAttribute
    public void hahaMyModelAttribute(Map<String, Object> map){

        Book book = new Book(100, "西游记", "吴承恩", 98, 10, 98.98);
        System.out.println("数据库中查到的图书信息是："+book);
        map.put("haha", book);
        System.out.println("modelAttribute方法...查询了图书并给你保存起来了...他用的map的类型："+map.getClass());
    }
}
